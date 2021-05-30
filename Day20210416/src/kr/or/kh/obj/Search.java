package kr.or.kh.obj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Search {
	private Connection conn;	
	private int no;
	private String irumSearch;
	private String gubun;	
	private StudentDTO student;
	private ProfessorDTO professor;
	private ManagerDTO manager;
	private SearchDAO searchDAO;
	public Search() {
		    searchDAO = new SearchDAO();
			student=new StudentDTO();
			professor=new ProfessorDTO();
			manager=new ManagerDTO();		
	}
	public void irumSearch() {
		System.out.println("찾을이름을 입력:");
		irumSearch = Register.input.next();
		if(irumSearch==null||irumSearch=="") {
			System.out.println("에러");
		}
	}
	public void gubunSearch() {
		System.out.println("학생,교수,관리자중입력");
		gubun = Register.input.next();
		if(irumSearch==null||irumSearch=="") {
			System.out.println("에러");
		}
	}
	public void studentDisplay(StudentDTO student) {
		System.out.print("나이:"+student.getAge()+"\t"+"이름:"+student.getIrum()+"\t학번:"+student.getHakbun()+"\n");
	}
	public void professorDisplay(ProfessorDTO professor) {
		System.out.print("나이:"+professor.getAge()+"\t"+"이름:"+professor.getIrum()+"\t과목:"+professor.getSubject()+"\n");
	}
	public void managerDisplay(ManagerDTO manager) {
		System.out.print("나이:"+manager.getAge()+"\t"+"이름:"+manager.getIrum()+"\t부서:"+manager.getPart()+"\n");
	}
	
public void search() {	
	irumSearch();
	gubunSearch();
		if(gubun.equals("학생")) {//학생찾기
			try {				
				searchDAO.searchStudentSql(irumSearch);
				student=searchDAO.searchStudentExecuter(student);
				studentDisplay(student);
				searchDAO.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}		
		}//학생찾기
		else if(gubun.equals("교수")) {//교수찾기					
				try {					
					searchDAO.searchProfessorSql(irumSearch);
					professor=searchDAO.searchProfessorExecuter(professor);
					professorDisplay(professor);
					searchDAO.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}				
		}//교수찾기
		else if(gubun.equals("관리자")) {				
				try {
					searchDAO.searchManagerSql(irumSearch);
					manager=searchDAO.searchManagerExecuter(manager);
					managerDisplay(manager);
					searchDAO.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}								    
		}		
}
}
