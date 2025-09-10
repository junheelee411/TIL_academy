package ch03.unit05;

import java.util.Scanner;

public class EX01 {

	public static void main(String[] args) {
		// 삼항 연산자
		//변수 = 조건식 ? 참일때 : 거짓일때
		
		Scanner sc = new Scanner(System.in);
		int a,b;
		
		System.out.println("정수 ?");
		a = sc.nextInt();
		
		// 정수 절대값 구하기
		b=a>0 ? a : -a;
		System.out.println(a + "의 절대값 : " + b);
		
		sc.close();

	}

}
