package ch09.unit03;

import java.util.Scanner;

public class EX06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] ss = new String[3];
		int idx =0;
		String s;
		
		try {
			System.out.println("문자열 입력 [종료 : 입력하지 않고 엔터]");
			while((s=sc.nextLine()).length() !=0 ) {
				ss[idx++]=s;
				System.out.println("문자열 입력 : ");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			// ArrayIndexOutOfBoundsException : 배열 첨자가 초과된 경우 발생
			//unchecked exception
			idx--;
			System.out.println("입력 초과");
		} finally {
			System.out.println("예외 발생 여부와 상관없이 실행");
			sc.close();
		}
		
	}

}
