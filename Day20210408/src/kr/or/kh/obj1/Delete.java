package kr.or.kh.obj1;

import java.util.HashMap;

public class Delete {
	private String irum;
	private String gubun;
	private String irumDelete;
	
	public Delete() {
		
	}
	
	public void delete() {		   	
	   	System.out.println("삭제할사람의 이름을 입력해 주세요.");
	   	System.out.print("이름 : ");
	   	irum = Register.input.next();
	   	if(irum==null||irum=="") {
				System.out.println("이름이null이거나공백이다.");
			}
	       for(int i=0;i<Register.haksaList.size();i++) {
	       	HashMap<String,String> haksaHash = Register.haksaList.get(i);
	       	gubun = haksaHash.get("gubun");
	       	irumDelete = haksaHash.get("irum");
	       	if(gubun.equals("학생")) {
	       		if(irum.equals(irumDelete)) {
	       		Register.haksaList.remove(i);         
	       		}
	       	}else if(gubun.equals("교수")) {
	       		if(irum.equals(irumDelete)) {
	       		Register.haksaList.remove(i);         
	       		}
	       	}else if(gubun.equals("관리자")) {
	       		if(irum.equals(irumDelete)) {
	       		Register.haksaList.remove(i);
	       		}
	       	}
	       }
	       System.out.println(irum+"님삭제하였습니다.");
	   }
}
