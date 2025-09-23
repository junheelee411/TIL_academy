package ch07.unit05;

import java.util.Random;

public class EX02_random {

	public static void main(String[] args) {
		// Random : 여러 형태의 난수를 발생. 연산 없이 정수 등의 난수 발생
		Random rnd = new Random();
		int n;
		
		for(int i=1; i<=100; i++) {
			n= rnd.nextInt(100); // 0~99 사이의 난수
			System.out.printf("%5d",n);
			if(i%10==0) {
				System.out.println();
			}
		}

	}

}
