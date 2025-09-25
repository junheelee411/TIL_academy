package ch09.unit03;

import java.util.Scanner;

/*
 	예외가 발생한 경우
 	1) 블럭실행중 예외 발생 -> 1) 블럭 실행을 중지
 	2) 블럭실행(예외가 발생한 경우만 실행)
 	3) 블럭 실행 - 정상 종료
 	
 	예외가 발생하지 않은 경우
 	1) 블럭 모드 실행
 	3) 블럭 실행 - 정상 종료
 */
public class EX02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		
		
		try {
			// 1) 예외가 발생할 가능성이 있는 코드를 기술
			System.out.println("두 수 ? ");
			a=sc.nextInt();
			b=sc.nextInt();
			c=a/b;
			System.out.println(a+"/"+b+"="+c);
		} catch (Exception e) {
			// Exceprion : 모든 예외를 catch할 수 있지만 예외를 상황 별로 분리할 수 없다.
			// 2) 예외가 발생할 때 실행할 코드를 작성
			System.out.println("예외가 발생했습니다.");
		}
		
		// 3) 
		System.out.println("end");

		sc.close();
	}

}
