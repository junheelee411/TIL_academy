package ch03.unit05;

import java.util.Scanner;

public class EX05 {

	public static void main(String[] args) {
		//한 문자 입력받아 소문자-> 대문자, 대문자-> 소문자
		//영문자 아니면 그대로 출력
		
		Scanner sc = new Scanner(System.in);
		char a,b;
		
		System.out.println("한 문자 ? ");
		a = sc.next().charAt(0);
		
		//'A' 65~90 'a' 97~122 차이 32

		b = (a>= 'A' && a<='Z' )? (char)(a+32):
			(a>= 'a' && a<='z'? (char)(a-32):a);
		
		System.out.println(a+" -> "+b);
		
		sc.close();
	}

}
