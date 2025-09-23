package ch07.unit04;

import java.util.Calendar;

public class EX03 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		//cal.set(2025,9-1,20)
		cal.set(Calendar.YEAR, 2025);
		cal.set(Calendar.MONTH, 10-1);
		cal.set(Calendar.DATE, 5);
		System.out.printf("%tF\n",cal);
		
		cal.set(Calendar.DAY_OF_WEEK, 1); // 일요일로 변경
		System.out.printf("%tF\n",cal);
		// 이상 현상 발생 : 실제 시간값이 변경되지 않음
		// 요일은 현재 시스템의 날짜가 있는 주의 요일을 반환
		//get() 메소드를 호출하지 않으면 시간을 변경하지 않는다
		//set()메소드는 calendar의 필드값은 변경하지만 시간은 변경하지 않는다
		//시간은 get(), getXxx(), add()메소드를 호출해야 변경가능
		System.out.println();
		
		Calendar cal2 = Calendar.getInstance();
		cal2.set(Calendar.YEAR, 2025);
		cal2.set(Calendar.MONTH, 9-1);
		cal2.set(Calendar.DATE, 5);
		cal.getTime();
		cal2.set(Calendar.DAY_OF_WEEK, 1);
		System.out.printf("%tF\n",cal2);
		

	}

}

