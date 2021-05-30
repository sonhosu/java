package 문제모음1;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		int n;
		int k = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 입력");
		n=scan.nextInt();
		
		for(int i=0; i<n; i++) {  
			k+=i;
			
			System.out.println(k);
		}
	}

}
