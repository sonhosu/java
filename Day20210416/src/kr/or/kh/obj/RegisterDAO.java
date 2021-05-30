package kr.or.kh.obj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class RegisterDAO {
	 private Statement stmt;  
	 private String sql;
	 private int cnt;
	 public static Connection conn;	 
	 
	 public RegisterDAO() {
		 try {
			Class.forName("com.mysql.jdbc.Driver");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	 }
	 public static Connection getConnection()throws SQLException {
		  conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mysql?characterEncoding=utf-8", "root", "");
		  return conn;
	  }
	 public int studentRegister(StudentDTO student) throws SQLException {
		 sql = "insert into student(age,irum,hakbun) values('"+student.getAge()+"','"+student.getIrum()+"','"+student.getHakbun()+"')";
		 stmt = conn.createStatement();
		 cnt = stmt.executeUpdate(sql);
		 return cnt;
	 }
	 public int professorRegister(ProfessorDTO professor)throws SQLException {
		  sql = "INSERT INTO professor(age,irum,subject) values('"+professor.getAge()+"','"+professor.getIrum()+"','"+professor.getSubject()+"')";
		  stmt = conn.createStatement();
		  cnt = stmt.executeUpdate(sql);
		  return cnt;
	 }
	 public int managerRegister(ManagerDTO manager)throws SQLException {
		  sql = "insert into manager(age,irum,part) values('"+manager.getAge()+"','"+manager.getIrum()+"','"+manager.getPart()+"')";
		  stmt = conn.createStatement();
		  cnt = stmt.executeUpdate(sql);
		  return cnt;
	 }
	  public void close()throws SQLException {
		  conn.close();
		  stmt.close();
	  }
}
