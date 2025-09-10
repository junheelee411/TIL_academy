package ch02.unit03;

import java.util.Scanner;

public class EX04_Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		int age;
		double height;
		char gender;
		
		System.out.println("이름 ? ");
		name = sc.next(); //공백 없는 문자열 입력(대기상태)
		
		System.out.println("나이 ? ");
		age = sc.nextInt(); //정수 입력
		
		System.out.println("키 ? ");
		height = sc.nextDouble(); //실수 입력 
		
		System.out.println("성별[M/F] ? ");
		gender = sc.next().charAt(0); //문자열 입력 받아 앞 한글자만 추출
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);
		System.out.println("성별 : " + gender);
		
		sc.close(); //모든 자원은 사용 후 반환
	}

}
