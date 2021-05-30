package kr.or.kh;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class HaksaProject {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<HashMap<String,String>> haksaList = new ArrayList<HashMap<String,String>>();
		while(true) {
			System.out.println("======메뉴선택=====");
			System.out.println("1.등록");
			System.out.println("2.찾기");
			System.out.println("3.삭제");
			System.out.println("4.전체출력");
			System.out.println("5.수정");
			System.out.println("-----------------");
			System.out.println("0.종료");
			System.out.println("번호를 선택해주세요");
			int cnt = input.nextInt();
			if(cnt==1) {//등록
				 System.out.println("=======메뉴 선택======");
		        	System.out.println("1.학생");
		        	System.out.println("2.교수");
		        	System.out.println("3.관리자");
		        	System.out.println("4.이전메뉴");
		        	System.out.println("번호를 선택해 주세요.."); 
		        	cnt = input.nextInt();
		        	if(cnt ==1) {//학생등록
		        		System.out.println("나이입력");
		        		String age = input.next();
		        		System.out.println("이름입력");
		        		String irum = input.next();
		        		System.out.println("학번입력");
		        		String hakbun = input.next();
		        		//데이터베이스
		        		//1.로드(load) 내가 자바언어에게 mysql데이터 베이스를 사용할꺼야 라고 인식시키는것
		        		try {
							Class.forName("com.mysql.jdbc.Driver");
							//2.연결(Connection DriverManager. getConnection(url, id ,password) )
							Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mysql?setCharacterEncoding=utf8", "root", "");
							//3.준비 3-1 문장 준비
							//      3-2 공간 준비
							String sql = "insert into student(age,irum,hakbun) values('"+age+"','"+irum+"','"+hakbun+"')";
							Statement stmt = conn.createStatement();
							//4.실행 execute
							cnt = stmt.executeUpdate(sql);
							if(cnt==1) {
								System.out.println(cnt+"건의 학생이 등록되었습니다.");								
							}else {
								System.out.println("학생등록이 실패하였습니다.");
							}
						} catch (ClassNotFoundException e) {							
							e.printStackTrace();
						} catch (SQLException e) {							
							e.printStackTrace();
						}
		        		
		        	}//학생등록 끝
			}//등록끝
			else if(cnt==2){//찾기
				
			}//찾기끝
			else if(cnt==3) {//삭제
				
			}//삭제끝
			else if(cnt==4) {//전체출력
				
			}//전체룰력끝
			else if(cnt==0) {//종료
				
			}//종료끝
			else if(cnt==5) {//수정
				
			}//수정끝
		}

	}

}
