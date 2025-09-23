package ch07.unit06;

import java.text.DecimalFormat;

public class EX03 {

	public static void main(String[] args) {
		
		String s;
		
		DecimalFormat df = new DecimalFormat("#,##0"); // 세 자리마다 "," 찍고 소수점 이하는 반올림
		s=df.format(12345.5385);
		System.out.println(s);
		
		DecimalFormat df2 = new DecimalFormat("#,##0.##"); // 세 자리마다 "," 찍고 소수점 두 자리 나오게
		s=df2.format(12345.5385);
		System.out.println(s);
		System.out.println(df2.format(1234));
		System.out.println(df2.format(0.0));
		
		DecimalFormat df3 = new DecimalFormat("#,##0.0#"); // 세 자리마다 "," 찍고 소수점 두 자리 나오게
		System.out.println(df3.format(0.5));
		System.out.println(df3.format(0.0));
		


	}

}
