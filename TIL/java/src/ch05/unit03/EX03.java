package ch05.unit03;

public class EX03 {

	public static void main(String[] args) {
		int [][] a = new int[][] {{10,20,30},{40,50,60}};
		int [][] b = new int[a.length][a[0].length]; 
		//int[][] b=new int[2][3];
		
		System.arraycopy(a, 0, b, 0, b.length); // 주소 2개 복사
		
		
		System.out.println("a 배열 ...");
		for (int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length;j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("b 배열 ...");
		for (int i=0; i<b.length; i++)
		{
			for(int j=0; j<b[i].length;j++)
			{
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		b[1][1] = 500;
		System.out.println(a[1][1] + " , " + b[1][1]);
		
	}
	

}
