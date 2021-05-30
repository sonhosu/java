package kr.or.kh;

import java.util.HashMap;

public class MapEx {

	public static void main(String[] args) {
		
		// HashMap 객체 생성
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		System.out.println("HashMap size:"+map.size());
		
		//데이터 추가
		map.put(1,"Hello" );
		map.put(3,"World" );
		map.put(5,"Java" );
		
		System.out.println("HashMap size:"+map.size());
		System.out.println("map:"+map);
		
		//데이터 교체
		map.put(3, "C");
		System.out.println("map:"+map);
		
		//데이터 추출
		String str = map.get(5);		
		System.out.println(str);
		
		//특정 데이터 포함 유무
		
		boolean b = map.containsKey(5);
		System.out.println("map.containsKey(5):"+b);
		
		//데이터 전체제거
		map.clear();
		System.out.println("map:"+map);
		
		//데이터 유무
		boolean c = map.isEmpty();
		System.out.println("데이터가 비어있나?:"+c);
		
		
	}

}
