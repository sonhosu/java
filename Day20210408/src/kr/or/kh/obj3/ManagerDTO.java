package kr.or.kh.obj3;

import java.io.Serializable;

public class ManagerDTO implements Serializable {
  private String age;
  private String irum;
  private String part;
  private String gubun;
  public ManagerDTO(String age, String irum, String part, String gubun) {
	  super();
	  this.age = age;
	  this.irum = irum;
	  this.part = part;
	  this.gubun = gubun;
  }
  
  public ManagerDTO() {
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
	
	public String getPart() {
		return part;
	}
	
	public void setPart(String part) {
		this.part = part;
	}
	
	public String getGubun() {
		return gubun;
	}
	
	public void setGubun(String gubun) {
		this.gubun = gubun;
	}
	
	@Override
	public String toString() {
		return "ManagerDTO [age=" + age + ", irum=" + irum + ", part=" + part + ", gubun=" + gubun + "]";
	}

  
}
