package ch03.unit01;

import java.util.Scanner;

//초를 입력 받아 시분초로 변환하는 프로그램

// 1H=60M=3600sec

public class Quiz01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,h,m,s;
		
		System.out.print("초를 입력하세요 ? ");
		a=sc.nextInt();
		
		h=a/3600;
		m=a%3600/60;
		s=a%3600%60; //== a%60 어차피 초는 60 안 넘으니까,,,
		
		System.out.printf("%d 초는 %d 시간 %d분 %d초 입니다. \n",a,h,m,s);
	
		sc.close();
	}

}
