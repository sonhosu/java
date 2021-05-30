package kr.or.kh;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest1 {

	public static void main(String[] args) {
		FileWriter fileW = null;
		BufferedWriter buw = null;
		try {
			fileW = new FileWriter("C:\\kh\\bufferWriter.txt");
			buw = new BufferedWriter(fileW,4);
			buw.write('A');
			buw.write('B');
			buw.write('C');
			buw.write('D');
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				buw.close();
			} catch (IOException e) {
				// TODO: handle exception
			}
		}

	}

}
