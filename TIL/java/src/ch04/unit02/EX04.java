package ch04.unit02;

import java.util.Scanner;

public class EX04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("정수 ? ");
		n = sc.nextInt();
		
		// default : 만족하는 case가 없는 경우 실행, 위치 상관 없지만 통상적으로 제일 아래
		
		switch(n)
		{
		case 3: System.out.println("***");
				break;
		case 2: System.out.println("**");
				break;
		case 1: System.out.println("*");
				break;
		default: System.out.println("입력 에러");
				break;
		}

		sc.close();
	}

}
