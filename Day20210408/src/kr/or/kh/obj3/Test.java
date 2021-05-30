package kr.or.kh.obj3;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		
		ArrayList<String> Haksa = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		
		System.out.println("---------메뉴선택----------");
		System.out.println("1.등록");
		System.out.println("2.찾기");
		System.out.println("3.삭제");
		System.out.println("4.전체출력");
		System.out.println("-------------------------");
		System.out.println("0.종료");
		System.out.println("번호를 입력해주세요");
		
		int cnt = input.nextInt();
		
		if(cnt == 1) {
			System.out.println("등록을 시작합니다. 선택해주세요");
			System.out.println("1.학생");
			if(cnt ==1) {
				System.out.println("학생등록을 시작합니다.");
				
			}
			System.out.println("2.교수");
			System.out.println("3관리자");
			
		}else if(cnt == 2) {
			System.out.println("찾기를 시작합니다. ");
		}else if(cnt == 3) {
			System.out.println("삭제를 시작합니다.");
		}else if(cnt == 4) {
			System.out.println("전체출력을 시작합니다.");
		}else {
			System.out.println("프로그램을 종료합니다.");
		}
		
		public TestIfo() {
			
		}
		
		
		
		
		
	}
}
