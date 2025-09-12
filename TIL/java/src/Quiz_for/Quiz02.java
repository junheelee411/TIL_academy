package Quiz_for;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		int n=0;
		
		do
		{
			System.out.println("단 ? ");
			num = sc.nextInt();
		}while(num<1 || num>9);
		
		for(n=1; n<=9; n++)
		{
			System.out.println(num + "*" + n + "=" + num*n);
		}
		
		sc.close();

	}

}
