package ch03.unit05;

import java.util.Scanner;

public class EX04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,b,c;
		
		System.out.println("두 정수 ? ");
		a= sc.nextInt();
		b= sc.nextInt();
		
		//a~b 사이의 정수의 개수
		c= (b>a) ? b-a+1 : a-b+1;
	
		System.out.println("정수의 개수 : " +c);
		
		sc.close();

	}

}
