package kr.or.kh.obj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Register {
  private int cnt; 
  public static Scanner input;
  private String age;
  private String irum;
  private String hakbun;
  private String subject;
  private String part;
  private Connection conn;
  private RegisterDAO registerDAO;
  private StudentDTO student;
  private ProfessorDTO professor;
  private ManagerDTO manager;
  public Register() {	  	
	    student = new StudentDTO();
	    registerDAO = new RegisterDAO();
		professor = new ProfessorDTO();
		manager = new ManagerDTO();	
  }
  static {
	  input = new Scanner(System.in);
  }
 
  public void displayAll(String str,int cnt) {
	  if(str.equals("학생")) {
		System.out.println("학생이 등록되었습니다.");
		    if(cnt==0) {
			System.out.println("학생등록이실패되었습니다.");
		    }
		}else if(str.equals("교수")) {
			System.out.println("교수님이등록되었습니다.");
			if(cnt==0) {
			 System.out.println("교수님등록이실패되었습니다.");
			}
		}else if(str.equals("관리자")) {
			System.out.println("관리자님이 등록되었습니다.");
			if(cnt==0) {
				System.out.println("관리자님등록이실패되었습니다.");
			}
		}else {
			System.out.println("등록이실패되었습니다.");
		}
  }
  public void setAgeIrum(String gubun) {
	  if(gubun.equals("학생")) {
	     System.out.println("학생나이:");
	     age = Register.input.next();
	     System.out.println("학생이름:");
	     irum = Register.input.next();
	     
	  }else if(gubun.equals("교수")) {
		     System.out.println("교수나이:");
		     age = Register.input.next();
		     System.out.println("교수이름:");
		     irum = Register.input.next();
	  }else if(gubun.equals("관리자")) {
		     System.out.println("관리자나이:");
		     age = Register.input.next();
		     System.out.println("관리자이름:");
		     irum = Register.input.next();
	  }
		
  }
  public void setHakbun() {
	  System.out.println("학번:");
	  hakbun = Register.input.next();	  
  }
  public void setSubject() {
	  System.out.println("과목:");
	  subject = Register.input.next();
  }
  public void setPart() {
	  System.out.println("부서:");
	  part = Register.input.next(); 
  }

  public void register() {
		System.out.println("=======메뉴 선택======");
		System.out.println("1.학생");
		System.out.println("2.교수");
		System.out.println("3.관리자");
		System.out.println("4.이전메뉴");
		System.out.println("번호를 선택해 주세요.."); 
		cnt = input.nextInt();
		if(cnt<0||cnt>4) {
			System.out.println("에러");
		}
		if(cnt==1) {//학생등록
			setAgeIrum("학생");		
			setHakbun();			
			try {
				conn=RegisterDAO.getConnection();
				cnt=registerDAO.studentRegister(student);				
				displayAll("학생",cnt);
				registerDAO.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}//학생등록
		else if(cnt==2) {//교수등록
			setAgeIrum("교수");
			setSubject();
			try {
				conn=RegisterDAO.getConnection();
				cnt=registerDAO.professorRegister(professor);				
				displayAll("교수",cnt);
				registerDAO.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}			    		            		
		}//교수등록
		else if(cnt==3) {//관리자
			setAgeIrum("관리자");
			setPart();
			try {
				conn=RegisterDAO.getConnection();
				cnt=registerDAO.managerRegister(manager);				
				displayAll("관리자",cnt);
				registerDAO.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}//관리자
	} 
}