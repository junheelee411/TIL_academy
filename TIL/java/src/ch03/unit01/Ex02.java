package ch03.unit01;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int a,b;
		
		System.out.print("두 정수?");
		a=sc.nextInt();
		b=sc.nextInt();
		
		System.out.printf("%d + %d = %d\n",a,b,a+b);
		System.out.printf("%d - %d = %d\n",a,b,a-b);
		System.out.printf("%d * %d = %d\n",a,b,a*b);
		System.out.printf("%d / %d = %d\n",a,b,a/b);
		System.out.printf("%d %% %d = %d\n",a,b,a%b);
		
		sc.close();
	}

}
