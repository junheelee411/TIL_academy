package ch04.unit02;

import java.util.Scanner;

/*
 	switch 표현식
 	: -> 또는 yield를 사용하여 값 반환
 	: 반드시 default가 필요
 	: 수식이 두 줄 이상인 경우 {}가 필요하고
 	{} 안에서 값을 반환 할 때 yield 사용
 	: switch ~ case 구문 마지막에 ;필요
 	:jdk 14에서 표준화
 */

public class EX07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int year, month, date;
		
		System.out.println("년도 ?");
		year = sc.nextInt();
		
		System.out.println("월 ?");
		month = sc.nextInt();
		
		date = switch(month) {
		case 1,3,5,7,8,10,12 -> 31;
		case 4,6,9,11 -> 30;
		default -> {int n = year%4==0 && year%100!=0 || year%400==0 ? 29 : 28;
		yield n;
		}
		};
		
		System.out.printf("%d년 %d월의 마지막 일자는 %d일입니다. \n",year,month,date);
		
		
		sc.close();
	}
}
