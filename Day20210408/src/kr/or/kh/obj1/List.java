package kr.or.kh.obj1;

import java.util.HashMap;

public class List {
   private String gubun;
   public List() {
	   
   }
	public void list() {
		   System.out.println("===전체출력====");
		for(int i=0;i<Register.haksaList.size();i++) {
		   HashMap<String,String> haksaHash=Register.haksaList.get(i);
		   gubun=haksaHash.get("gubun");
		   if(gubun.equals("학생")) {
			   System.out.print("이름: " );
			   System.out.print(haksaHash.get("irum")+"\t");
			   System.out.print("나이: " );
			   System.out.print(haksaHash.get("age")+"\t");
			   System.out.print("학번: " );
			   System.out.print(haksaHash.get("hakbun")+"\n");
		   }
		   else if(gubun.equals("교수")) {
			   System.out.print("이름: " );
			   System.out.print(haksaHash.get("irum")+"\t");
			   System.out.print("나이: " );
			   System.out.print(haksaHash.get("age")+"\t");
			   System.out.print("과목: " );
			   System.out.print(haksaHash.get("subject")+"\n");		   		  
		   }
		   else if(gubun.equals("관리자")) {
			   System.out.print("이름: " );
			   System.out.print(haksaHash.get("irum")+"\t");
			   System.out.print("나이: " );
			   System.out.print(haksaHash.get("age")+"\t");
			   System.out.print("부서: " );
			   System.out.print(haksaHash.get("part")+"\n");        		   
		   }        	   
		}
	}
	
}

