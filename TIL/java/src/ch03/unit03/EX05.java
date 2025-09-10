package ch03.unit03;

import java.util.Scanner;


//홀짝 판별 by 비트단위연산자

public class EX05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		String s;
		
		System.out.println("정수 ? ");
		a = sc.nextInt();
		
		s = (a & 1) ==0 ? "짝수" : "홀수";
		System.out.println(a + " -> " + s);
		
		sc.close();
	}

}
