package kh.or.kh;

public class MethodOverloading {
	
	
	public static void main(String[] args) {
		
		Myclass2 m = new Myclass2();
		
		
		System.out.println(m.plus(4, 5));
		
		System.out.println(m.plus(1, 2, 3));
		
		System.out.println(m.plus("자바", "언어"));
	}
}
