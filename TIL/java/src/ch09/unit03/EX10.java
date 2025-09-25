package ch09.unit03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EX10 {

	public static void main(String[] args) {
		int n;
		String s;
		
		// JDK 7부터 사용
		// try~with~resource : 자동으로 resource를 close
		try(Scanner sc = new Scanner(System.in)) {
			System.out.println(" 나이 ? ");
			n=sc.nextInt();
			s=n>=19 ? "성인" : "미성년자";
			System.out.println(s + "입니다.");
			
		} catch (InputMismatchException e) {
			System.out.println("숫자만 입력 가능합니다.");
		}

	}

}
