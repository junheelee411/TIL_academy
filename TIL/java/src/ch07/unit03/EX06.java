package ch07.unit03;

public class EX06 {

	public static void main(String[] args) {
		String p,s;
		
		// ^ : ~로 시작하는, $: 로 끝나는, + : 하나 이상
		p="^[가-힣] + $"; // 범위는 대괄호 안 [] 
		s="홍길동";
		System.out.println(s.matches(p)); //정규식 패턴에 일치하면 true
		s="홍ㅋ동";
		System.out.println(s.matches(p)); 
		
		// \\d:숫자, {n,m} : 최소 n자 최대 m자
		p="\\d{1,3}";
		
		s="123";
		System.out.println(s.matches(p)); 
		
		s="1234";
		System.out.println(s.matches(p)); 
		
		p="010-\\d{4}-\\d{4}";
		s="010-1234-1234";
		System.out.println(s.matches(p));
		
		s="우리 12 abc 67 & 79";
		
		// 숫자가 아닌 것은 모두 *로 치환
		//[^a] : a가 아닌 모든 것
		String s2 = s.replaceAll("[^0-9]", "*");;
		System.out.println(s2);
		
		

	}

}
