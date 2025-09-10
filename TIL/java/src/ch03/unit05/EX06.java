package ch03.unit05;

import java.util.Scanner;

public class EX06 {

	public static void main(String[] args) {
		// 연도를 입력 받아 윤년 평년 출력
		// 4의배수이고 100의 배수가 아니거나
		//400의 배수이면 윤년 / 아니면 평년
		//윤년 - 2월 29일

		
		Scanner sc = new Scanner(System.in);
		int y;
		String s;
		
		System.out.println("년도 ? ");
		y=sc.nextInt();
		
		s= (y%4!=0) ? ("평년") : ((y%100!=0)||(y%400==0) ? ("윤년") : ("평년"));
		
		System.out.println(y + " -> " + s);

		sc.close();
	}

}
