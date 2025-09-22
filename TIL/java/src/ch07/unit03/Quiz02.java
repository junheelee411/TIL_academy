package ch07.unit03;

import java.util.Scanner;


/*
 	수식을 입력 받아 연산하는 프로그램 작성
 	단, 입력된 수는 모두 부호를 입력하지 않는 양수라는 가정하에 작성
 	
 	수식 ? 13+20
 	13+20=33
 */

public class Quiz02 {
	public static void main(String[] args) {
		int a,b;
		
		Scanner sc = new Scanner(System.in);
		String s;
		
		
		System.out.println("수식 ? ");
		s=sc.nextLine();
		
		s=s.replaceAll("\\s", ""); // 공백 제거
		
		if(! s.matches("\\d+[\\+|\\-|\\*|\\/]\\d+"))
		{
			System.out.println("연산 수식 입력 에러");
			sc.close();
			return;
		}

		/*
		String[] ss = s.split("[\\+|\\-|\\*|\\/]");
		//String[] ss = s.split("\\D");
		char op= s.charAt(ss[0].length());

		a=Integer.parseInt(ss[0]);
		b=Integer.parseInt(ss[1]);
		
		String result =
				switch(op){
				case'+' -> String.format("%s=%d", s, a+b);
				case'-' -> String.format("%s=%d", s, a-b);
				case'*' -> String.format("%s=%d", s, a*b);
				case'/' -> String.format("%s=%d", s, a/b);
				default -> String.format("%s=%d", s, a/b);
				};
				
		System.out.println(result);
		
		*/
		String result=null;
		for(String op : new String[] {"+","-","*","/"}) {
			int pos = s.indexOf(op);
			System.out.println(pos);
			
			if(pos>0) {
				int n1=Integer.parseInt(s.substring(0,pos));
				int n2=Integer.parseInt(s.substring(pos+1));
				System.out.println(n1+" , " + n2);
			
				switch(op) {
				case "+": result = String.format("%s=%d", s,n1+n2);break;
				case "-": result = String.format("%s=%d", s,n1-n2);break;
				case "*": result = String.format("%s=%d", s,n1*n2);break;
				case "/": result = String.format("%s=%d", s,n1/n2);break;
					
				}break;
			
			}
			
		}
		System.out.println(result);
		sc.close();
		
		
	}
}
