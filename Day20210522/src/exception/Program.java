package exception;

public class Program {

	public static void main(String[] args) throws 천을_넘는_예외1{
		Calculator cal = new Calculator(3,4);
		int result=0;
	
		try {
		Calculator.add(3, 5);
		}catch(천을_넘는_예외1 e) {
			
			
		}
		System.out.printf("result: %d\n",result);
	}

}
