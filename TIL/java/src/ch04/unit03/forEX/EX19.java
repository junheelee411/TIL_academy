package ch04.unit03.forEX;

//마름모 별찍기

public class EX19 {

	public static void main(String[] args) {
		
		/*
		for(int i=1;i<=5;i++)
		{
			for(int j=1; j<=5-i; j++)
			{
				System.out.print(" ");
			}
		for(int j=1; j<=i*2-1; j++)
			{System.out.print("*");}
		
		System.out.println();	
		}		

		for(int i=4;i>=1;i--)
		{
			for(int j=1; j<=5-i; j++)
			{
				System.out.print(" ");
			}
		for(int j=1; j<=i*2-1; j++)
			{System.out.print("*");}
		
		System.out.println();	
		}		
		*/
	
		int size=9;
		int n;
		n=size/2;
		
		for(int i=0;i<size;i++)
		{
			for(int j=0; j<(size-n); j++)
			{
				{System.out.print(j >=n ? "*" : " ");}
			}

			n=i<(size/2) ? n-1 : n+1;
		System.out.println();	
		}

	}
}

	

