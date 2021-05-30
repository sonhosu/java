package kr.or.kh.obj3;

import java.io.Serializable;

public class ProfessorDTO implements Serializable {
  private String age;
  private String irum;
  private String subject;
  private String gubun;
  public ProfessorDTO(String age, String irum, String subject, String gubun) {
	  super();
	  this.age = age;
	  this.irum = irum;
	  this.subject = subject;
	  this.gubun = gubun;
  }
  
  public ProfessorDTO() {
	  super();
	  // TODO Auto-generated constructor stub
  }
  
	public String getAge() {
		return age;
	}
	
	public void setAge(String age) {
		this.age = age;
	}
	
	public String getIrum() {
		return irum;
	}
	
	public void setIrum(String irum) {
		this.irum = irum;
	}
	
	public String getSubject() {
		return subject;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String getGubun() {
		return gubun;
	}
	
	public void setGubun(String gubun) {
		this.gubun = gubun;
	}
	
	@Override
	public String toString() {
		return "ProfessorDTO [age=" + age + ", irum=" + irum + ", subject=" + subject + ", gubun=" + gubun + "]";
	}

  
}
