package 문제모음1;

import java.util.Scanner;

public class 홀짝판별 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		if(input%2==0) {
			System.out.println("짝수입니다.");
		}else {
			System.out.println("홀수입니다.");
			
		}
		

	}

}
