package Quiz_IF;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		int c;
		
		// 두 숫자 입력
		System.out.println("첫 번째 수 ? ");
		a = sc.nextInt();
	
		System.out.println("두 번째 수 ? ");
		b = sc.nextInt();
	
		//차 계산
		
		//동일
		if(a==b)
		{
			c=0;
		}
		
		//둘 중 하나 음수, 하나 양수
		else if(a<0 && b>0)
		{
			a=-a;
			c= a+b;
		}
		else if(a>0 && b<0)
		{
			b=-b;
			c= a+b;
		}
		
		// 둘 다 양수 
		else if(a>0 && a>b)
		{
			c=a-b;
		}
		else if(a>0 && b>a)
		{
			c=b-a;
		}
		// 둘 다 음수
		else if(a<0 && a<b)
		{
			a=-a;
			b=-b;
			c=a-b;
		}
		else
		{
			a=-a;
			b=-b;
			c=b-a;
		}
		
		System.out.println("두 수의 차이 : " + c);
		
		sc.close();

	}

}
