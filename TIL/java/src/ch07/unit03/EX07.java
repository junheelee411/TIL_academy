package ch07.unit03;

public class EX07 {

	public static void main(String[] args) {
		String s;
		int n,m;
		
		s="  자  바  ";
		System.out.println(":" + s + ":");
		System.out.println(":" + s.trim() + ":"); // 양끝 공백 제거
		System.out.println(":" + s.replaceAll("\\s", "") + ":"); // 전체 공백 제거

		n=30;
		//s=n; 컴파일 에러
		s=n+""; //문자열 + 기본자료형 : 문자열 
		
		s=Integer.toString(n);
		System.out.println(s);
		
		n=123456;
		System.out.printf("%,d\n",n);
		
		// 세 자리마다 , 찍기
		s=String.format("%,d", n);
		System.out.println(s);
		
		m=12;
		s=String.format("%1$d %2$d %1$d", m,n);
		System.out.println(s);
		
		s="자바,오라클,스프링,HTML";
		String[] ss = s.split(","); // 특정 패턴으로 문자열을 분리하여 배열 반환
		for(String a : ss)
		{
			System.out.println(a);
		}
		
		s="KOREA";
		byte[] bb= s.getBytes(); //문자열의 각 문자에 대한 ASCII  코드 값을 byte 배열로 전환
		for(byte b : bb)
		{
			System.out.println(b);
		}
		
	}

}
