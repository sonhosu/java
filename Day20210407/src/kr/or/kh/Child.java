package kr.or.kh;

public class Child extends Parent {

	public int compute(int num) {
		if(num<=1)return num;
		return compute(num-1)+compute(num-3); 
	}
}
