package kr.or.kh.obj2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HaksaProject {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> Haksa = new ArrayList();
		
		
		System.out.println("==================");
		System.out.println("학사 관리 프로그램");
		System.out.println("1.등록");
		System.out.println("2.수정");
		System.out.println("3.삭제");
		System.out.println("4.전체출력");
		System.out.println("5.종료");
		System.out.println("==================");
		
		int choice; 
		choice = sc.nextInt() ;
		
		if( choice == 1) {
			
			System.out.println("등록을 시작합니다.");
			System.out.println("===============");
			System.out.println("메뉴선택");
			System.out.println("1.학생");
			System.out.println("2.교수");
			System.out.println("3.관리자");
			System.out.println("4.이전메뉴");
			
			choice = sc.nextInt();
			if(choice == 1) {
				Map<String, String> map = new HashMap();
				
				System.out.print("이름:");
				String name = sc.next();
				
				System.out.print("나이:");
				String age = sc.next();
				
				System.out.print("학번:");
				String number = sc.next();
				
				map.put("이름" ,name );
				map.put("나이" ,age );
				map.put("학번" ,number );
			}
			
			
		}else if(choice ==2) {
			
		}else if(choice ==3) {
			
		}else if(choice ==4) {
			Map<String, String> map = new HashMap();
			
			
		Set<String> keys =map.keySet();
		Iterator<String> iter = keys.iterator();
		System.out.println(iter);
		
		}else {
			System.out.println("종료");
			return;
		}

	}

}
