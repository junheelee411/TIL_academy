package ch04.unit01;

import java.util.Scanner;

public class EX01_if {

	public static void main(String[] args) {
		//절대값 구하기
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		
		System.out.println("정수 ? ");
		a = sc.nextInt();
		
		/*
		if(a<0)
		{
			b=-a;
		}
		
		System.out.println(a + " -> " + b);
		*/
		
		b=a;
		if(a<0)
		{
			b=-a;
		}
		
		System.out.println(a + " -> " + b);
		
		sc.close();

	}

}
