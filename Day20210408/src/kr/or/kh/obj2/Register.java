package kr.or.kh.obj2;

import java.util.ArrayList;
import java.util.Scanner;


public class Register {
	private int cnt;	
	public static Scanner input;	
	public static ArrayList<StudentDTO> studentList;
	public static ArrayList<ProfessorDTO> professorList;
	public static ArrayList<ManagerDTO> managerList;
	public Register() {
		
	}
	static {
		input = new Scanner(System.in);
		studentList = new ArrayList<StudentDTO>();
		professorList = new ArrayList<ProfessorDTO>();
		managerList = new ArrayList<ManagerDTO>();
	}
	
	public void registerStudent() {
		StudentDTO student = new StudentDTO();
  		registerAgeIrum(student);
  		System.out.println("학번:");
  		student.setHakbun(input.next());   
  		if(student.getHakbun()==null||student.getHakbun()=="") {
   			System.out.println("학번이null이거나공백이다.");
   		}
  		student.setGubun("학생");
  		studentList.add(student);
	}
	public void registerAgeIrum(StudentDTO student) {
		System.out.println("나이:");
  		student.setAge(Register.input.next());
  		if(student.getAge()==null||student.getAge()=="") {
   			System.out.println("나이가null이거나공백이다.");
   		}
  		System.out.println("이름:");
  		student.setIrum(Register.input.next());
  		if(student.getIrum()==null||student.getIrum()=="") {
   			System.out.println("이름이null이거나공백이다.");
   		}
	}
	public void registerAgeIrum(ProfessorDTO professor) {
		System.out.println("나이:");
  		professor.setAge(Register.input.next());
  		if(professor.getAge()==null||professor.getAge()=="") {
   			System.out.println("나이가null이거나공백이다.");
   		}
  		System.out.println("이름:");
  		professor.setIrum(Register.input.next());
  		if(professor.getIrum()==null||professor.getIrum()=="") {
   			System.out.println("이름이null이거나공백이다.");
   		}
	}
	public void registerAgeIrum(ManagerDTO manager) {
		System.out.println("나이:");
  		manager.setAge(Register.input.next());
  		if(manager.getAge()==null||manager.getAge()=="") {
   			System.out.println("나이가null이거나공백이다.");
   		}
  		System.out.println("이름:");
  		manager.setIrum(Register.input.next());
  		if(manager.getIrum()==null||manager.getIrum()=="") {
   			System.out.println("이름이null이거나공백이다.");
   		}
	}
	public void registerProfessor() {
		ProfessorDTO professor = new ProfessorDTO();
		registerAgeIrum(professor);
		
		System.out.println("과목:");
  		professor.setSubject(input.next());
  		if(professor.getSubject()==null||professor.getSubject()=="") {
  			System.out.println("널이거나공백입니다.");
  		}
  		
  		professor.setGubun("교수");
  		professorList.add(professor);
	}
	public void registerMenu() {
		//등록의시작
	  	System.out.println("등록");
	  	System.out.println("=======메뉴 선택======");
	  	System.out.println("1.학생");
	  	System.out.println("2.교수");
	  	System.out.println("3.관리자");
	  	System.out.println("4.이전메뉴");
	  	System.out.println("번호를 선택해 주세요..");
	  	cnt = Register.input.nextInt();
	  	if(cnt<0||cnt>4) {
	   		System.out.println("음수이거나4이상이면에러입니다.");
	   	}
	}
	public void registerDisplay(int cnt) {
		if(cnt==1) {
			System.out.println("학생이등록되었습니다.");
		}else if(cnt==2) {
			System.out.println("교수님이등록되었습니다.");
		}else if(cnt==3) {
			System.out.println("관리자님이등록되었습니다.");
		}
	}
	public void registerManager() {
		ManagerDTO manager = new ManagerDTO();
  		registerAgeIrum(manager);
  		System.out.println("부서:");
  		manager.setPart(input.next());
  		
  		manager.setGubun("관리자");
  		managerList.add(manager);
	}
	public void register() {//등록함수
		registerMenu();
	  	if(cnt==1) {//학생시작
	  		registerStudent();
	  		registerDisplay(1);
	  		       	
	  	}//학생의끝
	  	else if(cnt==2) {//교수의시작
	  		registerProfessor();
	  		registerDisplay(2);  	
	  	}//교수의끝
	  	else if(cnt==3) {//관리자의시작
	  		registerManager();
	  		registerDisplay(3);	  		
	  	}//관리자의끝 
	}    
}

