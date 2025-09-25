package ch09.unit03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EX03 {

	public static void main(String[] args) {
		// 버퍼를 이용하여 문자(열)를 입력 받음. 입력 속도 향상
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		int a,b,c;
		
		try {
			System.out.println("첫 번째 수 ? ");
			s=br.readLine();
			// readLine() : checked exception(IOException)이 발생
			//			    반드시 예외처리를 해야함
			
			a= Integer.parseInt(s);	
			// 문자열을 숫자로 변환하지 못하면
			//NumberFormatException이라는 unchecked ecxeption이 발생

			System.out.println("두 번째 수 ? ");
			b= Integer.parseInt(br.readLine());	
			
			c=a/b;
			System.out.println(a + "/" + b + "=" + c);
			// 0으로 나누면 ArithmeticException 이라는 unchecked exception 발생
		} catch (IOException e) {
			// IOException : 입출력에 문제가 발생하는 경우 발생하는 예외(checked exception)
			// checked exception은 메소드를 만들 때 예외를 throws한 예외
			// checked exception은 예외처리를 하지 않으면 컴파일 오류 발생
			e.printStackTrace();
		}

		// 0으로 나누거나 문자열을 입력하면 예외가 발생하여 비정상적인 종료로
		//	아래 메세지는 출력되지 않는다.
		System.out.println("end");
	}

}
