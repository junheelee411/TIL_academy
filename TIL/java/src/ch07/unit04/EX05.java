package ch07.unit04;

import java.util.Calendar;
import java.util.Scanner;

// 년 월 일을 입력받아 요일 구하기
// 날짜 ? 2025-09-23
// 2025-09-23은 화요일

public class EX05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Calendar cal = Calendar.getInstance();
		String inputDate;
		
		do {
		System.out.println("날짜 ? ");
		inputDate = sc.next();
		} while(! inputDate.matches("^()\\d{4}-\\d{2}-\\d{2}$"));
		
		// 입력받은 문자열 숫자로 변환
		String[] st =inputDate.split("-");
		int year = Integer.parseInt(st[0]);
		int month = Integer.parseInt(st[1]);
		int date = Integer.parseInt(st[2]);
		
		cal.set(year,month-1,date);
		cal.getTime();
		
		System.out.printf("%tF %tA\n" , cal,cal);
		
		sc.close();
	}

}
