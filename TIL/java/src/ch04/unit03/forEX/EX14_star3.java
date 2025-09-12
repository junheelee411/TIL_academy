package ch04.unit03.forEX;

public class EX14_star3 {


	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1; j<=5-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	
		int s=5;
		
		for(int i=0;i<s;i++)
		{
			for(int j=s; j>0;j--)
			{
				System.out.print(j<=i+1 ? "*"  : " ");
			}
		
			System.out.println();
		}
		
		for(int i=5;i>=1;i--)
		{
			for(int j=1; j<=5;j++)
			{
				System.out.print(i<=j ? "*"  : " ");
			}
		
			System.out.println();
		}
		
/*
	     * i=0,j=1
	    ** i=1,j=1,2
	   *** i=2,j=3,2,1
	  **** i=3,j=4,3,2,1
	 ***** i=4,j=5,4,3,2,1 일 때 별, 나머지는 공백
*/
		
	}

}
