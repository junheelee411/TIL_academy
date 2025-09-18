package ch06.unit03;

public class EX09_overloading {

	public static void main(String[] args) {

		Test9 obj = new Test9();
		
		byte b=10;
		short s=10;
		short ss=10;
		int i=10;
		long l=10;
		char c='A';
		
		obj.disp();
		obj.disp(b); //short
		// 1. 매개변수의 타입이 동일한 것을 찾음
		// 2. 매개변수의 타입이 큰 것 중 가장 작은 것을 찾음
		obj.disp(s);  //short
		obj.disp(ss);
		obj.disp(i); //int
		obj.disp(l); //long
		obj.disp(c); //int
		//obj.(플롯형 실수) -> 컴파일 에러
		System.out.println();
		
		obj.write(b);//int
		obj.write(s); //short
		obj.write(ss); //int
		obj.write(i); //int
		obj.write(c);// int

		System.out.println();
		int a=10;
		obj.sub(a);
		//obj.sub2(a);  컴파일 에러 
	 	
		
	}

}

class Test9
{
	public void disp()
	{
		System.out.println("인자 없는 메소드");
	}
	
	/* 컴파일 에러 (중복 정의 위반)
	 public void disp()
	{
		System.out.println("인자 없는 메소드");
	}
	
	 */
	
	public void disp(short a)
	{
		System.out.println("short : " + a);
	}
	
	public void disp(int a)
	{
		System.out.println("int : " + a);
	}
	
	public void disp(long a)
	{
		System.out.println("long : " + a);
	}
	
	//wrapper class : 기본형 데이터를 클래스로 처리할 수 있도록 제공되는 클래스
	//Byte, Short, Integer, Long, Float, Double, Character, Boolean 등
	
	/*
	 * Integer a = 10;
	 * a= null;
	 * int b=10;
	 b=null; 불가
	 */
	
	// 기본 자료형은 기본자료형에서 찾는다 (래퍼클래스에서 찾지x)
	// 
	 
	public void write(Short a)
	{
		System.out.println("short : " + a);
	}
	
	public void write(int a)
	{
		System.out.println("int : " + a);
	}
	
	public void write(Long a)
	{
		System.out.println("Long : " + a);
	}
	
	public void sub(long a)
	{
		System.out.println("long : " + a);
	}
	
	public void sub2(Long a)
	{
		System.out.println("Long : " + a);
	}
}
