package ch07.unit04;

import java.util.Calendar;

public class EX01_Calendar {

	public static void main(String[] args) {
		// 현재 시스템의 날짜를 이용하여 Calendar 객체 생성
		Calendar cal = Calendar.getInstance();
		
		String s = String.format("%tF %tT %tA", cal,cal,cal);
		// %tF 년원일 %tT 시분초 %tA 요일
		System.out.println(s);
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		//cal.get(Calendar.MONTH) : 0~11

		
		int day= cal.get(Calendar.DATE); //1일~7토
		System.out.println(year + " , " + month + " , " + day);

		System.out.println("이 달의 가장 마지막 일자 : " + cal.getActualMaximum(Calendar.DATE));
		System.out.println("현재 요일이 이달의 몇 번째 요일 " + cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("올해의 현재 주차 : " + cal.get(Calendar.WEEK_OF_YEAR));
		//1~6주
		
		System.out.println("오전/오후 ?" + cal.get(Calendar.AM_PM));
		//오전 0 오후 1
		
		System.out.println("시간(0~11) : " + cal.get(Calendar.HOUR));
		System.out.println("시간(0~23) : " + cal.get(Calendar.HOUR_OF_DAY));
		System.out.println("분 : " + cal.get(Calendar.MINUTE));
		System.out.println("초 : " + cal.get(Calendar.SECOND));
		System.out.println("ms : " + cal.get(Calendar.MILLISECOND));
		
	}

}
