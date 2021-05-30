package kh.or.kh;

public class StringExam {

	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = "hello";
		
		// 위와 아래는 다름 위에는 상수를 만들지만 아래는 힙영역에 인스턴스를 생성
		
		String str3 = new String("hello");
		String str4 = new String("hello");
	}

}
