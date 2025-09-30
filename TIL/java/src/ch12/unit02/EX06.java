package ch12.unit02;

import java.util.Iterator;
import java.util.Vector;

public class EX06 {

	public static void main(String[] args) {
		// ArrayList : 동기화 지웒자ㅣ 않음
		// Vector : 동기화 지원(멀티 스레드 환경에서 안전)
		
		// List<String> list = new Vector<String>();
		Vector<String> list = new Vector<String>();
		
		System.out.println("초기용량 : " + list.capacity());
		
		list.add("a1");
		list.add("a2");
		list.add("a3");
		list.add("a4");
		list.add("a5");
		list.add("a6");
		list.add("a7");
		list.add("a8");
		list.add("a9");
		list.add("a10");
		list.add("a11");
		list.add("a12");
		list.add("a13");
		list.add("a14");
		list.add("a15");
		
		System.out.println("데이터 개수 : " + list.size());
		System.out.println("용량 : " + list.capacity());
		
		// 용량이 부족하면 10개씩 늘어남
		
		list.add(0,"Korea");
		System.out.println(list);
		
		System.out.println("처음 : " + list.get(0));
		System.out.println("처음 : " + list.firstElement()); //vector 메소드
		
		System.out.println("마지막 : " + list.get(list.size()-1));
		System.out.println("마지막 : " + list.lastElement()); //vector 메소드
		
		list.set(0, "대한민국"); // 수정
		System.out.println(list);
		
		for(String s : list) {
			System.out.println(s + " ");
		}
		System.out.println();
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i) + " ");
		}
		System.out.println();
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s + " ");
		}
		System.out.println();
		
		// 모두 삭제
		list.clear();
		System.out.println("삭제 후 개수 : " + list.size());
		System.out.println("삭제 후 용량 : " + list.capacity());
		
		// Vector - 용량을 개수로 조정 - 데이터 지워도 방이 줄진 않음
		list.trimToSize();
		System.out.println("용량 : " + list.capacity());
	}

}
