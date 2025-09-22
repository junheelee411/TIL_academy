package ch07.unit03;

import java.util.Scanner;

public class Quiz01 {

	// 정수를 입력받아 몇 자리 정수인지 출력
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int n,len;
		
		System.out.println("정수 ?");
		n=sc.nextInt();
		
		String s = n>0? Integer.toString(n) : Integer.toString(n*-1);
		len = s.length();
		
		System.out.println(n + " : "  +len + " 자리수 정수");
		
		sc.close();
	}

}
