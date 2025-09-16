package ch05.unit02;

/*
 	1	2	3	4
 	5	6	7	8	
 	9	10	11	12
	13	14	15	16
	17	18	19	20
 */
public class EX02 {

	public static void main(String[] args) {
		int [][]a = new int[5][4];
		int n=0;
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[0].length;j++)
			{
				a[i][j] = ++n;
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
/*
		//향상된 for문으로 출력
		for(int []r:a)
		{
			for (int x:r)
			{
				System.out.printf("%4d,x");
			}
			System.out.println();
		}
		*/
	}
}
