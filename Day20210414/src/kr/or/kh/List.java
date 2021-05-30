package kr.or.kh;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class List {
   private Connection conn;
   private Statement stmt;
   private ResultSet rs;
   private String sql;
   private String age;
   private String irum;
   private String hakbun;
   private String part;
   private int no;
   private String subject;
   public List() {
	   try {
		Class.forName("com.mysql.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
   }
   public void listStudent()throws SQLException {
	    sql = "select no,age,irum,hakbun from student";
		stmt = conn.createStatement();
   }
   public void studentExecuter()throws SQLException {
	   rs=stmt.executeQuery(sql);
	   while(rs.next()) {
			no = rs.getInt("no");
			age = rs.getString("age");
			irum=rs.getString("irum");
			hakbun=rs.getString("hakbun");    				
			System.out.print("나이:"+age+"\t"+"이름:"+irum+"\t"+"학번:"+hakbun+"\n");
		}
   }
   public void listProfessor() throws SQLException {
	    sql = "select no,age,irum,subject from professor";
		stmt = conn.createStatement();
   }
   public void professorExecuter()throws SQLException{
	   rs=stmt.executeQuery(sql);
		while(rs.next()) {
			no = rs.getInt("no");
			age = rs.getString("age");
			irum = rs.getString("irum");
			subject = rs.getString("subject");
			System.out.print("나이:"+age+"\t"+"이름:"+irum+"\t과목:"+subject+"\n");
		}
   }
   public void listManager()throws SQLException {
	    sql = "select no,age,irum,part from manager";
		stmt = conn.createStatement();
   }
   public void managerExecuter() throws SQLException {
	   rs = stmt.executeQuery(sql);
		while(rs.next()) {
			no = rs.getInt("no");
			age = rs.getString("age");
			irum = rs.getString("irum");
			part = rs.getString("part");
			System.out.print("나이:"+age+"\t"+"이름:"+irum+"\t부서:"+part+"\n");
		}
   }
   public void close()throws SQLException {
	    rs.close();
		conn.close();
		stmt.close();
   }
   
   
   public void list() {	   
			try {
				conn = Register.getConnection();
				listStudent();
				studentExecuter();							
				listProfessor();			
				professorExecuter();
				listManager();
				managerExecuter();		
				close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
   }
   public static void main(String[] args) {
	List listObj = new List();
	listObj.list();
}
}
