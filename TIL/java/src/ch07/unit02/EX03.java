package ch07.unit02;

public class EX03 {

	public static void main(String[] args) {
		String s1,s2;
		int a,b;
		
		s1="123";
		s2="456";
		System.out.println(s1 + s2);
		
		//문자열을 정수로 변환
		a=Integer.parseInt(s1);
		b=Integer.parseInt(s2);
		System.out.println(a+b);
	
		// a=Integer.parseInt("1,234"); 런타임오류(NumberFormatException)
		// a=Integer.parseInt("1234.45"); 런타임오류(NumberFormatException)
		// a=Integer.parseInt("b1"); 런타임오류(NumberFormatException)
		
		//16진수 형식의 문자열을 정수로 변환
		a=Integer.parseInt("b1",16);
		System.out.println(a); //177
	
		//10진수
		a=Integer.parseInt("1100");
		System.out.println(a);
		
		//2진수
		a=Integer.parseInt("1100",2);
		System.out.println(a);
	
		//정수를 String으로 변환
		a=123;
		s1=Integer.toString(a);
		System.out.println(s1);
		
		//정수를 16진수의 String으로 변환
		a=123;
		s1=Integer.toHexString(a);
		System.out.println(s1); //7b
		
	}

}
