package ch04.unit01;

import java.util.Scanner;

public class EX04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		
		
		System.out.println("세 개의 정수 ? ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		int t;
		
		if(a>b)
		{
			t=a; a=b; b=t;
		}
		if(a>c)
		{
			t=a; a=c; c=t;
		}
		if(b>c)
		{
			t=b; b=c; c=t;
		}
		
		System.out.println(a + "," + b + "," + c);
		//적은수 -> 큰수
		// 10 7 8
		// 7 8 10

		sc.close();
	}

}
