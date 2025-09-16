package Quiz_IF;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int year;
		String s;
		
		System.out.println("년도 입력 ? ");
		year = sc.nextInt();
		
		if(year%4==0 && (year%100!=0 || year%400==0))
		{
			s="윤년";
		}
		else
		{
			s="평년";
		}
		
		System.out.println("년도는 " + s + "입니다.");
		
		sc.close();
	}
}
