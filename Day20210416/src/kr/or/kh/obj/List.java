package kr.or.kh.obj;

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
   private int no;
   private StudentDTO student;
   private ProfessorDTO professor;
   private ManagerDTO manager;

   public List() {
	   try {
		Class.forName("com.mysql.jdbc.Driver");
		student = new StudentDTO();
		professor = new ProfessorDTO();
		manager = new ManagerDTO();
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
			student.age = rs.getString("age");
			student.irum=rs.getString("irum");
			student.hakbun=rs.getString("hakbun");    				
			System.out.print("나이:"+student.getAge()+"\t"+"이름:"+student.getIrum()+"\t"+"학번:"+student.getHakbun()+"\n");
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
			professor.age = rs.getString("age");
			professor.irum = rs.getString("irum");
			professor.subject = rs.getString("subject");
			System.out.print("나이:"+professor.getAge()+"\t"+"이름:"+professor.getIrum()+"\t과목:"+professor.getSubject()+"\n");
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
			manager.age = rs.getString("age");
			manager.irum = rs.getString("irum");
			manager.part = rs.getString("part");
			System.out.print("나이:"+manager.getAge()+"\t"+"이름:"+manager.getIrum()+"\t부서:"+manager.getPart()+"\n");
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
}
