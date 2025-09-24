package Quiz_for;

import java.util.Scanner;

//정수 2개 입력, 작은수 이상 큰수 이하 3의배수나 5의배수들의 합, 평균

public class Quiz07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		int c;
		
		int cnt=0;
		int sum=0;
		int average;
		
		// 두 정수 입력

		System.out.println("두 정수 ? ");
		a = sc.nextInt();
		b = sc.nextInt();
					
		// 정렬 
		if(a>b)
		{
			c=a;
			a=b;
			b=c;
		}
		
		// 합, 개수 구하기
		
		if(a!=b)
		{
			for(;a<=b;a++)
			{
				if(a%3==0 || a%5==0)
				{
					sum+=a;
					cnt++;
				}
			}
		}
		
		//평균 구하기
		
		if (cnt!=0 && sum!=0)
		{
			average=sum/cnt;
			System.out.println("합 : " + sum);
			System.out.println("형균 : " + average);
		}
		else
		{
			System.out.println("두 정수 사이 3이나 5의 배수가 없습니다.");
		}
	
		sc.close();
		
	}

}
