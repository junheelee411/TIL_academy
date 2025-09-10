package ch03.unit01;

import java.util.Scanner;

public class EX09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w,h;
		int a,b;
		
		//직사각형 넓이, 둘레 구하기
		
		System.out.print("가로 ? ");
		w=sc.nextInt();
		
		System.out.print("세로 ? ");
		h=sc.nextInt();
		
		a=w*h;
		b=(w+h)*2;
		
		System.out.println("넓이 : "+ a);
		System.out.println("둘레 : " + b);
		
		sc.close();
	}
}
