package ch07.unit07;

import java.util.Arrays;

public class EX02 {

	public static void main(String[] args) {
		String[] ss = new String[]{"서울","대전","대구","인천","광주","대전","울산"};
		
		// 이분 검색 : 반드시 정렬되어 있어야 가능
		Arrays.sort(ss);
		System.out.println("정렬 후 : " + ss.toString());
		
		int idx = Arrays.binarySearch(ss, "대구");
		System.out.println("대구의 위치 : " + idx);
		
		idx = Arrays.binarySearch(ss, "제주");
		System.out.println("제주의 위치 : " +  idx); // 없으면 -1

	}

}
