package kr.or.kh;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest3 {

	public static void main(String[] args) {
		
		FileWriter fileW = null;
		BufferedWriter buW = null;
		
		try {
			fileW = new FileWriter("C\\kh\\bufferWriter3.txt");
			buW= new BufferedWriter(fileW,4);
			buW.write("여러라인출력예제 1라인");
			buW.newLine();
			buW.write("여러라인 출력예제 2라인");
			buW.newLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				buW.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		

	}

}
