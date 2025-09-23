package ch07.unit08;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class EX02 {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		
		System.out.println(now);
		
		int y = now.getYear();
		int m = now.getMonthValue();
		int d = now.getDayOfMonth();
		
		DayOfWeek week = now.getDayOfWeek();
		String w = week.toString(); // 영어 요일
		int h = now.getHour();
		int mi = now.getMinute();
		int s = now.getSecond();
		int n = now.getNano();
		
		System.out.printf("%4d-%02d-%02d %02d:%02d:%02d.%d %s\n",y,m,d,h,mi,s,n,w);
		
		LocalDate nowDate = now.toLocalDate();
		// LocalDate nowDate = LocalDate.now();
		if(nowDate.isLeapYear()) {
			System.out.println("윤년 : 2월 29일");
		} else {
			System.out.println("평년 : 2월 28일");
		}
		
		LocalDate date = LocalDate.of(2023, 3, 10);
		int diff = LocalDate.now().compareTo(date);
		// 년도가 다르면 년 차이, 월이 다르면 월 차이, 일이 다르면 일 차이
		System.out.println("차이 : " + diff);
		
		System.out.println("현재 날짜 및 시간 : " + now);
		LocalDateTime target = now.plusYears(1).plusMonths(2).plusDays(3).plusHours(5);
		System.out.println(target);
	}

}
