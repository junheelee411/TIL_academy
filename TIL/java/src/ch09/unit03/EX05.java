package ch09.unit03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EX05 {
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
			
		} catch (Exception e) {
			// Exception : 모든 예외 catch 가능
			// 예외별로 예외를 분리할 수 없다
			// 다른 예외 클래스와 같이 사용할 경우 가장 마지막에
					
			e.printStackTrace();
		}
		System.out.println("end");
	}

}
