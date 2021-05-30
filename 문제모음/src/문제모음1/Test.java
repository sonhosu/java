package 문제모음1;

public class Test {

	public static void main(String[] args) {
		
		int num = 11;
		System.out.println(num);
		
		double num2 = 3;
		
		
		int a=123;
		int b=456;
		int c=789;
		int sum=a+b+c;
		System.out.println(sum);
		
		for(int i=1; i<11; i++) {
			if(i!=3) {
			System.out.println(i);
			}
		}
		
		
		
		  int[] arr=  new int[5];
		  for(int i=0; i<arr.length; i++) {
			 arr[i]=i+1;
			 
			 System.out.println(arr[i]);
		  }
		 
		  
		  String s= "맑음";
		  
		  if(s.equals("맑음")) {
			  System.out.println("O");
		  }else{
			  System.out.println("X");
		  }
	}

}
