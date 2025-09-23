package ch07.unit04;

import java.util.Calendar;

public class EX02 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		cal.set(2005, 10-1, 10);
		System.out.printf("%tF %tA\n",cal,cal);
		
		//2026 5 32로 날짜 변경
		cal.set(Calendar.YEAR,	2026);
		cal.set(Calendar.MONTH,	5-1);
		cal.set(Calendar.DATE,	32);
		System.out.printf("%tF\n",cal); //260601 자동으로 넘어감
		
		//2025 7 8 여친만남 100일 후는?
		cal.set(2025, 7-1, 8);
		cal.add(Calendar.DATE, 100);
		System.out.printf("%tF\n",cal);
		
		
		//1970 1 1 0시0분0초를 기준으로 밀리초로 환산하여 반환(UTC)
		//협정 세계시 UTC에 +9하면 한국 시간
		long t = cal.getTimeInMillis();
		System.out.println(t);
		
	}

}
