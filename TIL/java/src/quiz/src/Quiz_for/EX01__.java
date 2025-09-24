package Quiz_for;

import java.util.Scanner;

public class EX01__ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int gap, num, closed;
		closed=0;
		
		System.out.println("5개의 숫자를 입력하세요...");
		
		for(int cnt=1;cnt<=5;cnt++)
		{
			num = sc.nextInt();
			
			gap = num>7 ? num-7 : 7-num; 
			
			if (cnt==0|| gap >closed)
			{
				closed=num;
			}
		}
		
	
		System.out.println("7과 가장 가까운 수 : " + closed);
		
	
				
				sc.close();

	}

}
