package ch07.unit05;
/*
 	Random
 	: 단순한 난수 생성기로 예측 가능
 	: 게임, 시뮬레이션 등에서 사용
 	
 	SecureRandom
 	: 보안적으로 강한 난수 생성기
 	: 암호화나 중요한 상황에서 사용
 */

import java.security.SecureRandom;

public class EX03_SecureRandom {

	public static void main(String[] args) {
		SecureRandom rnd = new SecureRandom();
		int n;
		
		for(int i=1; i<=100; i++) {
			n= rnd.nextInt(100); // 0~99 사이의 난수
			System.out.printf("%5d",n);
			if(i%10==0) {
				System.out.println();

	}

		}}}
