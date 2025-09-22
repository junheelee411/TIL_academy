package ch07.unit02;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class EX07 {

	public static void main(String[] args) {
		// 아주 크거나 작은 실수
		
		BigDecimal a = new BigDecimal("123456789.123456789");
		BigDecimal b = new BigDecimal("34567.89");
		BigDecimal c;
		
		// c=a.divide(b); 런타임 에러
		
		c=a.divide(b, RoundingMode.DOWN); // 버림 (내가 준 실수까지만 소수점 표현)
		System.out.println(c);

		c=a.divide(b, 3,RoundingMode.DOWN); // 버림 (내가 준 실수까지만 소수점 표현)
		System.out.println(c);
		
	}

}
