package cn.org.rapid_framework.tools.google_wiki_to_html.ext.ant;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;

import cn.org.rapid_framework.tools.google_wiki_to_html.GoogleWiki;

public class GoogleWikiTask extends Task{
	private String googleProjectName;
	private String downloadFolder;
	private String downloadResourceExtensions;
	private boolean failOnError = true;
	
	public void setGoogleProjectName(String googleProjectName) {
		this.googleProjectName = googleProjectName;
	}

	public void setDownloadFolder(String downloadFolder) {
		this.downloadFolder = downloadFolder;
	}

	public void setDownloadResourceExtensions(String downloadResourceExtensions) {
		this.downloadResourceExtensions = downloadResourceExtensions;
	}

	@Override
	public void execute() throws BuildException {
		try {
			GoogleWiki wiki = new GoogleWiki(googleProjectName,downloadFolder,downloadResourceExtensions);
			wiki.execute();
		}catch(Exception e) {
			if(failOnError) {
				throw new BuildException(String.format("download google wiki occer exception,googleProjectName:%s, cause:%s",googleProjectName,e),e);
			}
		}
	}
	
}
