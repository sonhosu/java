package kr.or.kh;
import java.util.Scanner;
public class Test1 {
	public static int displayMenu() {
		Scanner input = new Scanner(System.in);
		System.out.println("1.입력 2.삭제 3.정렬 4.종료");
		int menu = input.nextInt();
		return menu;
	}
	
	public static void main(String[] args) {
		while(true) {
		switch(displayMenu()) {
			case 1:
			System.out.println("입력");
			break;
		
			case 2:
				System.out.println("삭제");
			break;
			
			case 3:
				System.out.println("정렬");
			break;
			
			case 4:
				System.out.println("종료");
				System.exit(0);
			break;
		}
		}
	}

}
