package ch04.unit01;

import java.util.Scanner;

public class EX03__ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		
		System.out.println("정수 ? ");
		a = sc.nextInt();
		
		/*
		String s = "짝수";
		if(a%2==1)
		{
			s="홀수";
		}
		
		System.out.println(a + " -> " + s);
		*/
		

		if(a%2==1)
		{
			System.out.println(a + " -> " + "홀수");
		} 
		else
		{
			System.out.println(a + " -> " + "짝수");
		}
		
		/*
		String s;
		if(a%1==1)
		{
			s="홀수"
		}
		else 
		{
			s="짝수"
		}
		System.out.println(a + " -> " + s);
		
		
		*/
		sc.close();

	}

}
