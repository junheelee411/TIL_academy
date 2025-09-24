package ch07.unit08;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class EX04 {
	public static void main(String[] args) {
		LocalDateTime date1 = LocalDateTime.of(2024, 1,1,9,0,0);
		LocalDateTime date2 = LocalDateTime.of(2025, 3,31,18,0,0);
		
		System.out.println(date1 + " : " + date2);
	
		// 날짜와 시간 비교
		if(date1.isBefore(date2)){
			System.out.println("date1이 더 작음");
		} else if(date1.equals(date2)) {
			System.out.println("동일");
		} else if(date1.isAfter(date2)) {
			System.out.println("date1이 더 큼");
		}
		
		System.out.println("날짜 및 시간 차이");
		long y = date1.until(date2,ChronoUnit.YEARS);
		System.out.println("차이 년도 : " + y); // 남은 기간이 12달이 안 되면 0
		

		System.out.println("날짜 및 시간 차이");
		y=date1.until(date2,ChronoUnit.MONTHS);
		System.out.println("차이 년도 : " + y); // 
		
		System.out.println("날짜 및 시간 차이");
		y = date1.until(date2,ChronoUnit.DAYS);
		
		System.out.println("차이 - 시간 : " + date1.until(date2,ChronoUnit.HOURS)); // 
		System.out.println("차이 - 분 : " + date1.until(date2,ChronoUnit.MINUTES)); // 
		System.out.println("차이 - 초 : " + date1.until(date2,ChronoUnit.SECONDS)); // 
		
		System.out.println("차이 - 년도 : " + ChronoUnit.YEARS.between(date1, date2));
		System.out.println("차이 - 월 : " + ChronoUnit.MONTHS.between(date1, date2));
		
		// 차이
		Period p = Period.between(date1.toLocalDate(), date2.toLocalDate());
		System.out.println("년도 차이 : " + p.getYears());
		System.out.println("월 차이 : " + p.getMonths());
		System.out.println("일 차이 : " + p.getDays());
}
}
