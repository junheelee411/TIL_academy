package ch12.unit06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EX01 {

	public static void main(String[] args) {
	 List<String> list = new ArrayList<String>();
	 
	 list.add("서울");
	 list.add("부산");
	 list.add("대구");
	 list.add("인천");
	 list.add("광주");
	 list.add("대전");
	 list.add("울산");
	 list.add("세종");
	 System.out.println(list);
	 
	 int idx;
	 
	 // 순차검색
	 idx = list.indexOf("인천");
	 System.out.println("인천 위치 : " + idx);
	 
	 // 크기순으로 정렬(오름차순) - Comparable 인터페이스가 구현되어 있어야 가능
	 Collections.sort(list);
	 System.out.println("정렬후 : " + list);
	 
	 // 이분 검색 : 정렬되어 있어야 가능
	 idx = Collections.binarySearch(list, "서울");
	 System.out.println("서울위치 : " + idx);
	 // 없으면 -1
	 
	 // 크기 순으로 정렬(내림차순)
	 Collections.sort(list, Collections.reverseOrder());
	 System.out.println("내림차순 : "+ list);
	}

}

