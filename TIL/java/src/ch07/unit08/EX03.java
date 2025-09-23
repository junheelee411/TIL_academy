package ch07.unit08;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class EX03 {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println("현재 : " + now);
		System.out.println();
		
		LocalDateTime date = now.withYear(27);
		System.out.println(date);
		
		
		date=date.withDayOfMonth(4);
		date=date.withYear(2020);
		
		// 년도를 상대적으로 변경
		date = now.with(TemporalAdjusters.firstDayOfYear());
		//올해의 첫날
		System.out.println("올해 첫 날 : " + date);
		
		// 이번달의 마지막 날로 변경
		date = now.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println("이번 달의 마지막 일 : " + date);
				
		date = now.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
		System.out.println("돌아오는 월요일 : " + date);
		
		date = now.with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY));
		System.out.println("돌아오는 월요일(오늘 포함) : " + date);
		
		date = now.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));
		System.out.println("지난 월요일(오늘 포함) : " + date);
	}

}
