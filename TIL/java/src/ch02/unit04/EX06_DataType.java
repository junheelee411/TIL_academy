package ch02.unit04;

public class EX06_DataType {

	public static void main(String[] args) {
		
		//char - 2byte, 부호 없는 정수
		char c1='A', c2;
		c2='\u0041'; //유니코드: 16진수, 10진수 65-> 'A'

		System.out.println(c1+","+c2);
		
		c1='대';
		System.out.println(c1);
		
		//c2='' 컴파일 오류 - char에 공백만 넣기 불가
		
		int a=c1; //int > char
		System.out.println(a); //45824=='대'의 유니코드값
		
		a='한';
		System.out.println(a);
		
		char c3=54620;
		System.out.println(c3);
		
		a='0';
		System.out.println(a);
		
		double x='K';
		System.out.println(x);
	}

}
