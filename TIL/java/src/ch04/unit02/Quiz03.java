package ch04.unit02;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int year, month, date;
		
		System.out.println("년도 ?");
		year = sc.nextInt();
		
		System.out.println("월 ?");
		month = sc.nextInt();

		switch(month)
		{
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			date = 31; break;
		case 4: case 6: case 9: case 11: 
			date = 30; break;
		case 2 :
			date = year%4==0 && year%100!=0 || year%400==0 ? 29 : 28; break;
		default :
			date = -1; break;
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
