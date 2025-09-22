package ch07.unit03;

public class EX11_StringBuilder {
	// StringBuffer와 Stringbuilder
	// 가변적인 문자열을 처리하는 경우 String보다 빠름
	// StringBuffer - 동시성을 지원. 다중 스레드 환경에서 안전
	// StringBuilder - 동시성 미지원. 다중 스레드 환경에서 위험. StringBuffer보다 빠름
	// 가변적인 문자열 처리가 아닌 경우 String 사용
	// 일반적으로 StringBuffer와 Stringbuilder는 마지막에 String으로 변환되어 사용됨
	
	public static void main(String[] args) {
		// 자바에서 문자열을 결합할 때 아래처럼 작성하면 선임자에게 욕을 많이 먹어 배불러요
		// 문자열 새로 계속 할당해야해서 성능 떨어짐
		/*
		String s = "java";
		s+="oracle";
		s+="spring";
		*/
		
		
		StringBuilder sb1 = new StringBuilder("Korea");
		StringBuilder sb2 = new StringBuilder("Korea");
		
		System.out.println(sb1);
		System.out.println(sb2);
		
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2)); 
		//object의 equals(주소 비교)
		// StringBuffer와 Stringbuilder의 equals는 주소 비교
		
		// 문자열 비교 -> String으로 전환
		System.out.println(sb1.toString().equals(sb2.toString()));
		
		String s = "Korea";
		//다른 객체와 문자열 비교
		
		System.out.println(s.contentEquals(sb1));
	}

}
