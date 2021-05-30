package kr.or.kh.obj1;

import java.util.HashMap;

public class Update {
   private String irum;
   private String gubun;
   private String irumUpdate;
   private String commit;
   private String age;
   private String hakbun;
   private String subject;
   private String part;
   
   public Update() {
	   
   }
	
	public void update() {
		 //수정시작
	  	System.out.println("수정할이름을입력하세요.");
	  	System.out.println("이름:");
	  	irum = Register.input.next();
	  	if(irum==null||irum=="") {
	  		System.out.println("이름이공백이거나null입니다.");
	  	}
	  	for(int i=0;i<Register.haksaList.size();i++) {//반복문시작
	  		HashMap<String,String> haksaHash = Register.haksaList.get(i);
	  		gubun=haksaHash.get("gubun");
	  		irumUpdate = haksaHash.get("irum");
	  		if(gubun.equals("학생")) {
	  			if(irum.equals(irumUpdate)) {
	  				System.out.print("나이:"+haksaHash.get("age")+"\t");
	  				System.out.print("이름:"+haksaHash.get("irum")+"\t");
	  				System.out.print("학번:"+haksaHash.get("hakbun")+"\n");
	  				System.out.println("변경하기전내용입니다.수정할까요yes/no");
	  				commit = Register.input.next();
	  				if(commit==null||commit=="") {
	  					System.out.println("commit이null이거나공백입니다.");
	  				}
	  				if(commit.equals("yes")||commit.equals("YES")) {
	  					haksaHash = new HashMap<String,String>();
	  					System.out.println("나이:");
	  					age = Register.input.next();
	  					if(age==null||age=="") {
	  						System.out.println("나이가null이거나공백입니다.");
	  					}
	  					System.out.println("이름:");
	  					irum = Register.input.next();
	  					if(irum==null||irum=="") {
	  						System.out.println("이름이null이거나공백입니다.");
	  					}
	  					System.out.println("학번:");
	  					hakbun = Register.input.next();
	  					if(hakbun==null||hakbun=="") {
	  						System.out.println("학번이null이거나공백입니다.");
	  					}
	  					haksaHash.put("age", age);
	  					haksaHash.put("irum", irum);
	  					haksaHash.put("hakbun", hakbun); 
	  					haksaHash.put("gubun", "학생");
	  					Register.haksaList.set(i, haksaHash);
	  					System.out.println("학생이수정되었습니다.");
	  				}else {
	  					continue;
	  				}
	  			}        			
	  		}else if(gubun.equals("교수")) {
	  			if(irum.equals(irumUpdate)) {
	  				System.out.print("나이:"+haksaHash.get("age")+"\t");
	  				System.out.print("이름:"+haksaHash.get("irum")+"\t");
	  				System.out.print("과목:"+haksaHash.get("subject")+"\n");
	  				System.out.println("변경하기전내용입니다.수정할까요yes/no");
	  				commit = Register.input.next();
	  				if(commit.equals("yes")||commit.equals("YES")) {
	  					haksaHash = new HashMap<String,String>();
	  					System.out.println("나이:");
	  					age = Register.input.next();
	  					if(age==null||age=="") {
	  						System.out.println("나이가null이거나공백입니다.");
	  					}
	  					System.out.println("이름:");
	  					irum = Register.input.next();
	  					if(irum==null||irum=="") {
	  						System.out.println("이름이null이거나공백입니다.");
	  					}
	  					System.out.println("과목:");
	  					subject = Register.input.next();
	  					if(subject==null||subject=="") {
	  						System.out.println("과목이null이거나공백입니다.");
	  					}
	  					haksaHash.put("age", age);
	  					haksaHash.put("irum", irum);
	  					haksaHash.put("subject", subject); 
	  					haksaHash.put("gubun", "교수");
	  				Register.haksaList.set(i, haksaHash);
	  				System.out.println("교수님수정되었습니다.");
	  			}else {
	  				continue;
	  			}
	  		  }
	  		}else if(gubun.equals("관리자")) {
	  			if(irum.equals(irumUpdate)) {
	  				System.out.print("나이:"+haksaHash.get("age")+"\t");
	  				System.out.print("이름:"+haksaHash.get("irum")+"\t");
	  				System.out.print("부서:"+haksaHash.get("part")+"\n");
	  				System.out.println("변경하기전내용입니다.수정할까요yes/no");
	  				commit = Register.input.next();
	  				if(commit.equals("yes")||commit.equals("YES")) {
	  					haksaHash = new HashMap<String,String>();
	  					System.out.println("나이:");
	  					age = Register.input.next();
	  					if(age==null||age=="") {
	  						System.out.println("나이가null이거나공백입니다.");
	  					}
	  					System.out.println("이름:");
	  					irum = Register.input.next();
	  					if(irum==null||irum=="") {
	  						System.out.println("이름이null이거나공백입니다.");
	  					}
	  					System.out.println("부서:");
	  					part = Register.input.next();
	  					if(part==null||part=="") {
	  						System.out.println("과목이null이거나공백입니다.");
	  					}
	  					haksaHash.put("age", age);
	  					haksaHash.put("irum", irum);
	  					haksaHash.put("part", part); 
	  					haksaHash.put("gubun", "관리자");
	  				Register.haksaList.set(i, haksaHash);
	  				System.out.println("관리자님수정되었습니다.");
	  			}else {
	  				continue;
	  			}
	  		  }
	  		}
	  	}
	  }
}
