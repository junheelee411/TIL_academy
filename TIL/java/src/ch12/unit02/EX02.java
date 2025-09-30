package ch12.unit02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EX02 {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		list1.add("서울");
		list1.add("부산");
		list1.add("대구");
		
		List<String> list2 = new ArrayList<String>();
		list1.add("강원");
		list1.add("경기");
		list1.add("제주");
		
		list2.addAll(list1);
		System.out.println(list2);
		
		// List<String> -> String[]
		String[] ss = list2.toArray(new String[list2.size()]);
		System.out.println("리스트 -> 배열");
		for (String s : ss) {
			System.out.println(s + " ");
		}
		System.out.println();

		// String[] -> List<String>
		
		List<String> list3 = Arrays.asList(ss);
		System.out.println("배열을 리스트로 복사 후" + list3);
		
		System.out.println(list2.getClass().getName());
		System.out.println(list3.getClass().getName());
		
		// subList(a,b) : a 인덱스에서 b-1 인덱스까지의 부분 List
		List<String> list4 = list2.subList(1, 4);
		System.out.println(list4);
		
}

}
