package ch02.unit03;

import java.util.Scanner;

public class EX06_Scanner {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		String name;
		int age;
		String birth, tel;
		
		System.out.print("이름 ? ");
		name = sc.nextLine();
		
		System.out.print("나이 ? ");
		age = sc.nextInt();
		sc.nextLine(); //엔터 읽어서 버림(입력 버퍼 비우기)
		
		System.out.print("생년월일 ? ");
		birth = sc.nextLine();
		
		System.out.print("전화번호 ? ");
		tel = sc.nextLine();

		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("생년월일 : " + birth);
		System.out.println("전화번호 : " + tel);
		
		sc.close();
	}

}

실수 이진수로 바꿀 때 오차 발생 = 

1011 1보수 0100
1011 2보수 0101