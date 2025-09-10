package ch02.unit04;

import java.util.Scanner;

/*
 	정수 입력 받아 입력 받은 정수에 해당하는 문자 출력
 */

public class Quiz02__ {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int code;
		char ch;
		
		System.out.print("문자 코드?");
		code= sc.nextInt();
		
		ch = (char)code;
		
		System.out.print(ch);
		
		sc.close();
		

	}

}
