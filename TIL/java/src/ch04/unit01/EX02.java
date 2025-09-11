package ch04.unit01;

import java.util.Scanner;


public class EX02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a;
		
		System.out.println("정수 ? ");
		a = sc.nextInt();
		
		if(a%2==1)
		{
			System.out.println(a + " -> 홀수");
		}
		
		sc.close();
	}

}
