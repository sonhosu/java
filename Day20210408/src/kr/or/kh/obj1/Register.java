package kr.or.kh.obj1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Register {
	private int cnt;
	private String age;
	private String irum;
	private String hakbun;
	private String subject;
	private String part;
	public static Scanner input;	
	public static ArrayList<HashMap<String,String>> haksaList;
	public Register() {
		
	}
	static {
		input = new Scanner(System.in);
		haksaList = new ArrayList<HashMap<String,String>>();
	}
	public void register() {
	   	System.out.println("등록");
	   	System.out.println("=======메뉴 선택======");
	   	System.out.println("1.학생");
	   	System.out.println("2.교수");
	   	System.out.println("3.관리자");
	   	System.out.println("4.이전메뉴");
	   	System.out.println("번호를 선택해 주세요..");
	   	cnt = input.nextInt();
	   	if(cnt<0||cnt>4) {
	   		System.out.println("음수이거나4이상이면에러입니다.");
	   	}        		
	   	if(cnt==1) {
	   		HashMap<String,String> haksaHash = new HashMap<String,String>();
	   		System.out.println("나이:");
	   		age = input.next();
	   		if(age==null||age=="") {
	   			System.out.println("나이가null이거나공백이다.");
	   		}
	   		System.out.println("이름:");
	   		irum = input.next();
	   		if(irum==null||irum=="") {
	   			System.out.println("이름이null이거나공백이다.");
	   		}
	   		System.out.println("학번:");
	   		hakbun = input.next();
	   		if(hakbun==null||hakbun=="") {
	   			System.out.println("학번이null이거나공백이다.");
	   		}
	   		haksaHash.put("age", age);
	   		haksaHash.put("irum", irum);
	   		haksaHash.put("hakbun", hakbun);
	   		haksaHash.put("gubun", "학생");
	   		haksaList.add(haksaHash);
	   		System.out.println("학생이등록되었습니다.");
	   		       	
	   	}else if(cnt==2) {
	   		HashMap<String,String> haksaHash = new HashMap<String,String>();
	   		System.out.println("나이:");
	   		age = input.next();
	   		if(age==null||age=="") {
	   			System.out.println("나이가null이거나공백이다.");
	   		}
	   		System.out.println("이름:");
	   		irum = input.next();
	   		if(irum==null||irum=="") {
	   			System.out.println("이름이null이거나공백이다.");
	   		}
	   		System.out.println("과목:");
	   		subject = input.next();
	   		if(subject==null||subject=="") {
	   			System.out.println("과목이null이거나공백이다.");
	   		}
	   		haksaHash.put("age", age);
	   		haksaHash.put("irum", irum);
	   		haksaHash.put("subject", subject);
	   		haksaHash.put("gubun", "교수");
	   		haksaList.add(haksaHash);
	   		System.out.println("교수님이 등록되었습니다.");
	   		
	   	}else if(cnt==3) {
	   		HashMap<String,String> haksaHash = new HashMap<String,String>();
	   		System.out.println("나이:");
	   		age = input.next();
	   		if(age==null||age=="") {
	   			System.out.println("나이가null이거나공백이다.");
	   		}
	   		System.out.println("이름:");
	   		irum = input.next();
	   		if(irum==null||irum=="") {
	   			System.out.println("이름이null이거나공백이다.");
	   		}
	   		System.out.println("부서:");
	   		part = input.next();
	   		if(part==null||part=="") {
	   			System.out.println("부서가null이거나공백이다.");
	   		}
	   		haksaHash.put("age", age);
	   		haksaHash.put("irum", irum);
	   		haksaHash.put("part", part);
	   		haksaHash.put("gubun", "관리자");
	   		haksaList.add(haksaHash);
	   		System.out.println("관리자님등록되었습니다.");
	   	}   	
	   }
}
