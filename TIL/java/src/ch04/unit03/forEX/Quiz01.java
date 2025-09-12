package ch04.unit03.forEX;

import java.util.Scanner;

public class Quiz01 
{
	public static void main(String[] args) {
		int ch;
		int input;
		int s=0;
		
		while(true)
		{
			try (Scanner scanner = new Scanner(System.in)) {
				do {//메뉴
					System.out.println("1.합 2.짝수합 3.홀수합 4.종료 =>");
					ch = scanner.nextInt();				
				}while(ch<1||ch>4);
				
				// 4번 : 종료
				if(ch==4)
				{break;}
				
				System.out.println("원하는 수 ? ");
				input = scanner.nextInt();
			}
			int start = ch==2?2:1;
		int step = ch==1?1:2;
		for (int n = start; n <=input; n+=step)
		{
			s+=n;
		}
		System.out.println("결과 : " + s);
		}
		
		
		

	}
	
}


/*
 {
 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int ch;
		int input;
		int s;
		
		while(true)
		{
			do {//메뉴
				System.out.println("1.합 2.짝수합 3.홀수합 4.종료 =>");
				ch = sc.nextInt();				
			}while(ch<1||ch>4);
			
			// 4번 : 종료
			if(ch==4)
			{break;}
			
			//수 입력
			System.out.println("원하는 수 ? ");
			input = sc.nextInt();
			
			//합 초기화
			s=0;
			
			switch(input)
			{
			case 1:
			{
				for(int n=1; n<=input; n++)
				{
					s+=n;
				}
				
			}
			case 2:
			{
				for(int n=2; n<=input; n+=2)
				{
					s+=n;
				}
			}
			case 3:
			{
				for(int n=1; n<=input; n+=2)
				{
					s+=n;
				}
			}
			//결과 출력
			System.out.println("결과 : " + s);
					
		}

	}
		sc.close();
}}
*/