package Quiz_for;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int newNum, min;
		
		System.out.println("10개의 정수를 입력하세요...");
		min=sc.nextInt();
		for(int cnt=0;cnt<9;cnt++)
		{
			newNum = sc.nextInt();
			if (newNum < min)
			{
				min=newNum;
			}
			
		}
		
		System.out.println("최소값 : " + min);
		
		
		
		sc.close();

	}

}
