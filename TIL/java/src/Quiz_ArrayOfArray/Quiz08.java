package Quiz_ArrayOfArray;


// 5의배수 행 증가
// 아니면 행-1 열+1
// 행 벗어나면 행끝 열+1
// 열 벗어나면 열처음 행-1

public class Quiz08 {

	public static void main(String[] args) {
		
		int [][]num;
		int n;
		int row, col;
		
		n=3;
		num = new int[n][n];
		
		row=0;
		col=n/2;
		for(int i=1; i<=n*n;i++)
		{
			num[row][col] = i;
			
			if(i%n==0) // n으로 나눴을때 나머지 0이면 행 1증가 열 그대로
			{
				row++;
			}
			else
			{
				row--;
				col++;
			}
			
			if (row<0)
			{
				row=n-1;
			}
			if (col>=n)
			{
				col=0;
			}
		}
		
		
		for(int i=0; i<num.length;i++)
		{
			for(int j=0; j<num[i].length;j++)
			{
				System.out.printf("%5d", num[i][j]);
			}
			System.out.println();
		}
		
		
	}
}
