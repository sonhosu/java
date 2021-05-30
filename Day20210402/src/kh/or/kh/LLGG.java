package kh.or.kh;

import java.util.Scanner;

public class LLGG {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double a = 0;
		double b=  0;
		
		for(int i = 0; i<101; i++) {
		a = scan.nextInt();
		String c = scan.next();
		b = scan.nextInt();
		
		
		
		if(c.equals("+")) {
			
			System.out.println(a+b);
			
		}else if(c.equals("-")) {
			
			System.out.println(a-b);
			
		}else if(c.equals("*")) {
			
			System.out.println(a*b);
			
		}else {
			
			System.out.println(a/b);
		}
		
		System.out.println("숫자 다시입력");
		
		}
	}

}
