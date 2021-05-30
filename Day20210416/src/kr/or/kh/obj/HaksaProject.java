package kr.or.kh.obj;

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
         Register registerObj = new Register();
         Search searchObj = new Search();
         Delete deleteObj = new Delete();
         List listObj = new List();
         Update updateObj = new Update();
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
    			registerObj.register();
    		}//등록
    		else if(cnt==2) {//찾기
    			searchObj.search();
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
    			deleteObj.delete();
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
    			listObj.list();
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
    			String result=updateObj.update();
				if(result.equals("continue")) {
					continue;
				}
				
    		}//수정
        }
	}

}
