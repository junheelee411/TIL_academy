package ch04.unit03;

import java.util.Scanner;

public class EX09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dan;
		int n=1;
	
		System.out.println("단 ? ");
		dan = sc.nextInt();
		
		while(n<=9)
		{
			System.out.print(dan + "*" + n + "=" + dan*n + "\n");
			n++;
			
		}
		
		sc.close();

	}

}
