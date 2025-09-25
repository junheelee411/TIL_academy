package ch09.unit03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EX09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		
		try {
			System.out.println("두 수 ? ");
			a=sc.nextInt();
			b=sc.nextInt();
			
			c=a/b;
			System.out.println(a+"/"+b+"="+c);
			
		} catch (ArithmeticException e) {
			System.out.println("연산이 불가능합니다.");
		} catch(InputMismatchException e) {
			// InputMismatchException
			// scanner의 nextInt() 등에서 숫자가 아닌 문자열을 입력하면 발생하는 unchecked exception
			System.out.println("숫자만 입력 가능합니다.");
		} finally {
			// final 블럭은 일반적으로 사용한 resource를 close한다.
			sc.close();
		}
	}

}
