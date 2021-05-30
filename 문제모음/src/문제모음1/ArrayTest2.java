package 문제모음1;

public class ArrayTest2 {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		int[] b= {6,7,8,9,10};
		int[] c = new int[5];
		for(int i=0; i<5; i++) {
			c[i]=a[i]+b[i];
		}
		
		
		for(int i=0; i<c.length; i++ ) {
			System.out.println(c[i]);
		}
	}

}
