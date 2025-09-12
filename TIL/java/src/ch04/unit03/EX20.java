package ch04.unit03;

import java.util.Scanner;

public class EX20 {

	public static void main(String[] args) {
		// 1~9 사이의 수를 입력 받아 입력받은 수의 구구단 출력
		// 단 입력 받은 수가 1~9 사이의 수가 아니면 다시 입력받음
		
		Scanner sc = new Scanner(System.in);
		
		int dan, n;
		
		/*
		System.out.println("구구단(1~9 사이의 수 입력)");
		dan = sc.nextInt();
		
		while(1>dan || dan>9)
		{
			System.out.println("구구단(1~9 사이의 수 입력)");
			dan = sc.nextInt();
		}
		
		n=0;
		while(n<9)
		{
			n++;
			System.out.printf("%d * %d = %d\n",dan,n,dan*n);
		}
		*/
		
		do
		{
			System.out.println("구구단(1~9 사이의 수 입력)");
			dan = sc.nextInt();
		} while(1>dan || dan>9);
		
		n=0;
		while(n<9)
		{
			n++;
			System.out.printf("%d * %d = %d\n",dan,n,dan*n);
		}
		

		sc.close();
	}

}
