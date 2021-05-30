package kr.or.kh.obj;

import java.io.Serializable;

public class StudentDTO implements Serializable {
	  private int no;
	  public String age;
	  public String irum;
	  public String hakbun;
	  public StudentDTO(int no, String age, String irum, String hakbun) {
		  super();
		  this.no = no;
		  this.age = age;
		  this.irum = irum;
		  this.hakbun = hakbun;
	  }
	  
	  public StudentDTO() {
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

	public String getHakbun() {
		return hakbun;
	}

	public void setHakbun(String hakbun) {
		  this.hakbun=hakbun;
		  if(hakbun==null||hakbun=="") {
				System.out.println("에러");
		  }
	}

	@Override
	public String toString() {
		return "StudentDTO [no=" + no + ", age=" + age + ", irum=" + irum + ", hakbun=" + hakbun + "]";
	}	  
}
