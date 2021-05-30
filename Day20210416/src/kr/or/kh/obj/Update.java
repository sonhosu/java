package kr.or.kh.obj;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	private int cnt;
	private int no;
	private String result;
	private String irumUpdate;
	private String gubun;
	private String sql;
	private String commit;
	private String ageUpdate;
	private String hakbunUpdate;
	private String subjectUpdate;
	private String partUpdate;
	private StudentDTO student;
	private ProfessorDTO professor;
	private ManagerDTO manager;	
	private String irumDB;
    public Update() {
    	try {
			Class.forName("com.mysql.jdbc.Driver");
			student = new StudentDTO();
			professor = new ProfessorDTO();
			manager = new ManagerDTO();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
    }
    public void updateIrum() {
    	System.out.println("수정할이름을입력하세요");
			irumUpdate = Register.input.next();
			if(irumUpdate==null||irumUpdate=="") {
				System.out.println("에러");
			}
    }
    public void updateGubun() {
    	    System.out.println("학생,교수,관리자,중입력");
			gubun = Register.input.next();
			if(gubun==null||gubun=="") {
				System.out.println("에러");
			}
    }
    public void studentUpdate() throws SQLException {
    	    sql = "select irum from student where irum='"+irumUpdate+"'";
			stmt = conn.createStatement();
    }
    public void studentUpdateView() throws SQLException{
    	    sql = "select no,age,irum,hakbun from student where irum='"+irumUpdate+"'";
			stmt = conn.createStatement();
    }
    public void studentExecuter() throws SQLException{
    	    rs=stmt.executeQuery(sql);
			while(rs.next()) {
				irumDB=rs.getString("irum");
			}
    }
    public void studentExecuterView() throws SQLException {
    	    rs=stmt.executeQuery(sql);
			while(rs.next()) {
				no = rs.getInt("no");
				student.age = rs.getString("age"); 
				student.irum = rs.getString("irum");
				student.hakbun = rs.getString("hakbun");    						
			}

    }
    public void studentViewDisplay() {    	
			System.out.print("나이:"+student.getAge()+"\t"+"이름:"+student.getIrum()+"\t학번:"+student.getHakbun()+"\n");
			System.out.println("변경하기전내용입니다.");
    }
    public void studentFinal() {
    	    System.out.print("변경하시겠습니까?yes/no");
			commit = Register.input.next();
    }
    public void updateReAge(String str) {
    	    if(str.equals("학생")) {
    	    System.out.println("학생 나이입력:");
			student.age = Register.input.next();			
			if(student.age==null||student.age=="") {
					System.out.println("에러");
				}
    	    }else if(str.equals("교수")) {
    	    	System.out.println("교수 나이입력:");
    			professor.age = Register.input.next();			
    			if(professor.age==null||professor.age=="") {
    					System.out.println("에러");
    				}
    	    }else if(str.equals("관리자")) {
    	    	System.out.println("관리자 나이입력:");
    			manager.age = Register.input.next();			
    			if(manager.age==null||manager.age=="") {
    					System.out.println("에러");
    				}
    	    }
    }
    public void updateReIrum(String str) {
    	    if(str.equals("학생")) {
			System.out.println("학생 이름입력:");
			student.irum = Register.input.next();
			if(student.irum==null||student.irum=="") {
				System.out.println("에러");
			  }
    	    }else if(str.equals("교수")) {
    	    	System.out.println("교수 이름입력:");
    			professor.irum = Register.input.next();
    			if(professor.irum==null||professor.irum=="") {
    				System.out.println("에러");
    			  }
    	    }else if(str.equals("관리자")) {
    	    	System.out.println("관리자 이름입력:");
    			manager.irum = Register.input.next();
    			if(manager.irum==null||manager.irum=="") {
    				System.out.println("에러");
    			  }
    	    }
    	    
    }
    public void updateReHakbun() {    	
    	System.out.println("수정할 학번입력:");
		student.hakbun = Register.input.next();
		if(student.hakbun==null||student.hakbun=="") {
				System.out.println("에러");
			}
    }
    public void updateStudentFinal() throws SQLException {
    	sql = "update student set age='"+student.getAge()+"',irum='"+student.getIrum()+"',hakbun='"+student.getHakbun()+"' where irum='"+irumUpdate+"'";
		stmt=conn.createStatement();
    }
    public int updateStudentExecuter()throws SQLException {
    	cnt=stmt.executeUpdate(sql);
    	return cnt;
    }
    public void updateStudentDisplay(int cnt) {
    	if(cnt==1) {
				System.out.println(cnt+"건 학생이 수정되었습니다.");
			}else {
				System.out.println(cnt+"건 학생이 수정되지않았습니다.");
			}
    }
    
    public void professorUpdate() throws SQLException {
    	sql = "select irum from professor where irum='"+irumUpdate+"'";
		stmt = conn.createStatement();
    }
    public void professorExecuter() throws SQLException{
    	    rs=stmt.executeQuery(sql);
			while(rs.next()) {
				professor.irum = rs.getString("irum");
			}
    }
    public void professorUpdateView() throws SQLException{
    	    sql = "select no,age,irum,subject from professor where irum='"+irumUpdate+"'";
			stmt=conn.createStatement();
    }
    public void professorExecuterView() throws SQLException {
    	rs=stmt.executeQuery(sql);
			while(rs.next()) {
				no = rs.getInt("no");
				professor.age = rs.getString("age");
				professor.irum = rs.getString("irum");
				professor.subject = rs.getString("subject");
			}

     }
    public void updateProfessorFinal() throws SQLException {
    	sql = "update professor set age='"+professor.getAge()+"',irum='"+professor.getIrum()+"',subject='"+professor.getSubject()+"' where irum='"+irumUpdate+"'";
		stmt=conn.createStatement();
    }
    public int updateProfessorExecuter()throws SQLException {
    	cnt=stmt.executeUpdate(sql);
    	return cnt;
    }
    public void professorViewDisplay() {    	
    	System.out.print("나이:"+professor.getAge()+"\t"+"이름:"+professor.getIrum()+"\t과목:"+professor.getSubject()+"\n");
		System.out.println("변경하기전내용입니다.");
     }
    public void professorFinal() {
	    System.out.print("변경하시겠습니까?yes/no");
		commit = Register.input.next();
    }
    public void updateReSubject() {
    	System.out.println("수정할 과목입력:");
			professor.subject = Register.input.next();
			if(professor.subject==null||professor.subject=="") {
				System.out.println("에러");
			}
    }
    public void updateProfessorDisplay(int cnt) {
    	if(cnt==1) {
				System.out.println(cnt+"건 교수님이 수정되었습니다.");
			}else {
				System.out.println(cnt+"건 교수님이 수정되지않았습니다.");
			}
    }
    public void managerUpdate() throws SQLException {
    	sql = "select irum from manager where irum='"+irumUpdate+"'";
		stmt = conn.createStatement();
    }
    public void managerExecuter() throws SQLException {
    	rs=stmt.executeQuery(sql);
    	while(rs.next()) {
				manager.irum = rs.getString("irum");
			}
    }
    public void managerUpdateView() throws SQLException{
    	sql = "select no,age,irum,part from manager where irum='"+irumUpdate+"'";
		stmt=conn.createStatement();
    }
    public void managerExecuterView() throws SQLException {
    	rs=stmt.executeQuery(sql);
			while(rs.next()) {
				no = rs.getInt("no");
				manager.age = rs.getString("age");
				manager.irum = rs.getString("irum");
				manager.part = rs.getString("part");
			}

     }
    public void managaerViewDisplay() {    	
    	System.out.print("나이:"+manager.getAge()+"\t"+"이름:"+manager.getIrum()+"\t부서:"+manager.getPart()+"\n");
		System.out.println("변경하기전내용입니다.");
     }
    public void managerFinal() {
	    System.out.print("변경하시겠습니까?yes/no");
		commit = Register.input.next();
    }
    public void updateRePart() {
			System.out.println("수정할 부서입력:");
			manager.part = Register.input.next();
			if(manager.part==null||manager.part=="") {
					System.out.println("에러");
				}
    }
    public void updateManagerFinal() throws SQLException {
    	sql = "update manager set age='"+manager.getAge()+"',irum='"+manager.getIrum()+"',part='"+manager.getPart()+"' where irum='"+irumUpdate+"'";
		stmt=conn.createStatement();
    }
    public int updateManagerExecuter() throws SQLException {
    	cnt=stmt.executeUpdate(sql);
    	return cnt;
    }
    public void updateManagerDisplay(int cnt) {
    	if(cnt==1) {
				System.out.println(cnt+"건 관리자님이 수정되었습니다.");
			}else {
				System.out.println(cnt+"건 관리자님이 수정되지않았습니다.");
			}
    }
    public String update() {
    	updateIrum();
    	updateGubun();	  
 			try {
				conn = Register.getConnection();
				if(gubun.equals("학생")) {//학생수정
					studentUpdate();
					studentExecuter();
					if(irumUpdate.equals(irumDB)) {
						studentUpdateView();
						studentExecuterView();
				        studentViewDisplay();
				        studentFinal();
						if(commit.equals("yes")||commit.equals("YES")) {
							updateReAge("학생");
							updateReIrum("학생");
							updateReHakbun();
							updateStudentFinal(); 						
							cnt=updateStudentExecuter();
							updateStudentDisplay(cnt);
							result="continue";
						}else {
							result="continue";
						}
					}							
				}//학생수정
				else if(gubun.equals("교수")) {//교수수정
					professorUpdate();
					professorExecuter();
					if(irumUpdate.equals(irumDB)) {
						professorUpdateView();
						professorExecuterView();
						professorViewDisplay();
						professorFinal();
						if(commit.equals("yes")||commit.equals("YES")) {
							updateReAge("교수");
							updateReIrum("교수");
							updateReSubject();
							updateProfessorFinal();
							cnt=updateProfessorExecuter();
							updateProfessorDisplay(cnt);
							result="continue";
						}else {
							result="continue";
						}
					}	
					
				}//교수수정
				else if(gubun.equals("관리자")) {//관리자수정
					managerUpdate();
					managerExecuter(); 				
					if(irumUpdate.equals(irumDB)) {
						managerUpdateView();
						managerExecuterView();
						managaerViewDisplay();
					 	managerFinal();				
						if(commit.equals("yes")||commit.equals("YES")) {
							updateReAge("관리자");
							updateReIrum("관리자");
							updateRePart();
				            updateManagerFinal();				
							cnt=updateManagerExecuter();
				            updateManagerDisplay(cnt);
				            result="continue";
						}else {
							result="continue";
						}
					}	
					
				}//관리자수정
			} catch (SQLException e) {
				e.printStackTrace();
			} 		
 	   return result;
    }
}
