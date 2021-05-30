package kh.or.kh;

public class MyClass {

	// 메소드 선언방법	
	//public 리턴타입 메소드명 (매개변수) {구현}   메소드는 리턴타입의 유무 매개변수의 유무를 잘 따져야됨
		
		
	public void method1() {
		System.out.println("method1 이 출력됨");	 //리턴타입도 없고 매개변수도 없을때
	}  
	
	public void method2(int x) {
		System.out.println(x+"을 이용한 metho2 출력");
	}
	
	public int method3() {
		System.out.println("method3 실행");
		return 10;  //정수형 10을 임의로 리턴
	}	
	public void method4 (int x , int y){
		System.out.println(x+y+"method4 실행");
	}
	
	public int method5(int y) {
		System.out.println(y+"를 이용한 method5를 실행");
		
		return 2*y;
		
	}
}
