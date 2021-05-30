package kr.or.kh_3;

public class Class1 extends AbstractClassEx {

	public Class1() {
		System.out.println("Class constructor");
	}
	
	public Class1(int i , String s) {
	 
		super(i,s);
	}
	@Override
	public void fun2() {
		System.out.println("--fun2()start--");
	}
	
}
