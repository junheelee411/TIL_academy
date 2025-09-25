package ch09.unit03;

import java.util.Scanner;

public class EX07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		
		try {
			System.out.println("두 수 ? ");
			a=sc.nextInt();
			b=sc.nextInt();
			
			c=a/b;
			
			System.out.println(a + "/" + b + "=" + c);
		} finally {
			// catch 구문 없이 사용 가능
			System.out.println("예외 발생 여부와 상관 없이 실행");
			sc.close();
		}
		
		// 예외가 발생하면 실행하지 않음
		System.out.println("end");
	}

}
