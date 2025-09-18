package ch06.unit03;
//스캐너 안 닫힘

import java.util.Scanner;

public class EX04 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int user, com;
		
		while(true)
		{
			do
			{
				menu();
				user = sc.nextInt();
				
			}while(user<1|| user>4);
			
	
			if (user==4)
			{
				break;
			}
		}
	
		com = (int)((Math.random() * 3) +1);
		
		System.out.println("유저 :" + convertText(user));
		System.out.println("컴퓨터 :" + convertText(com));
		
		int c= compare(user,com);
		if(c==0)
		{
			System.out.println("비겼습니다.");
		}
		else if(c==1)
		{
			System.out.println("유저 승");
		}
		else
		{
			System.out.println("zjavbxj 승");
		}
		


		sc.close();
	}

	
	
	public static void menu()
	{
		System.out.println("-------메뉴-------");
		System.out.println("1.가위 2.바위 3.보 4.게임종료");
		System.out.println("-----------------");
		System.out.println("선택[1~4] => ");
	}
	
	
	public static String convertText(int n)
	{
		String s;
		
		s= n==1 ? "가위" :(n== 2 ? "바위l" : "보");
		
		return s;
	}
	
	public static int compare(int user, int com)
	{
		if (user==com)
		{
			return 0;
		}
		else if(user-com==-2||user-com==1)
		{
			return 1;
		}
		else
		{
			return -1;
		}
		



	}
	
}


