package cn.org.rapid_framework.tools.google_wiki_to_html;



/**
 * @author badqiu
 */
public class GoogleWikiDownloaderMain {
	
	public static void main(String[] args) throws Exception {
		if(args.length == 0) {
			System.out.println("cmd: google_code_wiki_download <project_name> [download_folder] [download_resource_extensions]");
			System.out.println("default values:");
			System.out.println("\tdownload_folder='d:/google_wiki_html/${project_name}'");
			System.out.println("\tdownload_resource_extensions='js|css|"+GoogleWiki.IMG_EXTENSIONS+"'");
			System.out.println("example: google_code_wiki_download rapid-framework");
			System.exit(1);
		}
		
		GoogleWiki downloader = null;
		if(args.length == 1) {
			downloader = new GoogleWiki(args[0],null,null,null);
		}else if(args.length == 2) {
			downloader = new GoogleWiki(args[0],args[1],null,null);
		}else if(args.length == 3) {
			downloader = new GoogleWiki(args[0],args[1],args[2],null);
		}else if(args.length == 4) {
			downloader = new GoogleWiki(args[0],args[1],args[2],args[3]);
		}
		downloader.execute();
		
		try {
			Runtime.getRuntime().exec("cmd.exe /c start "+downloader.outputFolder);
		}catch(Exception e) {
			//ignore
		}
	}

	
}