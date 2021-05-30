package kr.or.kh.obj1;

import java.util.HashMap;

public class Search {
	private String irum;
	private String gubun;
	private String irumSearch;
	public Search() {
		
	}
	public void search() {
		System.out.println("찾을이름을 입력해주세요.");
	   	System.out.println("이름:");
	   	irum = Register.input.next();
	   	if(irum==null||irum=="") {
				System.out.println("이름이null이거나공백이다.");
			}		   			   
	   	for(int i=0;i<Register.haksaList.size();i++) {
	   		HashMap<String,String> haksaHash = Register.haksaList.get(i);
	   	    gubun = haksaHash.get("gubun");
	   	    irumSearch = haksaHash.get("irum");
	   	    if(gubun.equals("학생")) {
	   	    	if(irum.equals(irumSearch)) {
	   	    		System.out.print("나이:"+haksaHash.get("age")+"\t");
	   	    		System.out.print("이름:"+haksaHash.get("irum")+"\t");
	   	    		System.out.print("학번:"+haksaHash.get("hakbun")+"\n");
	   	    	}
	   	    }else if(gubun.equals("교수")) {
	   	    	if(irum.equals(irumSearch)) {
	   	    		System.out.print("나이:"+haksaHash.get("age")+"\t");
	   	    		System.out.print("이름:"+haksaHash.get("irum")+"\t");
	   	    		System.out.print("과목:"+haksaHash.get("subject")+"\n");
	   	    	}
	   	    }else if(gubun.equals("관리자")) {
	   	    	if(irum.equals(irumSearch)) {
	   	    		System.out.print("나이:"+haksaHash.get("age")+"\t");
	   	    		System.out.print("이름:"+haksaHash.get("irum")+"\t");
	   	    		System.out.print("부서:"+haksaHash.get("part")+"\n");
	   	    	}
	   	    }
	   	}
	   }

}
