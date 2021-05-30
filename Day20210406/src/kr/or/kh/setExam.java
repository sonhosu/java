package kr.or.kh;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setExam {

	public static void main(String[] args) {
		Set<String> set1 = new HashSet<String>();
		
		boolean flag1 = set1.add("kang");
		boolean flag2 = set1.add("kim");
		boolean flag3 = set1.add("kang");
		
		
		System.out.println(set1.toString());
		
		Iterator<String> iter = set1.iterator();    //자료를 찾을때 Iterator 사용
		
		while(iter.hasNext()) {
			
			String str = iter.next();
			System.out.println(str);
		}
	}

	
}
