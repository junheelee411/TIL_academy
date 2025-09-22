package ch07.unit02;

import java.math.BigInteger;

public class EX06 {

	public static void main(String[] args) {
		// 아주 큰 정수
		
		BigInteger a = new BigInteger("12141241214");
		BigInteger b = new BigInteger("1241241232131");
		BigInteger c;
		
		c=a.add(b);
		System.out.println(c);
		
		c=a.subtract(b);
		System.out.println(c);
		
		c= a.multiply(b);
		System.out.println(c);		
		
		c=a.divide(b);
		System.out.println(c);
		
		c=a.pow(5);
		System.out.println(c);

	}

}
