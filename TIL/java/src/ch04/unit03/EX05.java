package ch04.unit03;

public class EX05 {

	public static void main(String[] args) {
		
		/*
		char c = 64;
		while(c++ <'Z')
		{
			System.out.print(c + " ");
		}
		System.out.println();
		*/
		
		/*
		char c = 'A';
		while(c <= 'Z')
		{
			System.out.print(c + " ");
			c++;
		}
		System.out.println();
		*/
		
		// 한 줄에 7개씩
		/*
		char c = 64;
		int a = 0;
		
		while(c <'Z')
		{
			c++;
			System.out.print(c + " ");
			
			a++;
			if (a%7==0)
				{
					System.out.println();
				}
		}
		*/
		
		char c = 64;
		int n=0;
		
		while(c <'Z')
		{
			c++;
			n++;
			System.out.print(c + (n%7==0 ? "\n" : " " ));
		}
		
	
	}
}
