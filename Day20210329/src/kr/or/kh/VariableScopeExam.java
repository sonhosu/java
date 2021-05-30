package kr.or.kh;

public class VariableScopeExam {
	
	int globalScope = 10;
	static int staticVal1 = 7;
	
	public void scopeTest(int value) {
		int localScope = 20;
		
		
		System.out.println(globalScope);
		System.out.println(localScope);
		System.out.println(value);
	}
	
	
	public void scopeTest2(int value2) {
		System.out.println(globalScope);
	//	System.out.println(localScope);
	//	System.out.println(value);
		System.out.println(value2);
	}
	
	
	
	
	
	public static void main(String[] args) {
		//System.out.println(globalScope);
		//System.out.println(localScope);
		//System.out.println(value);
		System.out.println(staticVal1);
		
		VariableScopeExam v1 = new VariableScopeExam();
		System.out.println(v1.globalScope);
		VariableScopeExam v2 = new VariableScopeExam();
		v1.globalScope = 10;
		v2.globalScope = 20;
		System.out.println(v1.globalScope);
		System.out.println(v2.globalScope);
		v1.staticVal1 = 50;
		v2.staticVal1 = 100;
		
		System.out.println(v1.staticVal1);
		System.out.println(v2.staticVal1);
	}
	
	

}
