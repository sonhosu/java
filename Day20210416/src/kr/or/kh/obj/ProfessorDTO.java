package kr.or.kh.obj;

import java.io.Serializable;

public class ProfessorDTO implements Serializable {
   private int no;
   public String age;
   public String irum;
   public String subject;
   public ProfessorDTO(int no, String age, String irum, String subject) {
	   super();
	   this.no = no;
	   this.age = age;
	   this.irum = irum;
	   this.subject = subject;
   }
   
   public ProfessorDTO() {
	   super();
	   // TODO Auto-generated constructor stub
   }
   
	public int getNo() {
		return no;
	}
	
	public void setNo(int no) {
		this.no = no;
	}
	
	public String getAge() {
		return age;
	}
	
	public void setAge(String age) {
		this.age=age;
		if(age==null||age=="") {
			System.out.println("에러");
		}
	}
	
	public String getIrum() {
		return irum;
	}
	
	public void setIrum(String irum) {
		this.irum=irum;
		if(irum==null||irum=="") {
			System.out.println("에러");
		}
	}
	
	public String getSubject() {
		return subject;
	}
	
	public void setSubject(String subject) {
		this.subject=subject;
		if(subject==null||subject=="") {
			System.out.println("에러");
		}
	}
	
	@Override
	public String toString() {
		return "ProfessorDTO [no=" + no + ", age=" + age + ", irum=" + irum + ", subject=" + subject + "]";
	}   
}
