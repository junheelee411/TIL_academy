package ch07.unit04;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EX08 {

	public static void main(String[] args) {
		// 오늘까지 살아온 날수 계산
		Date today = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		String str="2001-12-05";
		
		try {
			// 문자열 -> Date 객체로 변환
			Date date = sdf.parse(str);
			
			// 두 날짜 사이의 간격 구하기
			long diff = today.getTime() - date.getTime(); // ms
			long day = diff/(24*60*60*1000); 
					
			System.out.println("살아온 날 수 : " + day);
			
			System.out.printf("나이 : %d",day/365+1);
			
		} catch (Exception e) {	
			e.printStackTrace();
		}
		

	}

}
