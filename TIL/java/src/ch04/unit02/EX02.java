package ch04.unit02;

import java.util.Scanner;

public class EX02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("정수 ? ");
		n= sc.nextInt();
		
		switch(n)
		{
		case 3: System.out.println("*");
				System.out.println("#");
				System.out.println("@");
				break; //switch-case문 빠져나감
		case 2: System.out.println("*");
				System.out.println("#");
				break;
		case 1: System.out.println("*");
		}

		sc.close();
	}

}
