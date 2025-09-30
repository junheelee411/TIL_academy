package ch12.unit05;

import java.util.Map;
import java.util.TreeMap;

/*
 	TreeMap
 	- 키 순서로 정렬
 	- 키는 Comparable 인터페이스가 구현되어 있어야 한다.
 */
public class EX04 {

	public static void main(String[] args) {
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		
		// 키 순서로 정렬
		map.put("자바", 100);
		map.put("오라클", 85);
		map.put("스프링", 95);
		map.put("자바 스크립트", 80);
		map.put("HTML", 90);
		
		System.out.println(map);

		// 스프링에서 자바 이전까지 반환 : TreeMap에서만 가능
		Map<String, Integer> mp2 = map.subMap("스프링", "자바");
		System.out.println(mp2);
	}

}
