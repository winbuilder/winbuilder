package cn.org.rapid_framework.tools.google_wiki_to_html;

import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


import java.util.Date;
import java.text.SimpleDateFormat;

import cn.org.rapid_framework.tools.google_wiki_to_html.util.FileUtils;
import cn.org.rapid_framework.tools.google_wiki_to_html.util.FilenameUtils;
import cn.org.rapid_framework.tools.google_wiki_to_html.util.IOUtils;
import cn.org.rapid_framework.tools.google_wiki_to_html.util.MD5Utils;
import cn.org.rapid_framework.tools.google_wiki_to_html.util.URLDownloader;

/**
 * @author badqiu
 */
public class GoogleWiki {
	public static final String IMG_EXTENSIONS = "jpg|jpeg|gif|png|bmp";
	public String downloadResourceExtensions = "js|css";
	
	String projectHomeURL = "http://code.google.com/p/%s/";
	String wikiDownloadBaseURL = "http://code.google.com/p/%s/wiki/";
	String wikiListURL = "http://%s.googlecode.com/svn/wiki/";
	public String outputFolder = "d:/google-wiki-html/";
	String wikiLinkPrefix = "/p/%s/wiki/";
	String projectName = null;
/*	Added to allow only specific content to be retrieved */
	String contentSuffix = "?show=%s";
	
	public GoogleWiki(String _projectName,String _outputFolder,String _downloadResourceExtensions, String _contentToShow) throws IOException {
		this.projectName = _projectName;
		projectHomeURL = String.format(projectHomeURL, projectName);
		wikiDownloadBaseURL = String.format(wikiDownloadBaseURL, projectName);
		wikiListURL = String.format(wikiListURL, projectName);
		wikiLinkPrefix = String.format(wikiLinkPrefix, projectName);
		this.outputFolder = _outputFolder == null ? new File(this.outputFolder,projectName).getAbsolutePath() : _outputFolder;

		//added to get only specific content...can be over-ridden on command line
                contentSuffix = _contentToShow == null ? String.format(contentSuffix, "content") : String.format(contentSuffix, _contentToShow);

		if(_downloadResourceExtensions == null) {
			downloadResourceExtensions = downloadResourceExtensions+"|"+IMG_EXTENSIONS;
		}else {
			downloadResourceExtensions = _downloadResourceExtensions;
		}
		new File(this.outputFolder).mkdirs();
	}
	
	public void execute() throws IOException {
		
		List<String> wikiList = getWikiList();
		generateIndexHTML(wikiList);
		for(int i = 0; i < wikiList.size(); i++) {
			String wiki = wikiList.get(i);
			try {
				System.out.println(getDownloadInfo(wikiList, i, wiki));
				String content = downloadWiki(wiki);
				content = downloadContentResources(content);
				content = processWikiContent(content);
				saveWikiAsHtml(wiki,content);
				downloadWikiSource(wiki);
			}catch(Exception e) {
				System.err.println("process wiki error:"+wiki+" cause:"+e);
			}
		}

	}

	private void downloadWikiSource(String wiki) throws MalformedURLException, IOException {
		ByteArrayOutputStream content = URLDownloader.downloadAsByteArrayOutputStream(new URL(wikiListURL+"/"+wiki+".wiki"));
		FileOutputStream output = null;
		try {
			File outputFile = new File(outputFolder,"wiki/"+wiki+".wiki");
			outputFile.getParentFile().mkdirs();
			output = new FileOutputStream(outputFile);
			IOUtils.write(content.toByteArray(), output);
		}finally {
			IOUtils.closeQuietly(output);
		}
	}

