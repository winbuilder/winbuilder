package cn.org.rapid_framework.tools.google_wiki_to_html.util;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author badqiu
 */
public class URLDownloader {
	public static String downloadAsString(URL url,String encoding) throws IOException {
		return downloadAsByteArrayOutputStream(url).toString(encoding);
	}
	
	static Map<URL,ByteArrayOutputStream> byteCache = new HashMap();
	public static ByteArrayOutputStream downloadAsByteArrayOutputStream(URL url) throws IOException {
		ByteArrayOutputStream result = byteCache.get(url);
		if(result == null) {
			URLConnection conn = url.openConnection();
			InputStream input = new BufferedInputStream(conn.getInputStream());
			result = new ByteArrayOutputStream(8192);
			try {
				IOUtils.copy(input,result);
			}finally {
				IOUtils.closeQuietly(input);
			}
			byteCache.put(url, result);
		}
		return result;
	}
	
	public static boolean isDownloaded(URL url) {
		return byteCache.containsKey(url);
	}
}
