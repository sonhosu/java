package kr.or.kh;

public class Overload {

	public void method1(int a) {
		System.out.println("첫번째");
	}

	public void method1(int a, int b) {
		System.out.println("두번쨰");
	}

	public void method1(int a, int b, int c) {
		System.out.println("세번째");
	}

	public void method1(int a, String str) {
		System.out.println("네번째");
	}

	public void method1(String str, String k) {
		System.out.println("다섯번째");
	}

	public static void main(String[] args) {

		Overload ov = new Overload();

		

		ov.method1("hello" , "java"  );

		

	}

}
