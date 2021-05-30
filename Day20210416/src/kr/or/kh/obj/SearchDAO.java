package kr.or.kh.obj;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SearchDAO {
	private ResultSet rs;
	private String sql;
	private Statement stmt;
	private Connection conn;
   public SearchDAO() {
	   try {
			Class.forName("com.mysql.jdbc.Driver");			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
   }
   public void searchStudentSql(String irumSearch) throws SQLException {
	   conn=RegisterDAO.getConnection();
	   sql = "select no,age,irum,hakbun from student where irum='"+irumSearch+"'";
	   stmt = conn.createStatement();
   }
   public StudentDTO searchStudentExecuter(StudentDTO student)throws SQLException {
	   rs=stmt.executeQuery(sql);
		while(rs.next()) {
			student.setNo(rs.getInt("no"));
			student.setAge(rs.getString("age"));
			student.setIrum(rs.getString("irum"));
			student.setHakbun(rs.getString("hakbun"));
		}
		return student;
   }
   public void searchProfessorSql(String irumSearch)throws SQLException {
	   conn=RegisterDAO.getConnection();
	   sql = "select no,age,irum,subject from professor where irum='"+irumSearch+"'";
	   stmt = conn.createStatement();
   }
   public ProfessorDTO searchProfessorExecuter(ProfessorDTO professor)throws SQLException {
	    rs=stmt.executeQuery(sql); //insert,update,delete executeUpdate(), select executeQuery();
		while(rs.next()) {
			professor.setNo(rs.getInt("no"));
			professor.setAge(rs.getString("age"));
			professor.setIrum(rs.getString("irum"));
			professor.setSubject(rs.getString("subject"));
		}
		return professor;
   }
   public void searchManagerSql(String irumSearch)throws SQLException {
	    conn=RegisterDAO.getConnection();
	    sql = "select no,age,irum,part from manager where irum='"+irumSearch+"'";
		stmt = conn.createStatement();
   }
   public ManagerDTO searchManagerExecuter(ManagerDTO manager)throws SQLException {
	   rs=stmt.executeQuery(sql);
		while(rs.next()) {
			manager.setNo(rs.getInt("no"));
			manager.setAge(rs.getString("age"));
			manager.setIrum(rs.getString("irum"));
			manager.setPart(rs.getString("part"));
		}
		return manager;
   }
   public void close()throws SQLException {
		stmt.close();
		conn.close();
		rs.close();		
	}
}
