package ch04.unit02;

import java.util.Scanner;


/*
 	-강화된 switch
 		: 여러 조건
 		case 값1,값2,값3 -> 수식
 		
 	-화살표  case 라벨 (->)를 사용하면 마지막에 break를 사용한 것과 동일 
 	- "를 사용할 때 두 줄 이상의 구문은 반드시 중괄호로 묶어준다.
 	
 	jdk 14부터만 사용 가능
 */
public class Quiz04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int year, month, date;
		
		System.out.println("년도 ?");
		year = sc.nextInt();
		
		System.out.println("월 ?");
		month = sc.nextInt();

		switch(month)
		{
		case 1,3,5,7,8,10,12 -> date=31;
		case 4,6,9,11 -> date=30;
		case 2 -> date = year%4==0 && year%100!=0 || year%400==0 ? 29 : 28;
		default -> date = -1;
		}
		
		if (date==-1)
		{
			System.out.println("월 입력 오류...");
		}
		else
		{
			System.out.println(year + "년" + month + "의 마지막 일자는" + date + "입니다.");	
		}
		
		sc.close();
		
	}

}