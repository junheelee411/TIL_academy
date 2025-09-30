package ch12.unit05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
 	Map
 	- 키, 값 구조
 	- 키는 중복을 허용하지 않음
 	- 키는 순서가 없음
 	- 키는 변경 불가, 변경할 경우 삭제 후 다시 등록
 	- 값은 replace(키,값)으로 변경 가능
 	
 	주요 메소드
 	- get(키) : 키에 대한 값 반환
 	- put(키,값) : 키에 대한 Set객체 반환
 	- KeySet() : 키에 대한 Set 객체 반환
 	- size() :
 	
 	구현 클래스
 	HashMap
 	-동기화 지원하지 않음
 	HashTable
 	-동기화 지원
 	LinkedHashMap
 	- 키가 등록된 순서 유지
 	TreeMap
 	- 키 순서로 정렬. 키는 Comparable 인터페이스 구현한 클래스만 가능
 	
 */

public class EX01_Map {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		// map에 저장
		map.put("서울", 1000);
		map.put("부산", 350);
		map.put("대구", 250);
		map.put("인천", 330);
		map.put("광주", 180);
		map.put("대전", 180);
		map.put("울산", 150);
		map.put("세종", 15);
		map.put("서울", 980);
		
		System.out.println(map);
		
		// map에서 키의 반환
		int n = map.get("서울");
		System.out.println("서울 : " + n);
		
		// n=map.get("경기"); 런타임 에러 - 존재하지 않으면 null
		Integer a = map.get("경기");
		System.out.println(a); // null
		
		// Map에는 Iterator이 없으므로 향상된 for문을 사용할 수 없다.
		// map.keySet() : set
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			Integer value = map.get(key);
			System.out.println(key + " -> " + value);
		}
		System.out.println();
		
		System.out.println("키에 서울 존재 ? " + map.containsKey("서울"));
		System.out.println("키에 경기 존재 ? " + map.containsKey("경기"));
		System.out.println("값에 350 존재 ? " + map.containsValue(350));
		
		System.out.println("전체 개수 : " + map.size());
		
		map.remove("세종"); // 삭제 후 삭제한 객체 반환
		System.out.println(map);
		
		
	}
	
	
}
