package ch12.unit02;

import java.util.ArrayList;
import java.util.List;

/*
 	ArrayList
 	- List interface 구현 class
 	검색 시 속도 빠름
 	동기화되지 않음
 	
 	LinkedList
 	- List interface 구현 class
 	- 검색 시 속도 느림
 	- 동기화되지 않음
 	- 앞에서 추가하고 뒤에서 삭제가 빈번한 경우 빠름
 	- 중간에 삽입 삭제 시에는 속도가 현저히 떨어짐
 	
 */

public class EX03 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("서을");
		list.add("부산");
		list.add("대구");
		System.out.println(list);

	}

}
