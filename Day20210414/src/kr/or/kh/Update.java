package kr.or.kh;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Update {
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	private int cnt;
	private String result;
	private String irumUpdate;
	private String gubun;
	private String irumDB;
	private String age;
	private String hakbun;
	private String subject;
	private String part;
	private String sql;
	private int no;
	private String commit;
	private String ageUpdate;
	private String hakbunUpdate;
	private String subjectUpdate;
    public Update() {
    	try {
			Class.forName("com.mysql.jdbc.Driver");
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
				irumDB = rs.getString("irum");
			}
    }
    public void studentExecuterView() throws SQLException {
    	    rs=stmt.executeQuery(sql);
			while(rs.next()) {
				no = rs.getInt("no");
				age = rs.getString("age"); 
				irumDB = rs.getString("irum");
				hakbun = rs.getString("hakbun");    						
			}

    }
    public void studentViewDisplay() {    	
			System.out.print("나이:"+age+"\t"+"이름:"+irumDB+"\t학번:"+hakbun+"\n");
			System.out.println("변경하기전내용입니다.");
    }
    public void studentFinal() {
    	    System.out.print("변경하시겠습니까?yes/no");
			commit = Register.input.next();
    }
    public void updateReAge() {
    	    System.out.println("수정할 나이입력:");
			ageUpdate = Register.input.next();
			if(ageUpdate==null||ageUpdate=="") {
					System.out.println("에러");
				}

    }
    public void updateReIrum() {
			System.out.println("수정할 이름입력:");
			irumDB = Register.input.next();
			if(irumDB==null||irumDB=="") {
				System.out.println("에러");
			}
    }
    public void updateReHakbun() {
    	System.out.println("수정할 학번입력:");
		hakbunUpdate = Register.input.next();
		if(hakbunUpdate==null||hakbunUpdate=="") {
				System.out.println("에러");
			}
    }
    public void updateFinal() throws SQLException {
    	sql = "update student set age='"+ageUpdate+"',irum='"+irumDB+"',hakbun='"+hakbunUpdate+"' where irum='"+irumUpdate+"'";
		stmt=conn.createStatement();
    }
    public void updateStudentExecuter()throws SQLException {
    	cnt=stmt.executeUpdate(sql);
    }
    public void updateStudentDisplay() {
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
				irumDB = rs.getString("irum");
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
				age = rs.getString("age");
				irumDB = rs.getString("irum");
				subject = rs.getString("subject");
			}

     }
    public void professorViewDisplay() {    	
    	System.out.print("나이:"+age+"\t"+"이름:"+irumDB+"\t과목:"+subject+"\n");
		System.out.println("변경하기전내용입니다.");
     }
    public void professorFinal() {
	    System.out.print("변경하시겠습니까?yes/no");
		commit = Register.input.next();
    }
    public void updateReSubject() {
    	System.out.println("수정할 과목입력:");
			subjectUpdate = Register.input.next();
			if(subjectUpdate==null||subjectUpdate=="") {
				System.out.println("에러");
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
 						updateReAge();
 						updateReIrum();
 						updateReHakbun();
 						updateFinal(); 						
 						updateStudentExecuter();
 						updateStudentDisplay();
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
 						updateReAge();
 						updateReIrum();
 						updateReSubject();
 						sql = "update professor "
 							+ "set age='"+ageUpdate+"',irum='"+irumDB+"',subject='"+subjectUpdate+"' "
 							+ "where irum='"+irumUpdate+"'";
 						stmt=conn.createStatement();
 						cnt=stmt.executeUpdate(sql);
 						if(cnt==1) {
 							System.out.println(cnt+"건 교수님이 수정되었습니다.");
 						}else {
 							System.out.println(cnt+"건 교수님이 수정되지않았습니다.");
 						}
 					}else {
 						result="continue";
 					}
 				}	
 				
 			}//교수수정
 			else if(gubun.equals("관리자")) {//관리자수정
 				String sql = "select irum from manager where irum='"+irumUpdate+"'";
 				stmt = conn.createStatement();
 				rs=stmt.executeQuery(sql);
 				while(rs.next()) {
 					irumDB = rs.getString("irum");
 				}
 				if(irumUpdate.equals(irumDB)) {
 					sql = "select no,age,irum,part from manager where irum='"+irumUpdate+"'";
 					stmt=conn.createStatement();
 					rs=stmt.executeQuery(sql);
 					while(rs.next()) {
 						int no = rs.getInt("no");
 						age = rs.getString("age");
 						irumDB = rs.getString("irum");
 						part = rs.getString("part");
 					}
 					System.out.print("나이:"+age+"\t"+"이름:"+irumDB+"\t부서:"+part+"\n");
 					System.out.print("변경되기 전 내용입니다.yes/no");
 					String commit = Register.input.next();
 					if(commit.equals("yes")||commit.equals("YES")) {
 						System.out.println("수정할 나이입력:");
 						String ageUpdate = Register.input.next();
 						if(ageUpdate==null||ageUpdate=="") {
 							System.out.println("에러");
 						}
 						System.out.println("수정할 이름입력:");
 						irumDB = Register.input.next();
 						if(irumDB==null||irumDB=="") {
 							System.out.println("에러");
 						}
 						System.out.println("수정할 부서입력:");
 						String partUpdate = Register.input.next();
 						if(partUpdate==null||partUpdate=="") {
 							System.out.println("에러");
 						}
 						sql = "update manager set age='"+ageUpdate+"',irum='"+irumDB+"',part='"+partUpdate+"' where irum='"+irumUpdate+"'";
 						stmt=conn.createStatement();
 						cnt=stmt.executeUpdate(sql);
 						if(cnt==1) {
 							System.out.println(cnt+"건 관리자님이 수정되었습니다.");
 						}else {
 							System.out.println(cnt+"건 관리자님이 수정되지않았습니다.");
 						}
 					}else {
 						result="continue";
 					}
 				}	
 				
 			}//관리자수정
 		}  catch (SQLException e) {
			e.printStackTrace();
 		}
 	   return result;
 }
}
