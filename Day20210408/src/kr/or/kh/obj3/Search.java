package kr.or.kh.obj3;

public class Search {
	private String gubun;
	private String irumSearch;
	public Search() {
		
	}
	
	public void searchMenu() {
		System.out.println("찾을이름을 입력해주세요.");
    	System.out.println("이름:");
    	irumSearch = Register.input.next();
    	System.out.println("학생,교수,관리자,중찾는문자열을입력하세요");
    	gubun = Register.input.next();
    	
	}
	
	public void searchDisplay(StudentDTO student) {		
			System.out.print("나이:"+student.getAge()+"\t");
    		System.out.print("이름:"+student.getIrum()+"\t");
    		System.out.print("학번:"+student.getHakbun()+"\n");
		
	}
	public void searchDisplay(ProfessorDTO professor) {		
		System.out.print("나이:"+professor.getAge()+"\t");
		System.out.print("이름:"+professor.getIrum()+"\t");
		System.out.print("과목:"+professor.getSubject()+"\n");
	
    } 
	public void searchDisplay(ManagerDTO manager) {		
		System.out.print("나이:"+manager.getAge()+"\t");
		System.out.print("이름:"+manager.getIrum()+"\t");
		System.out.print("부서:"+manager.getPart()+"\n");
	
    } 
	public void search() {//검색함수의시작
		searchMenu();
		if(gubun.equals("학생")) {
			for(int i=0;i<Register.studentList.size();i++) {
				StudentDTO student = Register.studentList.get(i);
				if(irumSearch.equals(student.getIrum())) {
					searchDisplay(student);
				}
			}
		}
		else if(gubun.equals("교수")) {
		   for(int i=0;i<Register.professorList.size();i++) {
			   ProfessorDTO professor = Register.professorList.get(i);
			   if(irumSearch.equals(professor.getIrum())) {
				   searchDisplay(professor);
			   }
		   }
		}
		else if(gubun.equals("관리자")) {
			for(int i=0;i<Register.managerList.size();i++) {
				ManagerDTO manager = Register.managerList.get(i);
				if(irumSearch.equals(manager.getIrum())) {
					searchDisplay(manager);
				}
			}
		}
    }//검색함수의끝
}
