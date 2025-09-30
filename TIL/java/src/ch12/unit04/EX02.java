package ch12.unit04;

import java.util.LinkedHashSet;
import java.util.Set;

public class EX02 {

	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<String>();
		set.add("서울");
		set.add("부산");
		set.add("대구");
		set.add("인천");
		set.add("광주");
		set.add("대전");
		set.add("울산");
		set.add("세종");
		set.add("서울"); // 덮어씀
		
		System.out.println(set);
		
		for(String s : set) {
			System.out.println(s + " ");
		}
		System.out.println();
		}

}
