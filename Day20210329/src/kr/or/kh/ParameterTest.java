package kr.or.kh;

public class ParameterTest {

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main():x="d.x);
		change(d.x);
		System.out.println("main():x="d.x);

	}

}
