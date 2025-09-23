package ch07.unit04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EX07_Date {

	public static void main(String[] args) {
		// 시스템 시간으로 Date 객체 생성
		
		Date date = new Date();
		System.out.println(date);
		
		//1970 1 1 0시0분0초 기준으로 ms로 환산하여 반환
		long t= date.getTime();
		System.out.println(t);

		Date date2 = new Date(175859378166L);
		System.out.println(date2);
		
		// date 객체가 date2 객체 이후 객체인지 반환
		System.out.println(date.after(date2));
		
		//simpleDateFormat : 문자열 <-> Date
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 mm월 dd일 HH::mm::ss");
		String s = sdf.format(date);
		System.out.println(s);
		
		// 문자열 -> Date
		s="2005-10-10";
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-mm-dd");
		try {
			Date date3 = sdf2.parse(s);
			
			s=sdf.format(date3);
			System.out.println(s);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
