package Quiz_for;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int newNum, max;
		
		System.out.println("10개의 정수를 입력하세요...");
		max=sc.nextInt();
		for(int cnt=0;cnt<9;cnt++)
		{
			newNum = sc.nextInt();
			if (newNum > max)
			{
				max=newNum;
			}
			
		}
		
		System.out.println("최대값 : " + max);
		
		
		
		sc.close();

	}

}
