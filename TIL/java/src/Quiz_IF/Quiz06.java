package Quiz_IF;

import java.util.Scanner;

public class Quiz06 {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int a,b;
		int c=0;
		char operator;
		
		System.out.println("두 수 ?");
		a = sc.nextInt();
		b = sc.nextInt();
		
		
		System.out.println("연산자[+,-,*,/] ? ");
		operator = sc.next().charAt(0);
		
		if(operator == '+')
		{
			c=a+b;
		}
		else if(operator == '-')
		{
			c=a-b;
		}
		else if(operator == '*')
		{
			c=a-b;
		}
		else if(operator == '/')
		{
			c=a/b;
		}
			
		if (operator=='+' && operator=='-' && operator=='*' && operator=='/') 
		{
			System.out.printf(a + " " + operator + " " + b + " = " + c);
		}
		else
		{
			System.out.println("연산자 입력 오류");	
		}
		
		sc.close();

	}

}
