package kr.or.kh;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {
		FileWriter fw = null;
		String msg = "FileWriter테스트 입니다.";
		try {
			fw = new FileWriter("C\\KH\\fileWriter.txt.",true);
			fw.write(msg);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
