package Quiz_while;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c,sum;
		sum=0;
		
		System.out.println("두 수 ? ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (a>b)
		{
			c=a; a=b; b=c; 
		}
		else if (a==b)
		{
			System.out.println("두 수가 동일합니다.");
		}
	
		int first_a = a;
		
		while(a<=b)
		{
			sum+=a;
			a++;
		}
		
		if (first_a!=b)
		{
		System.out.printf("%d ~ %d까지의 합 = %d", first_a,b,sum);
		}
		
		sc.close();

	}

}
