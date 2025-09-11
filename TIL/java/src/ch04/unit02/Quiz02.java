package ch04.unit02;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		String op, result;
		
		System.out.println("두 수 ?");
		a=sc.nextInt();
		b=sc.nextInt();
		
		System.out.println("연산자[+-*/] ? ");
		op=sc.next();
		
		switch (op)
		{
		case "+" : result= a + "+" + b + "=" + (a+b); break;
		case "-": result= a + "-" + b + "=" + (a-b); break;
		case "*": result= a + "*" + b + "=" + (a*b); break;
		case "/": result= a + "/" + b + "=" + (a/b); break;
		default: result="입력오류"; break;
		}
		
		System.out.println(result);
		
		sc.close();

	}

}
