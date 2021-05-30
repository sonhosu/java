package kr.or.kh;

import java.util.ArrayList;

public class ListEx {

	public static void main(String[] args) {
		
	
	ArrayList<String> list = new ArrayList<String>();
	
	//추가
	list.add("Hello");
	list.add("java");
	list.add("World");
	list.add(1 , "hi");
	
	//변경
	list.set(1, "haha");
	
	System.out.println("listsize:"+list.size());
	System.out.println("list:"+list);
	
	//데이터 추출
	String str = list.get(0);
	System.out.println(str);
	
	
	//데이터 제거
	str = list.remove(0);
	System.out.println(list);
	
	//데이터 전체 제거
	list.clear();
	System.out.println("list:"+list);
	
	
	boolean b= list.isEmpty();
	System.out.println("데이터가 비어있나?:"+b);
	
	
	}
}
