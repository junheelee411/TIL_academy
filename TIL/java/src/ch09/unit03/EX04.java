package ch09.unit03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EX04 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a,b,c;
		
		try {
			System.out.println("첫 번째 수 ? ");
			a=Integer.parseInt(br.readLine());
			

			System.out.println("두 번째 수 ? ");
			b=Integer.parseInt(br.readLine());
			
			c=a/b;
			System.out.println(a + "/" + b + "=" + c);
		
		} catch (IOException e) {
			// readLine() 메소드의 checked exception
			// 반드시 catch 해야함
			e.printStackTrace();
			
		} catch (NumberFormatException e) {
			// unchecked exception
			// 문자열을 숫자로 변경하지 못하는 경우 발생하는 예외
			// 반드시 catch할 필요는 없지만 catch하지 않는 경우
			// 예외가 발생하면 비정상적인 프로그램 종료
			//System.out.println(e.getMessage()); // 간단한 메세지 출력
			e.printStackTrace(); // 자세한 에러 메세지 및 에러 발생 줄 표시
			//System.out.println(e.toString()); // 발생한 예외 클래스 및 간단한 메세지 출력
			//System.out.println("숫자만 입력 가능합니다.");
			
		} catch (ArithmeticException e) {
			// unchecked exception
			// 숫자를 0으로 나누는 등의 연산이 불가능한 경우 발생하는 예외
			//e.printStackTrace();
			System.out.println("0으로 나눌 수 없습니다.");
			
		} catch (Exception e) {
			// Exception : 모든 예외 catch 가능
			// 다른 예외 클래스와 같이 사용할 경우 가장 마지막에
			
			e.printStackTrace();
		}
		System.out.println("end");
	}

}
