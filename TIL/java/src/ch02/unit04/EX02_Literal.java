package ch02.unit04;

public class EX02_Literal {

	public static void main(String[] args) {
		int a=0b101; //2진수 5
		int b= 0101; //8진수 65
		int c=101; //10진수 101
		int d=0x101; //16진수 257
		long e = 101L; //long
		
		System.out.println(a+","+b+","+c+","+d+","+e);

		//a=0b201; 컴파일 오류- 2진수에는 2가 없음
		
		a=0xAB3;
		System.out.println(a); //2739
		
		
		
	}

}
