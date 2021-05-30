package kh.or.kh;

public class InnerExam2 {
	
	static class Cal{
		int value = 0;
		public void plus() {
			value++;
		}
	}
	public static void main(String[] args) {
		InnerExam2.Cal cal = new InnerExam2.Cal();  //static 클래스는 생성자가 필요없다.
		cal.plus();
		System.out.println(cal.value);

	}

}
