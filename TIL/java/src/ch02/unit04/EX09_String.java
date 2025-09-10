package ch02.unit04;

public class EX09_String {

	public static void main(String[] args) {
		String s1,s2,s3;
		
		s1="Seoul";
		s2="Korea";
		s3=s1+s2;
		System.out.println(s3);
		
		s3=""; //길이가 0인 문자열
		System.out.println(s3.length()); //문자열 길이 .length()
		
		// 문자열 + 기본자료형 -> 문자열로 결합
		s3="X" + 'A' + 10;
		System.out.println(s3);
		
		//문자+정수->정수
		s3='A' + 10 + "X";
		System.out.println(s3);
		
		
	}

}
