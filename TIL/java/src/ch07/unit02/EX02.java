package ch07.unit02;

public class EX02 {

	public static void main(String[] args) {
		int a = 10,b;
		Integer obj =null;
		//Integer는 int에 대응하는 Wrapper 클래스
		//Integer는 null을 가질 수 있지만 int는 null을 가질 수 없다.

		// b=obj; 런타임 에러 - 널을 기본 자료형인 int에 넣을 수 없음
		//b=null; 컴파일 에러
		
		obj=a;
		b=obj;
		System.out.println(b + "," + obj);
		
		obj=20; //값을 못 바꿈 메모리에 새로 값 저장하고 가리킴
		System.out.println(b + "," + obj);
		
		System.out.println("정수 최대값 : " + Integer.MAX_VALUE);		
		System.out.println("정수 최소값 : " + Integer.MIN_VALUE);		
	}

}
