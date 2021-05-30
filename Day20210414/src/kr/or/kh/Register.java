package kr.or.kh;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Register {
  private int cnt;
  public static Connection conn;
  private Statement stmt;
  private String age;
  private String irum;
  private String hakbun;
  private String subject;
  private String sql;
  private String part;
  public static Scanner input;
  public Register() {
	  try {
		Class.forName("com.mysql.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
  }
  static {
	  input = new Scanner(System.in);
  }
  public static Connection getConnection()throws SQLException {
	  conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mysql?characterEncoding=utf-8", "root", "");
	  return conn;
  }
  public void setStudentSql()throws SQLException {
	  sql = "insert into student(age,irum,hakbun) values('"+age+"','"+irum+"','"+hakbun+"')";
	  stmt = conn.createStatement();
  }
  public void setProfessorSql() throws SQLException {
	  sql = "INSERT INTO professor(age,irum,subject) values('"+age+"','"+irum+"','"+subject+"')";
	  stmt = conn.createStatement();
  }
  public void setManagerSql() throws SQLException {
	  String sql = "insert into manager(age,irum,part) values('"+age+"','"+irum+"','"+part+"')";
	  stmt = conn.createStatement();
  }
  public int studentExecute()throws SQLException {
	  cnt = stmt.executeUpdate(sql);
	  return cnt;
  }
  public int professorExecute()throws SQLException {
	  cnt = stmt.executeUpdate(sql);
	  return cnt;
  }
  public int managerExecute()throws SQLException{
	  cnt = stmt.executeUpdate(sql);
	  return cnt;
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
  public void setAgeIrum() {
	  System.out.println("나이입력:");
		age = input.next();
		if(age==null||age=="") {
			System.out.println("에러");
		}
		System.out.println("이름입력:");
		irum = input.next();
		if(irum==null||irum=="") {
			System.out.println("에러");
		}
  }
  public void setHakbun() {
	  System.out.println("학번입력:");
	  hakbun = input.next();
	  if(hakbun==null||hakbun=="") {
			System.out.println("에러");
		}
  }
  public void setSubject() {
	    System.out.println("과목입력:");
		String subject = input.next();
		if(subject==null||subject=="") {
			System.out.println("에러");
		}
  }
  public void setPart() {
	    System.out.println("부서입력:");
		String part = input.next();
		if(part==""||part=="") {
			System.out.println("에러");
		}
  }
  public void close()throws SQLException {
	  conn.close();
	  stmt.close();
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
			setAgeIrum();		
			setHakbun();			
			try {
				conn=getConnection();
				setStudentSql();
				cnt=studentExecute();
				displayAll("학생",cnt);
				close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}//학생등록
		else if(cnt==2) {//교수등록
			setAgeIrum();
			setSubject();
			try {
				conn=getConnection();
				setProfessorSql();
				cnt=professorExecute();
				displayAll("교수",cnt);
				close();
			} catch (SQLException e) {
				e.printStackTrace();
			}			    		            		
		}//교수등록
		else if(cnt==3) {//관리자
			setAgeIrum();
			setPart();
			try {
				conn=getConnection();
				setManagerSql();
				cnt=managerExecute();
				displayAll("관리자",cnt);
				close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}//관리자
	}
  public static void main(String[] args) {
	Register registerObj = new Register();
	registerObj.register();
}
}