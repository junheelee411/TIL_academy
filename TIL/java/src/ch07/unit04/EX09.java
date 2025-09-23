package ch07.unit04;

import java.util.Calendar;
import java.util.Date;

public class EX09 {

	public static void main(String[] args) {
		// Calendar -> Date로 변환
		Calendar cal = Calendar.getInstance();
		
		Date date = cal.getTime();
		System.out.println(date);
		
		// java.util.Date -> java.sql.Date로 변환
		// java.sql.date : 데이터베이스에 날짜를 저장하거나 DB에 저장된 날짜를 추출할 때 사용
		// JDK 9부터는 java.sql.date를 사용하기 위해서는 다음의 모듈을 추가해야 한다.
		// requires java.se;
		
		java.sql.Date date2 = new java.sql.Date(date.getTime());
		System.out.println(date2); // 2025-09-23
		
		// java.util.Date -> Calendar
		
		cal.setTime(date);
		System.out.printf("%tF\n" , cal);

	}

}
