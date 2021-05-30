package kh.or.kh;

import java.util.Scanner;

public class qweqwe {

	public static void main(String[] args) {

		int number[] = new int[5];

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < number.length; i++) {
			
			System.out.print((i+1)+"  번째 숫자 입력 :");
			number[i] = scan.nextInt();
			
		}
		System.out.print("정렬된 결과 :");

		for (int i = 0; i < number.length; i++) {

			for (int j = 0; j < number.length - i - 1; j++) {
				if (number[j] > number[j + 1]) {
					int temp = number[j + 1];
					number[j + 1] = number[j];
					number[j] = temp;

				}
				

			}
			

		}
		for (int i = 0; i < 5; i++) {
			System.out.print(number[i]);
		}
		System.out.println("\n"+"첫번째 숫자와 마지막 숫자의 곱 :"+(number[0]*number[4]));

	}
}
