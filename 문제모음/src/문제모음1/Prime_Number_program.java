package 문제모음1;

import java.util.Scanner;

public class Prime_Number_program {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수입력:");
		int input=scan.nextInt();
		
	
			if(input%2==0) {
				System.out.println("false");
				
				
			}if(input%2!=0) {
				System.out.println("true");
			}
		

	}

}
