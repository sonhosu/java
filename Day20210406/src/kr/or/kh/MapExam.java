package kr.or.kh;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("001", "kim");
		map.put("002", "gang");
		map.put("003", "choi");
		map.put("001", "gang");
		
		System.out.println(map.size());
		
		System.out.println(map.get("001"));
		Set<String> keys =map.keySet();
		
		Iterator<String>  iter = keys.iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			String value = map.get(key);
		}

	}

}
