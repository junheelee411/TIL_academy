package ch02.unit04;

import java.util.Scanner;

/*
문자 입력받기
아스키코드 출력
c 입력받으면 67출력

*/

public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch;
		int num;
		
		System.out.println("한 문자 ? ");
		ch = sc.next().charAt(0);
		
		num=(int)ch;
		
		System.out.printf("%c -> %d\n", ch, num);
		
		sc.close();
	}

}
