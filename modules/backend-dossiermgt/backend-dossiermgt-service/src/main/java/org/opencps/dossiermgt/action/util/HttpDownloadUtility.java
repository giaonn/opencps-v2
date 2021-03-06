package org.opencps.dossiermgt.action.util;

import com.liferay.petra.string.StringPool;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.ws.rs.core.HttpHeaders;

/**
 * A utility that downloads a file from a URL.
 * @author www.codejava.net
 *
 */
public class HttpDownloadUtility {
	private static final int BUFFER_SIZE = 4096;
	private static final String FILE_NAME_EQUAL = "filename=";
	/**
	 * Downloads a file from a URL
	 * @param fileURL HTTP URL of the file to be downloaded
	 * @param saveDir path of the directory to save the file
	 * @throws IOException
	 */
	public static void downloadFile(String fileURL, String saveDir)
			throws IOException {
		URL url = new URL(fileURL);
		HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
		int responseCode = httpConn.getResponseCode();

		// always check HTTP response code first
		if (responseCode == HttpURLConnection.HTTP_OK) {
			String fileName = StringPool.BLANK;
			String disposition = httpConn.getHeaderField(HttpHeaders.CONTENT_DISPOSITION);
//			String contentType = httpConn.getContentType();
//			int contentLength = httpConn.getContentLength();

			if (disposition != null) {
				// extracts file name from header field
				int index = disposition.indexOf(FILE_NAME_EQUAL);
				if (index > 0) {
					fileName = disposition.substring(index + 10,
							disposition.length() - 1);
				}
			} else {
				// extracts file name from URL
				fileName = fileURL.substring(fileURL.lastIndexOf(StringPool.SLASH) + 1,
						fileURL.length());
			}

//			System.out.println("Content-Type = " + contentType);
//			System.out.println("Content-Disposition = " + disposition);
//			System.out.println("Content-Length = " + contentLength);
//			System.out.println("fileName = " + fileName);

			// opens input stream from the HTTP connection
			InputStream inputStream = httpConn.getInputStream();
			String saveFilePath = saveDir + File.separator + fileName;
			
			// opens an output stream to save into file
			FileOutputStream outputStream = null; 
			try {	
				outputStream = new FileOutputStream(saveFilePath);
				int bytesRead = -1;
				byte[] buffer = new byte[BUFFER_SIZE];
				while ((bytesRead = inputStream.read(buffer)) != -1) {
					outputStream.write(buffer, 0, bytesRead);
				}
			}
			catch (Exception e) {
				throw new IOException(e);
			}
			finally  {
				if (outputStream != null)
					outputStream.close();
				if (inputStream != null)
					inputStream.close();
			}
//			System.out.println("File downloaded");
		} else {
//			System.out.println("No file to download. Server replied HTTP code: " + responseCode);
		}
		httpConn.disconnect();
	}
}