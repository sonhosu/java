package kr.or.kh;

import java.util.Scanner;

public class HaksaProject {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[][] student = new String[2][3];
		String[][] professor = new String[2][3];
		String[][] manager = new String[2][3];
		while(true) {//반복문
		System.out.println("======메뉴 선택======");
		System.out.println("1.등록");
		System.out.println("2.찾기");
		System.out.println("3.삭제");
		System.out.println("4.전체출력");
		System.out.println("-----------------");
		System.out.println("0.종료");
		System.out.println("번호를 선택해 주세요...");
        int cnt = input.nextInt();
        if(cnt==1) {
        	System.out.println("등록");
        	System.out.println("=======메뉴 선택======");
        	System.out.println("1.학생");
        	System.out.println("2.교수");
        	System.out.println("3.관리자");
        	System.out.println("4.이전메뉴");
        	System.out.println("번호를 선택해 주세요..");
        	cnt = input.nextInt();
        	if(cnt==1) {
        		int bunho=0;
        		for(int i=0;i<student.length;i++)
        		{        		    
        		System.out.println(++bunho+"번학생등록");        		
        		System.out.println("나이:");
        		student[i][0]=input.next();
        		System.out.println("이름:");
        		student[i][1]=input.next();
        		System.out.println("학번:");
        		student[i][2]=input.next();
        		}        	
        	}else if(cnt==2) {
        		int bunho=0;
        		for(int i=0;i<professor.length;i++)
        		{        		            		
        		System.out.println(++bunho+"번교수등록");
        		System.out.println("나이:");
        		professor[i][0]=input.next();
        		System.out.println("이름:");
        		professor[i][1]=input.next();
        		System.out.println("과목:");
        		professor[i][2]=input.next();
        		}
        	}else if(cnt==3) {
        		int bunho=0;
        		for(int i=0;i<manager.length;i++)
        		{        		            		
        		System.out.println(++bunho+"번관리자등록");
        		System.out.println("나이:");
        		manager[i][0]=input.next();
        		System.out.println("이름:");
        		manager[i][1]=input.next();
        		System.out.println("부서:");
        		manager[i][2]=input.next();
        		}
        	}else if(cnt==4) {
        		continue;
        	}
        }else if(cnt==2) {
        	System.out.println("찾기");
        }else if(cnt==3) {
        	System.out.println("삭제");
        }else if(cnt==4) {
        	System.out.println("전체출력");
        	System.out.println("===학생전체출력====");
        	for(int i=0;i<student.length;i++) {        	
        			System.out.print("이름:\t"+student[i][1]+" ");
        			System.out.print("나이:\t"+student[i][0]+" ");
        			System.out.print("학번:\t"+student[i][2]+"\n");
        		}        	
        	System.out.println("===교수전체출력====");
        	for(int i=0;i<professor.length;i++) {        	
        			System.out.print("이름:\t"+professor[i][1]+" ");
        			System.out.print("나이:\t"+professor[i][0]+" ");
        			System.out.print("과목:\t"+professor[i][2]+"\n");
        		}
        	System.out.println("===관리자전체출력====");
        	for(int i=0;i<manager.length;i++) {        	
        			System.out.print("이름:\t"+manager[i][1]);
        			System.out.print("나이:\t"+manager[i][0]);
        			System.out.print("부서:\t"+manager[i][2]+"\n");
        		}
        }else if(cnt==0) {
        	System.out.println("프로그램종료");
        	System.exit(0);
        }
	  }//반복문
	}

}
