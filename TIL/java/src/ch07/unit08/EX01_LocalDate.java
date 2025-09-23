package ch07.unit08;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class EX01_LocalDate {

	public static void main(String[] args) {
		// 시스템 날짜
		
		LocalDate today = LocalDate.now();
		System.out.println("시스템 날짜 : " + today);
		
		String s = today.toString();
		System.out.println(s);
		
		// 날짜 설정
		// LocalDate targetDate = LocalDate.of(2025, 10, 33); // 런타임 오류
		LocalDate targetDate = LocalDate.of(2025, 10, 3); // 월 하나 안 뺌
		System.out.println(targetDate); //2025-10-03
		
		// 시스템 시간
		LocalTime currTime = LocalTime.now();
		System.out.println(currTime);
		
		// 시간 설정
		LocalTime targetTime = LocalTime.of(17,49,49, 0);
		System.out.println(targetTime);
		
		// 시스템 날짜 및 시간 
		LocalDateTime currDateTime = LocalDateTime.now();
		System.out.println(currDateTime);
		
		// 시스템 날자 및 시간 설정
		LocalDateTime targetDateTime = LocalDateTime.of(2025, 10, 9, 5, 10, 10, 0);
		System.out.println(targetDateTime);
	}

}
