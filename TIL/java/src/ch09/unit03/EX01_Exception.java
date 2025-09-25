package ch09.unit03;

import java.util.Scanner;

public class EX01_Exception {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		
		System.out.println("두 정수 ? ");
		a=sc.nextInt();
		b=sc.nextInt();

		c=a/b;
		System.out.println(a + "/" + b + "=" + c);
		
		// b가 0인 경우 프로그램은 비정상적인 종료로 아래 코드는 실행되지 않음
		System.out.println("end");
		
		sc.close();
	}

}
