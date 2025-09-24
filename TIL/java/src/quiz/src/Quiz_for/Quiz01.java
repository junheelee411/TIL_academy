package Quiz_for;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num, n;
		int sum=0;
		
		
		do 
		{
		System.out.println("수 ? ");
		num = sc.nextInt();
	
		}while(num<1 || num>1000);
	
		for(n=0; n<=num; n++)
		{
			sum+=n;
		}
		
		System.out.println("1~" + num + "까지 합 : " + sum);
			
			
		sc.close();

	}

}
