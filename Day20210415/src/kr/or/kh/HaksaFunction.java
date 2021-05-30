package kr.or.kh.function;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class HaksaFunction {
   public static void register(int cnt,Scanner input,Connection conn,Statement stmt) {
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
   		System.out.println("나이입력:");
   		String age = input.next();
   		if(age==null||age=="") {
   			System.out.println("에러");
   		}
   		System.out.println("이름입력:");
   		String irum = input.next();
   		if(irum==null||irum=="") {
   			System.out.println("에러");
   		}
   		System.out.println("학번입력:");
   		String hakbun = input.next();
   		if(hakbun==null||hakbun=="") {
   			System.out.println("에러");
   		}
   		//데이터베이스
   		//1.로드(load)내가자바언어에게mysql데이터베이스를사용할꺼야인식
   		try {
				Class.forName("com.mysql.jdbc.Driver");
				//2.연결(Connection DriverManager.getConnection(url,id,password);
				conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mysql?characterEncoding=utf-8", "root", "");
				//3.준비   3-1 문장준비
				//        3-2 공간준비
				String sql = "insert into student(age,irum,hakbun) values('"+age+"','"+irum+"','"+hakbun+"')";
				stmt = conn.createStatement();
				//4.실행 execute
				cnt = stmt.executeUpdate(sql);
				if(cnt==1) {
					System.out.println(cnt+"건학생이 등록되었습니다.");
				}else {
					System.out.println("학생등록이 실패하였습니다.");
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				//5.종료
				try {
					conn.close();
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
			}
   	}//학생등록
   	else if(cnt==2) {//교수등록
   		System.out.println("나이입력:");
   		String age = input.next();
   		if(age==null||age=="") {
   			System.out.println("에러");
   		}
   		System.out.println("이름입력:");
   		String irum = input.next();
   		if(irum==null||irum=="") {
   			System.out.println("에러");
   		}
   		System.out.println("과목입력:");
   		String subject = input.next();
   		if(subject==null||subject=="") {
   			System.out.println("에러");
   		}
   		//1.로드(load)내가자바언어에게mysql데이터베이스를사용할꺼야인식
   		try {
				Class.forName("com.mysql.jdbc.Driver");
				//2.연결 Connection
				conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mysql?characterEncoding=utf-8", "root", "");
				//3.준비  공간준비,쿼리준비
				String sql = "INSERT INTO professor(age,irum,subject) values('"+age+"','"+irum+"','"+subject+"')";
				stmt = conn.createStatement();
				//4.실행
				cnt = stmt.executeUpdate(sql);
				if(cnt==1) {
					System.out.println("교수님이 등록되었습니다.");
				}else {
					System.out.println("교수님등록이실패되었습니다.");
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					//5.종료
					stmt.close();
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}           		            		
   	}//교수등록
   	else if(cnt==3) {//관리자
   		try {
				System.out.println("나이입력:");
				String age = input.next();
				if(age==null||age=="") {
					System.out.println("에러");
				}
				System.out.println("이름입력:");
				String irum = input.next();
				if(irum==null||irum=="") {
					System.out.println("에러");
				}
				System.out.println("부서입력:");
				String part = input.next();
				if(part==""||part=="") {
					System.out.println("에러");
				}
				//로드
				Class.forName("com.mysql.jdbc.Driver");
				//연결
				conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mysql?characterEncoding=utf-8", "root", "");
				//준비 쿼리준비,공간준비
				String sql = "insert into manager(age,irum,part) values('"+age+"','"+irum+"','"+part+"')";
				stmt = conn.createStatement();
				cnt = stmt.executeUpdate(sql);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {						
				e.printStackTrace();
			} finally {
				try {
					stmt.close();
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
   	}//관리자
   }
   public static void search(Scanner input,Connection conn,Statement stmt,ResultSet rs,int cnt) {
	   System.out.println("찾을이름을 입력:");
		String irumSearch = input.next();
		if(irumSearch==null||irumSearch=="") {
			System.out.println("에러");
		}
		System.out.println("학생,교수,관리자중입력");
		String gubun = input.next();
		if(irumSearch==null||irumSearch=="") {
			System.out.println("에러");
		}
		String age=null;
		String irum=null;
		String hakbun=null;
		String subject=null;
		String part=null;
		if(gubun.equals("학생")) {//학생찾기
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mysql?characterEncoding=utf-8", "root", "");
			String sql = "select no,age,irum,hakbun from student where irum='"+irumSearch+"'";
			stmt = conn.createStatement();
			rs=stmt.executeQuery(sql);
			while(rs.next()) {
				int no = rs.getInt("no");
				age = rs.getString("age");
				irum = rs.getString("irum");
				hakbun = rs.getString("hakbun");
			}
			System.out.print("나이:"+age+"\t"+"이름:"+irum+"\t학번:"+hakbun+"\n");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}		
		}//학생찾기
		else if(gubun.equals("교수")) {//교수찾기
			try {
				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mysql?characterEncoding=utf-8", "root", "");
				String sql = "select no,age,irum,subject from professor where irum='"+irumSearch+"'";
				stmt = conn.createStatement();
				rs=stmt.executeQuery(sql); //insert,update,delete executeUpdate(), select executeQuery();
				while(rs.next()) {
					int no = rs.getInt("no");
					age = rs.getString("age");
					irum= rs.getString("irum");
					subject = rs.getString("subject");
				}
				System.out.print("나이:"+age+"\t"+"이름:"+irum+"\t과목:"+subject+"\n");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					stmt.close();
					conn.close();
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}//교수찾기
		else if(gubun.equals("관리자")) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mysql?characterEncoding=utf-8", "root", "");
				String sql = "select no,age,irum,part from manager where irum='"+irumSearch+"'";
				stmt = conn.createStatement();
				rs=stmt.executeQuery(sql);
				while(rs.next()) {
					int no = rs.getInt("no");
					age = rs.getString("age");
					irum = rs.getString("irum");
					part = rs.getString("part");
				}
				System.out.print("나이:"+age+"\t"+"이름:"+irum+"\t부서:"+part+"\n");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					stmt.close();
					rs.close();
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}				    
		}		
   }
   public static void delete(Scanner input,Connection conn,Statement stmt,int cnt) {
	   System.out.println("삭제할이름을 입력:");
		String irumDelete = input.next();
		if(irumDelete==null||irumDelete=="") {
			System.out.println("에러");
		}
		System.out.println("학생,교수,관리자,중입력");
		String gubun = input.next();
		if(gubun==null||gubun=="") {
			System.out.println("에러");
		}
		if(gubun.equals("학생")) {//학생삭제    				
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mysql?characterEncoding=utf-8", "root", "");
			String sql = "delete from student where irum='"+irumDelete+"'";
			stmt = conn.createStatement();
			cnt=stmt.executeUpdate(sql);
			if(cnt==1) {
				System.out.println(cnt+"건 학생이삭제되었습니다.");
			}else {
				System.out.println(cnt+"건 학생삭제가실패되었습니다.");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	   }//학생삭제
		else if(gubun.equals("교수")) {//교수삭제
			try {
				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mysql?characterEncoding=utf-8", "root", "");
				String sql = "delete from professor where irum='"+irumDelete+"'";
				stmt = conn.createStatement();
				cnt = stmt.executeUpdate(sql);
				if(cnt==1) {
					System.out.println(cnt+"건 교수님이삭제되었습니다.");
				}else {
					System.out.println(cnt+"건 교수님이삭제가안되었습니다.");
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					stmt.close();
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}//교수삭제
		else if(gubun.equals("관리자")) {//관리자
			try {
				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mysql?characterEncoding=utf-8", "root", "");
				String sql = "delete from manager where irum='"+irumDelete+"'";
				stmt = conn.createStatement();
				cnt=stmt.executeUpdate(sql);
				if(cnt==1) {
					System.out.println(cnt+"건 관리자님이삭제되었습니다.");
				}else {
					System.out.println(cnt+"건 관리자님이삭제가안되었습니다.");
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					stmt.close();
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}//관리자
   }
   public static void list(Connection conn,Statement stmt,ResultSet rs) {
	   try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mysql?characterEncoding=utf-8", "root", "");
			String sql = "select no,age,irum,hakbun from student";
			stmt = conn.createStatement();
			rs=stmt.executeQuery(sql);
			String age=null;
			String irum=null;
			String hakbun=null;
			String subject=null;
			String part=null;					
			while(rs.next()) {
				int no = rs.getInt("no");
				age = rs.getString("age");
				irum=rs.getString("irum");
				hakbun=rs.getString("hakbun");    				
				System.out.print("나이:"+age+"\t"+"이름:"+irum+"\t"+"학번:"+hakbun+"\n");
			}
			sql = "select no,age,irum,subject from professor";
			stmt = conn.createStatement();
			rs=stmt.executeQuery(sql);
			while(rs.next()) {
				int no = rs.getInt("no");
				age = rs.getString("age");
				irum = rs.getString("irum");
				subject = rs.getString("subject");
				System.out.print("나이:"+age+"\t"+"이름:"+irum+"\t과목:"+subject+"\n");
			}
			sql = "select no,age,irum,part from manager";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				int no = rs.getInt("no");
				age = rs.getString("age");
				irum = rs.getString("irum");
				part = rs.getString("part");
				System.out.print("나이:"+age+"\t"+"이름:"+irum+"\t부서:"+part+"\n");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				conn.close();
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
   }
   public static String update(Connection conn,Scanner input,Statement stmt,ResultSet rs,int cnt) {
	   String result=null;
	   try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mysql?characterEncoding=utf-8", "root", "");
			System.out.println("수정할이름을입력하세요");
			String irumUpdate = input.next();
			if(irumUpdate==null||irumUpdate=="") {
				System.out.println("에러");
			}
			System.out.println("학생,교수,관리자,중입력");
			String gubun = input.next();
			if(gubun==null||gubun=="") {
				System.out.println("에러");
			}
			String irumDB=null;
			String age=null;
			String hakbun=null;
			String subject=null;
			String part=null;
			if(gubun.equals("학생")) {//학생수정
				String sql = "select irum from student where irum='"+irumUpdate+"'";
				stmt = conn.createStatement();
				rs=stmt.executeQuery(sql);
				while(rs.next()) {
					irumDB = rs.getString("irum");
				}
				if(irumUpdate.equals(irumDB)) {
					sql = "select no,age,irum,hakbun from student where irum='"+irumUpdate+"'";
					stmt = conn.createStatement();
					rs=stmt.executeQuery(sql);
					while(rs.next()) {
						int no = rs.getInt("no");
						age = rs.getString("age"); 
						irumDB = rs.getString("irum");
						hakbun = rs.getString("hakbun");    						
					}
					System.out.print("나이:"+age+"\t"+"이름:"+irumDB+"\t학번:"+hakbun+"\n");
					System.out.print("변경되기 전 내용입니다.yes/no");
					String commit = input.next();
					if(commit.equals("yes")||commit.equals("YES")) {
						System.out.println("수정할 나이입력:");
						String ageUpdate = input.next();
						if(ageUpdate==null||ageUpdate=="") {
							System.out.println("에러");
						}
						System.out.println("수정할 이름입력:");
						irumDB = input.next();
						if(irumDB==null||irumDB=="") {
							System.out.println("에러");
						}
						System.out.println("수정할 학번입력:");
						String hakbunUpdate = input.next();
						if(hakbunUpdate==null||hakbunUpdate=="") {
							System.out.println("에러");
						}
						sql = "update student set age='"+ageUpdate+"',irum='"+irumDB+"',hakbun='"+hakbunUpdate+"' where irum='"+irumUpdate+"'";
						stmt=conn.createStatement();
						cnt=stmt.executeUpdate(sql);
						if(cnt==1) {
							System.out.println(cnt+"건 학생이 수정되었습니다.");
						}else {
							System.out.println(cnt+"건 학생이 수정되지않았습니다.");
						}
					}else {
						result="continue";
					}
				}							
			}//학생수정
			else if(gubun.equals("교수")) {//교수수정
				String sql = "select irum from professor where irum='"+irumUpdate+"'";
				stmt = conn.createStatement();
				rs=stmt.executeQuery(sql);
				while(rs.next()) {
					irumDB = rs.getString("irum");
				}
				if(irumUpdate.equals(irumDB)) {
					sql = "select no,age,irum,subject from professor where irum='"+irumUpdate+"'";
					stmt=conn.createStatement();
					rs=stmt.executeQuery(sql);
					while(rs.next()) {
						int no = rs.getInt("no");
						age = rs.getString("age");
						irumDB = rs.getString("irum");
						subject = rs.getString("subject");
					}
					System.out.print("나이:"+age+"\t"+"이름:"+irumDB+"\t과목:"+subject+"\n");
					System.out.print("변경되기 전 내용입니다.yes/no");
					String commit = input.next();
					if(commit.equals("yes")||commit.equals("YES")) {
						System.out.println("수정할 나이입력:");
						String ageUpdate = input.next();
						if(ageUpdate==null||ageUpdate=="") {
							System.out.println("에러");
						}
						System.out.println("수정할 이름입력:");
						irumDB = input.next();
						if(irumDB==null||irumDB=="") {
							System.out.println("에러");
						}
						System.out.println("수정할 과목입력:");
						String subjectUpdate = input.next();
						if(subjectUpdate==null||subjectUpdate=="") {
							System.out.println("에러");
						}
						sql = "update professor set age='"+ageUpdate+"',irum='"+irumDB+"',subject='"+subjectUpdate+"' where irum='"+irumUpdate+"'";
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
					String commit = input.next();
					if(commit.equals("yes")||commit.equals("YES")) {
						System.out.println("수정할 나이입력:");
						String ageUpdate = input.next();
						if(ageUpdate==null||ageUpdate=="") {
							System.out.println("에러");
						}
						System.out.println("수정할 이름입력:");
						irumDB = input.next();
						if(irumDB==null||irumDB=="") {
							System.out.println("에러");
						}
						System.out.println("수정할 부서입력:");
						String partUpdate = input.next();
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
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	   return result;
   }
}
