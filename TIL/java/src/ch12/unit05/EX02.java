package ch12.unit05;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class EX02 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("자바", 95);
		map.put("오라클", 90);
		map.put("css", 85);
		map.put("서블릿", 75);
		map.put("HTML", 85);

		// key를 set로 반환
		Set<String> set = map.keySet();
		System.out.println("\n키를 Set로 반환 : " + set);
		
		// 값을 List로 반환
		List<Integer> list = new LinkedList<Integer>(map.values());
		System.out.println("\n을 List로 반환" + list);
		
		// 맵 전체
		
		// wjscp -2
		
		
		// 값을 collection으로
		Collection<Integer> col = map.values();
		System.out.println("최고값 : " + Collections.max(col));
		System.out.println("최저값 : " + Collections.min(col));
	}

}
