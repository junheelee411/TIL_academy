package ch04.unit02;

import java.util.Scanner;

public class EX05 {

	public static void main(String[] args) {
		//과목 코드 입력받아 과목명 입력
		//ji 자바, j2 오라클, j3 스프링
		
		Scanner sc = new Scanner(System.in);
		String s1, s2;
		
		System.out.println("과목 코드 ? ");
		s1 = sc.next();
		
		switch(s1)
		{
		case "j1": s2= "자바"; break;
		case "j2": s2= "오라클"; break;
		case "j3": s2= "스프링"; break;
		default: s2= "입력오류"; break;
		}
		
		//문자열은 ==로 비교 불가
		System.out.println(s2);
		
		sc.close();

	}

}
