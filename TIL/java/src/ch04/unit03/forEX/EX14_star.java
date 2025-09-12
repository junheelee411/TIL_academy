package ch04.unit03.forEX;

public class EX14_star {

	/*
	 *
	 **
	 ***
	 ****
	 *****
	 */
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1; j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
