package kr.or.kh;

public class StringBufferEx {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("JAVA");
		
		sb.append("--World");		
		System.out.println(sb);
		
		sb.insert(1,"Hi" );
		System.out.println(sb);
		
	}
}
