package kr.or.kh;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExam {

	public static void main(String[] args) {
		
		Set<String> set1 = new HashSet<String>();
		
		set1.add("11");
		set1.add("22");
		set1.add("33");
		
		System.out.println(set1);
		
		
		Iterator<String> iter = set1.iterator();
		while(iter.hasNext()) {

			String str = iter.next();
			
			System.out.println(str);
		}
		

	}

}