	private void generateIndexHTML(List<String> wikis)
			throws UnsupportedEncodingException, FileNotFoundException,
			IOException {

		Date dateNow = new Date ();
		SimpleDateFormat dateformatYYYYMMDD = new SimpleDateFormat("yyyy-MM-dd");
 		StringBuilder nowYYYYMMDD = new StringBuilder( dateformatYYYYMMDD.format( dateNow ) );

		BufferedWriter indexHtml = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(outputFolder,"index.html")),"UTF-8"));
		indexHtml.write(String.format("<html><head><title>wiki of %s</title><meta http-equiv='Content-Type' content='text/html; charset=UTF-8'></head><body>",projectName));
		indexHtml.write(String.format("<h1>Index of Files</h1><h2>Google Code Project: <a href='%s'>%s<a><br>Generated: '%s'</h2>", projectHomeURL,projectName,nowYYYYMMDD));
		for(String wiki : wikis) {
			indexHtml.write(String.format("<li><a href='%s.html'>%s</a></li>",wiki,wiki));
		}
		indexHtml.write("</body><html>");
		indexHtml.close();
	}

	private String getDownloadInfo(List<String> wikis, int i, String wiki)
			throws MalformedURLException {
		double percent = (i+1.0)/wikis.size() * 100;
		String percentInfo = String.format("%.1f", percent) + "% "+(i+1)+"/"+wikis.size();
		String downloadInfo = percentInfo+" download wiki:"+getDownloadWikiURL(wiki)+"  ==> "+getOutputHtmlFile(wiki);
		return downloadInfo;
	}
	
	private static Pattern wikiListPattern = Pattern.compile(">([\\w_]+\\.wiki)</a>",Pattern.MULTILINE|Pattern.CASE_INSENSITIVE);
	private List<String> getWikiList() throws IOException {
		URL downloadURL = new URL(wikiListURL);
		Reader r = new InputStreamReader(downloadURL.openStream(),"UTF-8");
		String str = IOUtils.toString(r);
		Matcher m = wikiListPattern.matcher(str);
		List results = new ArrayList();
		while(m.find()) {
			String group = m.group(1);
			results.add(FilenameUtils.removeExtension(group));
		}
		return results;
	}
	
	private String downloadWiki(String wiki) throws IOException {
		URL downloadURL = getDownloadWikiURL(wiki+contentSuffix);
		return URLDownloader.downloadAsString(downloadURL, "UTF-8");
	}

	private URL getDownloadWikiURL(String wiki) throws MalformedURLException {
		return new URL(wikiDownloadBaseURL+wiki);
	}


	private String processWikiContent(String content) throws IOException {
		
		//content = StringUtils.remove(content, removedContent);
		content = appendHtmlExtensionToWikiLink(content);
		//content = insertSomeTagToHeadTag(content);
		content = removeAuthorInfo(content);
		content = removeSideBarColapse(content);
		content = removeWikiHeader(content);
		return content;
	}

	
	/*
	 * append html extension,example: roadmap => roadmap.html  -- Was a BUG here for internal anchors
	 */
	private String appendHtmlExtensionToWikiLink(String content) {
                String[] MyLocaltemp;		//added to split filename an internal anchor BEFORE we add the html extension
                String delimiter = "#";
		StringBuffer newContent = new StringBuffer();
		Pattern pattern = Pattern.compile("href=['\"]("+wikiLinkPrefix+")([^\\s]*)['\"]",Pattern.MULTILINE|Pattern.CASE_INSENSITIVE);
		Matcher m = pattern.matcher(content);
		while(m.find()) {
			String wikiLinkPrefix = m.group(1);
			String wiki = m.group(2);
			MyLocaltemp = wiki.split(delimiter);

/* DEBUG - print substrings */ 
/*
	System.out.println(MyLocaltemp.length);
	for(int i =0; i < MyLocaltemp.length ; i++) System.out.println(MyLocaltemp[i]);
*/
			if (MyLocaltemp.length >1)
				m.appendReplacement(newContent,"href=\""+MyLocaltemp[0]+".html"+"#"+MyLocaltemp[1]+"\"");
			else
				m.appendReplacement(newContent,"href=\""+MyLocaltemp[0]+".html"+"\"");

		}
		m.appendTail(newContent).toString();
		content = newContent.toString();
		return content;
	}

	//remove the author <div> section />
	private String removeAuthorInfo(String content) {

		int indexOfAuth = content.indexOf("<div id=\"wikiauthor\" ");
		if ( indexOfAuth < 0) return content;

		String before = content.substring(0,indexOfAuth);
		String after1 = content.substring(indexOfAuth,content.length());
		int indexOfDivEnd = after1.indexOf("</div>");
		String after2 = after1.substring(indexOfDivEnd+6,after1.length());
		content = before+after2;
		return content;
	}


	//remove the wikiheader <div> section />
	private String removeWikiHeader(String content) {

		int indexOfWikiHeader = content.indexOf("<div id=\"wikiheader\">");
		if ( indexOfWikiHeader < 0) return content;

		String before = content.substring(0,indexOfWikiHeader);
		String after1 = content.substring(indexOfWikiHeader,content.length());
		int indexOfDivEnd = after1.indexOf("</div>");
		String after2 = after1.substring(indexOfDivEnd+6,after1.length());
		content = before+after2;
		return content;
	}




	//remove the SideBarColapse and expand <div> sections />
	private String removeSideBarColapse(String content) {

		int indexOfHide = content.indexOf("title=\"Hide sidebar\"");
		if ( indexOfHide < 0) return content;

		String before = content.substring(0,indexOfHide);
		String after1 = content.substring(indexOfHide,content.length());
		int indexOfHideEnd = after1.indexOf("</b>");
		String after2 = after1.substring(indexOfHideEnd+4,after1.length());

		int indexOfShow = after2.indexOf("title=\"Show sidebar\"");
		String before3 = after2.substring(0,indexOfShow);
		String after3 = after2.substring(indexOfShow,after2.length());
		int indexOfShowEnd = after3.indexOf("</b>");
		String after4 = after3.substring(indexOfShowEnd+4,after3.length());

		content = before+before3+after4;
		return content;
	}



	//insert <base href='http://code.google.com' />
	private String insertSomeTagToHeadTag(String content) {
		int indexOfHead = content.indexOf("<head>");
		String before = content.substring(0,indexOfHead+6);
		String after = content.substring(indexOfHead+6,content.length());
		content = before+"<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>"+after;
		return content;
	}
	
	private String downloadContentResources(String content) {
		Pattern downloadResourcePattern = Pattern.compile("http://[^\\s]+\\.("+downloadResourceExtensions+")",Pattern.MULTILINE|Pattern.CASE_INSENSITIVE);
		
		Matcher m = downloadResourcePattern.matcher(content);
		StringBuffer newContent = new StringBuffer();
		while(m.find()) {
			String http = m.group();
			try {
				URL url = new URL(http);
				if(!URLDownloader.isDownloaded(url))
					System.out.println("\tdownload resource:"+http);
				ByteArrayOutputStream resourceContent = URLDownloader.downloadAsByteArrayOutputStream(url);
				File resourceDir = new File(outputFolder,"resource");
				resourceDir.mkdirs();
				
				String filename = "url_md5_"+MD5Utils.getMD5(http)+"_"+ new File(url.getFile()).getName();
				FileUtils.writeByteArrayToFile(new File(resourceDir,filename), resourceContent.toByteArray());
				
				m.appendReplacement(newContent,"resource/"+filename);
			}catch(IOException e) {
				System.out.println("[ERROR] download resource:"+http);
			}
		}
		return m.appendTail(newContent).toString();
	}

	private void saveWikiAsHtml(String wiki, String content) throws IOException {
		OutputStreamWriter output = null;
		try {
			File outputHtml = getOutputHtmlFile(wiki);
			output = new OutputStreamWriter(new FileOutputStream(outputHtml),"UTF-8");
			IOUtils.write(content, output);
		}finally {
			IOUtils.closeQuietly(output);
		}
	}

	private File getOutputHtmlFile(String wiki) {
		return new File(outputFolder,wiki+".html");
	}

}
