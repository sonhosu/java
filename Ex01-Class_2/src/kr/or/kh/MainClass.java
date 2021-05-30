package kr.or.kh;

public class MainClass {

	public static void main(String[] args) {

		OutClass oc = new OutClass();

		OutClass.InnerClass Ic = oc.new InnerClass();

		new AnonymousClass() {

			@Override
			public void method() {

				System.out.println("AnonymousClass Start");
			}

		}.method();
	}
}
