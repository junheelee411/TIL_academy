package Quiz_while;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num, count =0;
		int sum=0, sum_even=0, sum_odd=0;
		
		System.out.println("수 ? ");
		num = sc.nextInt();
		
		while(count<num)
		{
			count++;
			sum += count;
			
			if(count%2==0)
			{
				sum_even+=count;
			}
			else
			{
				sum_odd+=count;
			}
			
		}
		
		
		System.out.println("1~" + num + "까지의 합 = " + sum);
		System.out.println("1~" + num + "까지의 짝수 합 = " + sum_even);
		System.out.println("1~" + num + "까지의 홀수 합 = " + sum_odd);
		
		sc.close();

	}

}
