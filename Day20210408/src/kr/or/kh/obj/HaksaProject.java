package kr.or.kh.obj;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class HaksaProject {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<HashMap<String,String>> haksaList = new ArrayList<HashMap<String,String>>(); 
		Haksa haksaObj = new Haksa();
		while(true) {//반복문
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
        	System.out.println("음수이거나5이상이면에러입니다.");
        }
        if(cnt==1) {
        	haksaObj.register();
        	if(cnt==4) {
        		continue;
        	}
        }else if(cnt==2) {
        	haksaObj.search();
        	System.out.println("계속하시려면1,종료하시려면0을 입력해주세요.");
        	int bunho = input.nextInt();
        	if(bunho<0||bunho>1) {
        		System.out.println("음수이거나1이상이면에러입니다.");
        	}
        	if(bunho==1) {
        		continue;
        	}else {
        		System.out.println("프로그램을종료합니다.");
        		System.exit(0);
        	}
        }else if(cnt==3) {
        	haksaObj.delete();
            System.out.println("계속하시려면1,종료하시려면0을입력해주세요.");
            int bunho = input.nextInt();
            if(bunho<0||bunho>1) {
        		System.out.println("음수이거나1이상이면에러입니다.");
        	}
            if(bunho==1) {
            	continue;
            }else {
            	System.out.println("프로그램을종료합니다.");
            	System.exit(0);
            }
        	
        }else if(cnt==4) {
        	haksaObj.list();
        	System.out.println("계속하시려면1,종료하시려면0을 입력해주세요");
        	int bunho = input.nextInt();
        	if(bunho<0||bunho>1) {
        		System.out.println("음수이거나1이상이면에러입니다.");
        	}
        	if(bunho==1) {
        		continue;
        	}else {
        		System.out.println("프로그램을종료합니다.");
        		System.exit(0);
        	}        	        
        }else if(cnt==0) {
        	System.out.println("프로그램종료");
        	System.exit(0);
        }else if(cnt==5) {
        	haksaObj.update();
        	System.out.println("계속하시려면1,종료하시면0을 입력해주세요.");
        	int bunho = input.nextInt();
        	if(bunho<0||bunho>1) {
        		System.out.println("음수이거나1이상이면에러입니다.");
        	}
        	if(bunho==1) {
        		continue;
        	}else {
        		System.out.println("프로그램을종료합니다.");
        		System.exit(0);
        	}
        }
	  }//반복문
	}
}
