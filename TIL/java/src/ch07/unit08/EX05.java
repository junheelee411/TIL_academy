package ch07.unit08;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class EX05 {

	public static void main(String[] args) {
		DateTimeFormatter formatter;
		LocalDate localdate;
		String s;
		
		// 문자열 -> LocalDate
		localdate = LocalDate.parse("2025-09-30");
		System.out.println(localdate);
		
		
		//localdate = LocalDate.parse("2025-09-32"); 런타임 에러
		//localdate = LocalDate.parse("2025/09/30"); 런타임 에러
		
		formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		localdate = LocalDate.parse("2025/09/30", formatter); 
		System.out.println(localdate);
		
		formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
		localdate = LocalDate.parse("2025.09.30", formatter); 
		System.out.println(localdate);
		
		// Localdate 문자열로 변환
		localdate = localdate.now();
		s=localdate.toString();
		System.out.println(s);
		
		formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
		s=localdate.format(formatter);
		System.out.println(s);

		formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
		s=localdate.format(formatter);
		System.out.println(s);

		// 2025년 9월 24일 오전 0시 0분
		LocalDateTime idt = LocalDateTime.now();
		
		formatter = DateTimeFormatter.ofPattern("yyyy년 M월 dd일 a h시 m분"); //M 두개쓰면 09월
		s=idt.format(formatter);
		System.out.println(s);
		
		


	}

}
