package ch07.unit04;

import java.util.Calendar;

public class DateUtil {
	// 나이 구하기 (생년월일) 
	// 입력 : 2005-10-10 20051010 2005/10/10 2005.10.10 (숫자 범주는 고려 x)
	
	public int toAge(String birth) {
		int age=0;
		
		// 숫자 아닌 것 제거
		// 1. birth = birth.replaceAll("\\D", "");
		birth = birth.replaceAll("\\-|\\.|\\/", "");
		
		Calendar now = Calendar.getInstance();
		String monthDate = String.format("%02d%02d",now.get(Calendar.MONTH)+1, now.get(Calendar.DATE));
		
		int y = Integer.parseInt(birth.substring(0,4));
		age= now.get(Calendar.YEAR) - y;
		
		// 1010 0913 1010이 더 크니 나이 -1
		if(birth.substring(4).compareTo(monthDate)>0) {
			age--;
		}
		
		
		return age;
	}
	
	public String toGender(String rrn) {
		String gender = null;
		
		rrn = rrn.replace("-", "");
		
		int s = Integer.parseInt(rrn.substring(6,7));
		
		gender = s%2==0?"여자":"남자";
		
		return gender;
		
	}
	
	
	
}