package kh.or.kh;

public class CarExam {

	public static void main(String[] args) {
		//필드: 객체의 상태나 특징  //메소드: 객체의 행동 , 입력값을 받아 결과값을 배출 / 입력값 : 매개변수 , 인자 결과값: 리턴값
		Car c1 = new Car("소방차");
		Car c2 = new Car("구급차");
		
		
		c1.name = "소방차";
		c1.number= 1234;
		
		c2.name = "구급차";
		c2.number= 1111;
		
		
		System.out.println(c1.name);
		System.out.println(c1.number);
		
		System.out.println(c2.name);
		System.out.println(c2.number);

	}

}
