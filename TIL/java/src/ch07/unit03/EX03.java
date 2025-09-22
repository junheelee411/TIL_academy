package ch07.unit03;

public class EX03 {

	public static void main(String[] args) {
		String s1 = "Seoul Korea";
		String s2;
		int n;
		
		n=s1.length();
		System.out.println("문자열 길이 : " + n);
		
		// 6번째 인덱스에서 8번째 인덱스까지의 문자열 추출(인덱스0부터)
		// substring(s,e)  : s인덱스에서 e-1 인덱스까지 문자열 추출 (e-s)개
		s2=s1.substring(6,9);
		System.out.println("특정 위치 문자열 추출 " + s2);
		
		s2=s1.substring(6);
		System.out.println("특정 위치에서 끝까지 문자열 추출 " + s2); //Korea

		s2=s1.toUpperCase();
		System.out.println("문자열을 모두 대문자로 : " + s2);
		
		//특정 문자 추출
		char c= s1.charAt(6);
		System.out.println("6인덱스 문자 : " + c);
		
		//문자열 비교
		System.out.println(s1.equals("Seoul Korea"));
		System.out.println(s1.equals("seoul Korea"));
		System.out.println(s1.equalsIgnoreCase("Seoul Korea")); //대소문자 구분하지 않음 true
		
		//문자열이 특정 문자열로 시작하는지 판단
		System.out.println(s1.startsWith("Seoul"));
		
		//문자열이 특정 문자열로 끝나는지 판단
		System.out.println(s1.endsWith("Korea"));
		
		//문자열 비교
		// 문자열은 > >= < <=으로 비교 불가
		// 문자열을 사전식 비교
		System.out.println(s1.compareTo("Seoul Corea"));
		// 'k' - 'C' : 107-99=8 (첫글자만 비교)
		
		// 문자열 배열의 문자열을 구분자를 사용하여 결합
		String []ss = {"java","oracle","spring"};
		s1=String.join(",", ss);
		System.out.println(s1);
		
		

		
		
	}

}
