package ch05.unit02;

/*
	1	6	11	16
	2	7	12	17
	3	8	13	18
	4	9	14	19
	5	10	15	20
 */
public class EX03 {

	public static void main(String[] args) {
		
		int [][]a = new int[5][4];
		int n=0;
		
		for(int j=0; j<a[j].length; j++)
		{
			for(int i=0; i<a.length;i++)
			{
				a[i][j] = ++n;
			}
		}
		
		/*
		 
		 n=0;
		 for(int i=0;i<4;i++)
		 {
		 	for(int j=0;j<5; j++)
		 	{
		 		a[j][i] = ++n;
	 		}
	 	 }
		 
		 */
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[0].length;j++)
			{
				System.out.printf(" "+ a[i][j]);
			}
			System.out.println();
		}	
		System.out.println();

	}

}
