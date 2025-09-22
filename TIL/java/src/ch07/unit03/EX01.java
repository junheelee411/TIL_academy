package ch07.unit03;

public class EX01 {

	public static void main(String[] args) {
		// 문자열은 상수풀에 저장
		// 상수풀에 동일한 문자열이 존재하는 경우 문자열의 주소를 반환
		String s1="Seoul"; // 상수풀에 저장하고 주소 가짐
		String s2="Seoul"; // 새로 생성안하고 기존 주소만 대입
		
		String s3=new String("Seoul"); // 새로운 객체 생성하여 문자열 설정
		
		System.out.println(s1+" , " + s2 +" , "+ s3);
		
		System.out.println(s1==s2); //주소비교 true
		System.out.println(s1==s3); //주소비교 false

		// 동일한 객체는 해쉬 코드가 같지만 해쉬코드가 같다고 동일한 객체는 아님
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		// 문자열은 불변
		// 문자열을 변경하면 기존의 문자열이 변경되는 것이 아니라 새로운 메모리를할당받아 처리한다
		
		s1+="Korea";
		System.out.println(s1); //SeoulKorea
		System.out.println(s2); //Seoul
		System.out.println(s1==s2); //false
		
		//char c=''; 컴파일 에러
		String s4=""; // 문자열 길이가 0인 문자열 메모리 할당 o 길이 0
		System.out.println(s4.length()); //문자열 길이 0	 
		
		String s5=null;
		System.out.println(s5.length()); //메모리 할당 x
	}

}
