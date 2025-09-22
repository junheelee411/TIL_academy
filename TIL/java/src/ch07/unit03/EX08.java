package ch07.unit03;

import java.util.Scanner;

public class EX08 {

	public static void main(String[] args) {
		// 문자열을 입력 받아 입력 받은 문자열 중 대소문자를 구분하지 않고 abc로 시작하는 문자열의 수 구하기
		// 입력 받은 문자열이 대소문자를 구분하지 않고 end면 종료
		
		Scanner sc = new Scanner(System.in);
		
		String s;
		int cnt=0;
		
		while(true) {
		System.out.println("문자열[end=종료] ?");
		s=sc.next();
		if(s.equalsIgnoreCase("end")){
			break;
		}
	}

		/* 문자열 3개 미만이면 runtime error
		if((s.substring(0,3)).equalsIgnoreCase("abc"))
		{cnt++;}
		*/
		
		if(s.toLowerCase().indexOf("abc")==0) {
			cnt++;
		}
		
		/*
		if(s.toLowerCase().startsWith("abc"))
		{
			cnt++;
		}
		*/
		
		
			
		System.out.println("개수 ? " + cnt);
		
		sc.close();

		}
		
		
	}


