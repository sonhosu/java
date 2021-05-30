package kr.or.kh.function;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class HaksaProject {
   //1.로드,연결,준비(공간준비,문장준비),실행
	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
        //ArrayList<HashMap<String,String>> haksaList = new ArrayList<HashMap<String,String>>();
        while(true) {
        	System.out.println("======메뉴 선택======");
    		System.out.println("1.등록");
    		System.out.println("2.찾기");
    		System.out.println("3.삭제");
    		System.out.println("4.전체출력");
    		System.out.println("5.수정");
    		System.out.println("-----------------");
    		System.out.println("0.종료");
    		System.out.println("번호를 선택해 주세요...");
    		int cnt = input.nextInt();
    		if(cnt<0||cnt>5) {
    			System.out.println("에러");
    		}
    		Connection conn=null;
    		Statement stmt=null;
    		ResultSet rs=null;
    		if(cnt==1) {//등록
    			HaksaFunction.register(cnt, input, conn, stmt);
    		}//등록
    		else if(cnt==2) {//찾기
    			HaksaFunction.search(input, conn, stmt, rs, cnt);
				System.out.println("계속하시려면1,종료하시려면0을 입력해 주세요");
				cnt = input.nextInt();
				if(cnt<0||cnt>1) {
					System.out.println("에러");
				}
				if(cnt==1) {
					continue;
				}else {
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
				}
    		}//찾기
    		else if(cnt==3) {//삭제
    			HaksaFunction.delete(input, conn, stmt, cnt);
    			System.out.println("계속하시려면1,종료하시려면0을 입력해 주세요");
				cnt = input.nextInt();
				if(cnt<0||cnt>1) {
					System.out.println("에러");
				}
				if(cnt==1) {
					continue;
				}else {
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
				}
    		}//삭제
    		else if(cnt==4) {//전체출력
    			HaksaFunction.list(conn, stmt, rs);
    			System.out.println("계속하시려면1,종료하시려면0을 입력해 주세요");
				cnt = input.nextInt();
				if(cnt<0||cnt>1) {
					System.out.println("에러");
				}
				if(cnt==1) {
					continue;
				}else {
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
				}
    		}//전체출력
    		else if(cnt==0) {//종료
    			System.out.println("프로그램을종료합니다.");
    			System.exit(0);
    		}//종료
    		else if(cnt==5) {//수정    			
    			String result=HaksaFunction.update(conn, input, stmt, rs, cnt);
				if(result.equals("continue")) {
					continue;
				}
				
    		}//수정
        }
	}

}
