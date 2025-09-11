package ch04.unit02;

import java.util.Scanner;

//입력받은 숫자가 3의 배수인지 확인

public class EX03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("정수 ? ");
		n=sc.nextInt();
		
		switch(n%3) //switch 다음 수식 가능
		{
		case 0: System.out.println(n + " -> 3의 배수"); 
				break;
		case 1: 
		case 2: System.out.println(n + "-> 3의 배수가 아님");
				break;
			
		}
		
		sc.close();

	}

}
