package ch12.unit02;

import java.util.ArrayList;
import java.util.List;

public class EX01_ArrayList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		// 마지막에 요소 추가
		list.add("서울");
		list.add("부산");
		list.add("인천");
		list.add("광주");
		list.add("서울"); // 중복 요소 추가 가능
		list.add("대전");
		
		System.out.println(list);
		
		// 인덱스 2에 대구 추가
		list.add(2, "대구");
		System.out.println(list);
		
		// 객체 개수
		System.out.println(list.size());
		
		// 처음 자료 반환
		System.out.println(list.get(0));
		System.out.println(list.getFirst()); // JDK 21부터 가능
		
		// 두 번째 자료 반한
		System.out.println(list.get(1));
		
		// 마지막 자료 반환
		System.out.println(list.get(list.size()-1));
		System.out.println(list.getLast());
		
		// 처음에 한국 추가
		list.add(0,"한국");
		System.out.println(list);
		
		// 처음 데이터를 대한민국으로 수정
		list.set(0, "대한민국");
		System.out.println(list);
		
		// 인천은 몇 번째 인덱스에?
		System.out.println(list.indexOf("인천"));
		
		// 인덱스에 없을 떄
		System.out.println(list.indexOf("세종"));
		
		// 서울을 끝에서부터 검색
		System.out.println(list.lastIndexOf("서울"));
		
		// 부산 존재 여부
		System.out.println("부산 존재 여부 : " + list.contains("부산"));
		
		// 대한민국 앞에서부터 하나 삭제
		System.out.println(list.remove("대한민국"));
		
		// 전체 출력 -1
		for(String str : list) {
			System.out.print(str + " ");
		}
		System.out.println();
		
		// 전체 출력 -1
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		
	}
}
