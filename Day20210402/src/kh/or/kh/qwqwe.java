package kh.or.kh;

import java.util.Scanner;

public class qwqwe {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int number[] = new int[5];

		for (int i = 0; i < number.length; i++) {
			System.out.print((i+1)+"  번째 숫자 입력 :");
			
			number[i] = scan.nextInt();
		}
		System.out.print("정렬된 결과"+":");

		for (int i = 0; i < number.length; i++) {
			for (int j = 0; j < number.length - 1 - i; j++) {
				if (number[j] > number[j + 1]) {
					int temp = number[j + 1];
					number[j + 1] = number[j];
					number[j] = temp;
				}

			}
			
			System.out.print( number[i]);
			
		}
		
		System.out.println(":");
		System.out.println("첫번째 숫자와 마지막 숫자의 곱 :"+(number[0]*number[4]));

	}

}
