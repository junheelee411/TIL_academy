package ch07.unit03;

public class EX05 {

	public static void main(String[] args) {
		String s1="seoul Korea";
		String s2;
		int n;
		
		// 특정 문자 또는 문자열이 문자열에서 몇 번째 존재하는지 반환(인덱스는 0부터)
		// 없으면 -1 반환
		
		n=s1.indexOf("Kor");
		System.out.println("Kor 위치 : " + n);
		

		n=s1.indexOf("KOR");
		System.out.println("KOR 위치 : " + n);
		
		n=s1.indexOf("o");
		System.out.println("o의 위치 : " + n);
		
		n=s1.indexOf("o,3");
		System.out.println("3인덱스부터 검색하여 o의 위치 : " + n);
		
		n=s1.lastIndexOf("o");
		System.out.println("마지막부터 검색하여 o의 위치 : " + n);
		
		
		System.out.println(s1.contains("Kor")); //문자열이 존재하면 true
		
		s1="우리나라 대한민국 대한사람";
		s2=s1.replace("대한", "大韓"); //정규식 사용 불가
		System.out.println(s2);
	
		s2=s1.replaceAll("대한", "大韓"); // 정규식 사용
		System.out.println(s2);
	
		// 패턴 : 숫자 - \\d, 공백(엔터포함) - \\s
		s1="우리 123 나라 456 대한 Korea";
		
		//숫자 제거
		s2=s1.replaceAll("\\d", "");
		System.out.println(s2);
		
		// 공백 제거
		s2=s1.replaceAll("\\s", "");
		System.out.println(s2);
		
		// 숫자, 공백 제거
		s2=s1.replaceAll("\\d|\\s", ""); //(| 또는)
		System.out.println(s2);
		
		// 숫자, 영문자 제거
		s2=s1.replaceAll("\\w", ""); 
		System.out.println(s2);
		

		// 숫자, 영문자 빼고 제거
		s2=s1.replaceAll("\\W", ""); //대문자는 소문자의 반대 효과
		System.out.println(s2);
		
	}

}
