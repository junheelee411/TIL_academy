package ch04.unit03;

import java.util.Scanner;

public class EX04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, n;
		
		System.out.println("양의 정수 ? ");
		num = sc.nextInt();
		
		//1부터 num까지 홀수 출력
		
		n=1;
		while(n<=num)
		{
			System.out.println(n);
			n+=2;
		}
		
		sc.close();

	}

}
