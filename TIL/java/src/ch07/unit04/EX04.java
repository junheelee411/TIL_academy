package ch07.unit04;

import java.util.Calendar;

public class EX04 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(2025, 9-1, 3); //2025 09 03
		cal.getTime();
		System.out.printf("%tF %tT\n",cal,cal);
		
		int w = cal.get(Calendar.DAY_OF_WEEK);
		
		//ca 객체를 복제하여 새로운 객체 작성(필드값도 복제됨)
		Calendar sday = (Calendar)cal.clone();
		sday.add(Calendar.DAY_OF_MONTH, -(w-1));
		System.out.printf("%tF\n", sday); //주의 시작일
		
		Calendar eday = (Calendar)cal.clone();
		eday.add(Calendar.DAY_OF_MONTH, 7-w);
		System.out.printf("%tF\n", eday); //주의 마지막일
		
		

	}

}
