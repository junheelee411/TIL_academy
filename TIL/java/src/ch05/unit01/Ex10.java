package ch05.unit01;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// 년, 월, 일을 입력 받아 요일구하기
		Scanner sc = new Scanner(System.in);
		
		int[] days = new int[] {31,28,31,30,31,30,31,31,30,31,30,31};
		String[] week =  new String[] {"일","월","화","수","목","금","토"};
		
		int y, m, d;
		int tot;
		int w;
		
		System.out.print("년도 ? ");
		y = sc.nextInt();
		
		do {
			System.out.print("월 ? ");
			m = sc.nextInt();
		} while(m < 1 || m > 12);
		
		// 해당 년도의 2월의 마지막 날짜
		days[1] = y%4==0 && y%100!=0 || y%400==0 ? 29 : 28;
		
		do {
			System.out.print("일 ? ");
			d = sc.nextInt();
		} while( d < 1 || d > days[m-1]);
		
		// 1년 1월 1일부터 y년 m월 d일 까지 전체 날수 계산
		// 1/1/1 ~ 2025/09/15
		// 1/1/1 ~ 2024/12/31, 1월, 2월, .. 8월, 15일
		// tot = 365 * 2024 + 2024/4 - 2024/100 + 2024/400
		
		tot = (y-1) * 365 + (y-1) / 4 - (y-1) / 100 + (y-1) / 400;
		for(int i = 0; i < m-1; i++) {
			tot += days[i];
		}
		
		tot += d;
		
		w = tot % 7;
		
		System.out.printf("%d년 %d월 %d일은 %s요일 입니다.\n",
				y, m, d, week[w]);

		sc.close();
	}

}
