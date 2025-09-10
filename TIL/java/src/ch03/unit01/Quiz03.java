package ch03.unit01;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int r;
		double area,circumference;
		double PI = 3.141592;
		
		System.out.println("원의 반지름 입력 : ");
		r = sc.nextInt();
		
		
		area= r*r*PI;
		circumference= r*2*PI;
		
		// 실수 먼저 곱해야 실수 나오니까 그게 더 좋아요 값 커지면 음수될수있음
		
		System.out.printf("넓이 : %.2f \n",area);
		System.out.printf("둘레 : %.2f",circumference);
		
		sc.close();

	}

}
