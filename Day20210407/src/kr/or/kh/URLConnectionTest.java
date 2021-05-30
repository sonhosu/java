package kr.or.kh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import sun.net.www.URLConnection;

public class URLConnectionTest {

	public static void main(String[] args) {
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		try {
			URL url = new URL("https://www.iei.or.kr/main/main.kh");
			URLConnection conn = url.openConnection();
			is = conn.getInputStream();
			isr = new InputStreamReader(is, UTF-8);
			br = new BufferedReader(isr);
			String str = "";
			String contentType = conn.getContentEncoding();
			System.out.println("contentType="+contentType);
			while((str = br.readLine())!=null)
				System.out.println(str);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
