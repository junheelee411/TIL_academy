package ch07.unit06;

import java.text.NumberFormat;
import java.util.Locale;

public class EX01_NumberFormat {

	public static void main(String[] args) {
		String s;
		int n;
		
		// 숫자 -> 문자열
		n=12345;
		
		s=Integer.toString(n);
		System.out.println(s);
		
		s=String.format("%,d", n);
		System.out.println(s);

		s=String.format("%.2f", 1234.5678);
		System.out.println(s);
		
		// 국가를 ITALY로 설정 : ITALY에서는 소수점이 ","
		s=String.format(Locale.ITALY, "%.2f", 1234.5678);
		System.out.println(s);
		System.out.println();
		
		// 숫자에 대한 포맷
		NumberFormat nf = NumberFormat.getInstance();
		
		n=12345;
		s=nf.format(n);
		System.out.println(s); //12,345 세자리마다 ","들어간 문자열로 반환
		
		s=nf.format(3456.2567);
		System.out.println(s); //3,456.257 기본이 세자리(반올림)
		
		s=nf.format(3456.2567);
		System.out.println(s); //3,456.257 기본이 세자리(반올림)
		
		NumberFormat nf2 = NumberFormat.getInstance();
		nf2.setMaximumFractionDigits(4); // 소수점 이하 최대 4자리
		nf2.setMinimumFractionDigits(2); // 소수점 이하 최소 2자리
		System.out.println(nf2.format(1234.45678));
		System.out.println(nf2.format(1234));
		
		// 통화 기호
		NumberFormat nf3 = NumberFormat.getCurrencyInstance();
		System.out.println(nf3.format(12345));
		
		NumberFormat nf4 = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(nf4.format(12345));
		
		// % 서식
		NumberFormat nf5 = NumberFormat.getPercentInstance();
		System.out.println(nf5.format(0.23)); // 23%
	}

}
