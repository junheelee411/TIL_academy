package ch08.unit03;

import java.util.Arrays;

public class EX04 {

	public static void main(String[] args) {
		Object obj = "Korea"; // up casting - 스트링을 오브젝트에 넣음
		System.out.println(((String)obj).equals(obj)); // down casting
		
		Object n1=10;
		Object n2=20;
		// Object n3 = n1+n2=20; // 컴파일 에러
		int n3=(Integer)n1+ (Integer)n2; 
		int n4=(int)n1+ (int)n2; //int.class가 따로 있음
		System.out.println(n3);
		System.out.println(n4);
		
		// Object[] oo = {"seoul", 90, 80, "Korea"};
		// Arrays.sort(oo); // 런타임 에러 - 숫자랑 문자 같이 sort 불가
		
		Object [] oo = {"seoul", "jeju", "Korea"};
		Arrays.sort(oo);
		System.out.println(Arrays.toString(oo));
		

	}

}
