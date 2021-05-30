package kh.or.kh;

public class VariableScopeExam {

	int globalScope = 10;
	static int staticVa1= 7;
	
	
	
	public void scopeTest(int value) {
		
		int localScope= 20;
		System.out.println(globalScope);
		System.out.println(localScope);
		System.out.println(value);
	}
	
	public void scopeTest2(int value2) {
		
		System.out.println(value2);
		
		
		
	}
	public static void main(String[] args) {
		
		//System.out.println(globalScope);
		//System.out.println(localScope);
		//System.out.println(value);
		System.out.println(staticVa1);
		
		VariableScopeExam v1 = new VariableScopeExam();
		System.out.println(v1.globalScope);
		VariableScopeExam v2 = new VariableScopeExam();
		v1.globalScope = 10;
		v2.globalScope = 20;
		System.out.println(v1.globalScope);
		System.out.println(v2.globalScope);
		v1.staticVa1 = 50;
		v2.staticVa1 = 100;
		System.out.println(v1.staticVa1);
		System.out.println(v2.staticVa1);
	}

	

}
