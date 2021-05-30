package 학사프로그램;

import java.util.ArrayList;
import java.util.HashMap;

import java.util.Scanner;
import java.util.Set;

//찾기 부터 시작  list 수정

public class Test {

	public static void main(String[] args) {
		ArrayList<HashMap<String, String>> haksaList = new ArrayList<HashMap<String, String>>();
		while (true) {
			System.out.println("====================");
			System.out.println("----메뉴선택----.");
			System.out.println("1.등록    ");
			
			System.out.println("2.찾기");
			System.out.println("3.삭제");
			System.out.println("4.수정");
			System.out.println("5.전체출력");
			System.out.println("====================");

			Scanner scan = new Scanner(System.in);
			int choice = scan.nextInt();
			String select = "";
			
			if (choice == 1) {

				HaksaFunction.Regiser ();

			}

			else if (choice == 2) {
				HaksaFunction.Search();
				
			}

			else if (choice == 3) {

				HaksaFunction.Delete();

			}

			else if (choice == 4) {
				HaksaFunction.Correct();

			}

			else if (choice == 5) {
				HaksaFunction.print();

			}
		}
	}

}
