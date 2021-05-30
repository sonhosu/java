package kr.or.kh.obj2;

import java.io.Serializable;

public class StudentDTO implements Serializable {
  private String age;
  private String irum;
  private String hakbun;
  private String gubun;
  
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

public String getHakbun() {
	return hakbun;
}

public void setHakbun(String hakbun) {
	this.hakbun = hakbun;
}

public String getGubun() {
	return gubun;
}

public void setGubun(String gubun) {
	this.gubun = gubun;
}

@Override
public String toString() {
	return "StudentDTO [age=" + age + ", irum=" + irum + ", hakbun=" + hakbun + ", gubun=" + gubun + "]";
}

public StudentDTO(String age, String irum, String hakbun, String gubun) {
	super();
	this.age = age;
	this.irum = irum;
	this.hakbun = hakbun;
	this.gubun = gubun;
}

public StudentDTO() {
	super();
	// TODO Auto-generated constructor stub
}
  
}
