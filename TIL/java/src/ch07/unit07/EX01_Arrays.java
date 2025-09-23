package ch07.unit07;

import java.util.Arrays;
import java.util.Collections;

public class EX01_Arrays {

	public static void main(String[] args) {
		String[] ss = new String[] {"서울","대전","대구","인천","광주","대전","울산"};
		String s;
		
		// Arrays : 배열에 관련된 메소드 제공
		
		// 배열의 각 요소를 "[값1, 값2...값n]"형식의 문자열로 반환

		s=Arrays.toString(ss);
		System.out.println(s);
		
		// 오름차순
		Arrays.sort(ss);
		s=Arrays.toString(ss);
		System.out.println(s);
		
		// 내림차순
		Arrays.sort(ss,Collections.reverseOrder());
		s=Arrays.toString(ss);
		System.out.println(s);

		/*
		Object[] oo = new Object[] {20,"자바",50,"오라클"}; // object는 최상위 클래스라 뭐든 가질 수 있음
		Arrays.sort(oo); // 런타임 에러 - 서로 다른 타입은 비교 불가능함
		*/
		
		
		
	}

}
