package kh.or.kh;

public class BusExam {

	public static void main(String[] args) {
		
		Car c = new Bus();
		c.run();
		
		Bus bus = (Bus)c;
		bus.run();
		bus.ppangppang();     // 부모가 자식을 가리킬수는 있으나 자식이 부모를 가리키려면 형변환을 해야함
		
		
		
	}

}
