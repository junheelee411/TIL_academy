package ch05.unit01;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 각 월의 마지막 날짜. 2월의 년도에 따라 계산필요
		int []days = new int[] {31,28,31,30,31,30,31,31,30,31,30,31};
		int y, m;
		int tot, w;
		
		do {
			System.out.print("년도 ? ");
			y = sc.nextInt();
		} while(y < 1900);
		
		do {
			System.out.print("월 ? ");
			m = sc.nextInt();
		} while(m < 1 || m > 12);
		
		// 년도에 따른 2월의 마지막 날짜 계산
		days[1] = y%4==0 && y%100!=0 || y%400==0 ? 29 : 28;
		
		// 1년 1월 1일부터 y년 m월 1일까지 전체 날수 계산
		
		// 1/1/1 ~ (y-1)/12/31 까지 날수
		tot = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400;
		
		// y년 1월 1일부터 y년 m-1월 말일까지 더하기 
		for(int i = 0; i < m-1; i++) {
			tot += days[i];
		}
		
		// 1일 더하기
		tot++;
		
		// y년 m월 1일의 요일 구하기
		w = tot % 7;
		
		System.out.println("\t" + y + "년" + m + "월");
		System.out.println("       월  화  수  목  금  토  일");
		System.out.println("------------------------------------");
		
		// 1일 앞부분 공백처리
		for(int i = 0; i < w; i++) {
			System.out.print("    ");
		}
		
		// 1일부터 말일까지 출력
		for(int i = 1; i <= days[m-1]; i++) {
			System.out.printf("%4d", i);
			if(++w % 7 == 0) {
				System.out.println();
			}
		}
		if(w%7 !=0) {
			System.out.println();
		}
		System.out.println("-----------------------------------");
		
		
		
		sc.close();
	}
}
