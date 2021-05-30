package kr.or.kh;

public class ChildClass extends ParentClass {

	
	public ChildClass() {
		System.out.println("ChildClass constructor");
		
	}
	
	public void childFun() {
		System.out.println("--childFun() START--");
			
	}
	@Override
	public void makeJJajang() {
		System.out.println(" more makeJJajang");
	}
	
	public void getOpenYear() {
		System.out.println(this.a);
		System.out.println(super.a);
	}
	
	public static void main(String[] args) {
		
		
		ChildClass child = new ChildClass();
		
		child.parentFun();
		child.makeJJajang();
		child.getOpenYear();
		
		
		
	}

	
	
}
