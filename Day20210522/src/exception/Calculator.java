package exception;

public class Calculator {
	private int x;
	private int y;

	public Calculator(int i, int j) {
		this.x=x;
		this.y=y;
	}

	public static int add(int x, int y) throws 천을_넘는_예외1 {
		int result = x + y;
		
		if(result>1000) {
		throw new 천을_넘는_예외1();
		}
		
		return result;
	}

	public static int sub(int x, int y) {

		int result = x - y;
		return result;
	}

	public static int multi(int x, int y) {
		int result = x * y;
		return result;
	}

	public int add() {
		return x+y;
		
	}
}
