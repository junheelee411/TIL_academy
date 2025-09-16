package ch05.unit02;

/*
	1	2	3	4	5	
	10	9	8	7	6	
	11	12	13	14	15
	20	19	18	17	16
 */

public class EX04 {

	public static void main(String[] args) {
		
		int [][]a = new int[4][5];
		int n=0;
		
	
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<5;j++)
			{
				if(i%2==0) 
				{
					a[i][j] = ++n;
				}
				else
				{
					a[i][4-j] = ++n;
				}
			
		}
	}
		
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[0].length;j++)
			{
				System.out.printf("%4d,", a[i][j]);
			}
			System.out.println();
		}	
		System.out.println();
	}

}

