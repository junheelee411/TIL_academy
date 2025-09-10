package ch03.unit05;

import java.util.Scanner;

public class EX03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a;
		String s;
		
		System.out.println("정수 ? ");
		a= sc.nextInt();
		
		s = a > 0 ? "양수" : (a<0 ? "음수" : "영");
		System.out.println(a + " -> " + s); 
		
		sc.close();
	}

}
