package kr.or.kh.obj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Delete {
   private Connection conn;
   private Statement stmt;
   private int cnt;
   private String irumDelete;
   private String gubun;
   private String sql;
   public Delete() {
	   try {
		Class.forName("com.mysql.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
   }
   public void deleteIrum() {
	    System.out.println("삭제할이름을 입력:");
		irumDelete = Register.input.next();
		if(irumDelete==null||irumDelete=="") {
			System.out.println("에러");
		}
   }
   public void deleteGubun() {
	   System.out.println("학생,교수,관리자,중입력");
		gubun = Register.input.next();
		if(gubun==null||gubun=="") {
			System.out.println("에러");
		}
   }
   public void studentDisplay() {
	   if(cnt==1) {
			System.out.println(cnt+"건 학생이삭제되었습니다.");
		}else {
			System.out.println(cnt+"건 학생삭제가실패되었습니다.");
		}   
   }
   public void managerDisplay() {
	   if(cnt==1) {
			System.out.println(cnt+"건 관리자님이삭제되었습니다.");
		}else {
			System.out.println(cnt+"건 관리자님이삭제가안되었습니다.");
		}
   }
   public void professorDisplay() {
	   if(cnt==1) {
			System.out.println(cnt+"건 교수님이삭제되었습니다.");
		}else {
			System.out.println(cnt+"건 교수님이삭제가안되었습니다.");
		}
   }
   public void close()throws SQLException {
	   conn.close();
	   stmt.close();
   }
   public void studentExecuter() throws SQLException {
	   cnt = stmt.executeUpdate(sql);
   }
   public void professorExecuter() throws SQLException{
	   cnt = stmt.executeUpdate(sql);
   }
   public void managerExecuter()throws SQLException {
		cnt=stmt.executeUpdate(sql);
   }
   public void deleteStudent() throws SQLException {
	   sql = "delete from student where irum='"+irumDelete+"'";
	   stmt = conn.createStatement();
   }
   public void deleteProfessor() throws SQLException {
	   sql = "delete from professor where irum='"+irumDelete+"'";
	   stmt = conn.createStatement();
   }
   public void deleteManager() throws SQLException {
	    sql = "delete from manager where irum='"+irumDelete+"'";
		stmt = conn.createStatement();
   }

   
   public void delete() {
       deleteIrum();
       deleteGubun();	   	
		if(gubun.equals("학생")) {//학생삭제    						
			try {
				conn = Register.getConnection();
				deleteStudent();
				studentExecuter();
				studentDisplay();		
				close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	   }//학생삭제
		else if(gubun.equals("교수")) {//교수삭제	
				try {
					conn = Register.getConnection();
					deleteProfessor();
					professorExecuter();
					professorDisplay();
					close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			
		}//교수삭제
		else if(gubun.equals("관리자")) {//관리자			
				try {
					conn = Register.getConnection();
					deleteManager();
					managerExecuter();
					managerDisplay();
				} catch (SQLException e) {
					e.printStackTrace();
				}
	  
		}//관리자
}
}
