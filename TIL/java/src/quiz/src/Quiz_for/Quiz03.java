package Quiz_for;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt, num;
		int even_cnt=0, odd_cnt=0;
		
		System.out.println("10개의 정수를 입력 하세요.");
		
		for(cnt=0; cnt<10; cnt++)
		{
			num = sc.nextInt();
			
			if(num%2==0)
				{
				even_cnt ++;
				}
			else
			{
				odd_cnt ++;
			}
		}
		
		System.out.println("홀수의 개수 : " + odd_cnt);
		System.out.println("짝수의 개수 : " + even_cnt);

	}

}
