package kr.or.kh;

public class Test {

	public static int a=5;
	public static void main(String[] args) {
		int b = 2;
		cal(b);
		cal(b);
		System.out.printf("%d,%d\n",a,b);
		
	}

	static void cal(int b) {
		if (b<a)
			a-=3;
		else 
			b+=3;
	}
}
