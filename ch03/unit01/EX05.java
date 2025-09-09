package ch03.unit01;

import java.util.Scanner;

public class EX05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		double a;
		double b;

		System.out.println("실수?");
		a=sc.nextDouble();

		
		b=(long)(a* 100)/100.;
		System.out.println("소수점 셋 째 자리 버림 결과 : "+ b);
		
		sc.close();

	}

}
