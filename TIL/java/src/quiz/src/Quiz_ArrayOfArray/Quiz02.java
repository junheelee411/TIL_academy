package Quiz_ArrayOfArray;

public class Quiz02 {

	public static void main(String[] args) {
		
		char[][] ch = new char[5][5];
		char c='A';

		for(int i=0; i<5;i++)
		{
			for(int j=4; j>=0;j--)
			{
				ch[j][i] = c++;
			}
		}
		
		for(int i=0; i<ch.length;i++)
		{
			for(int j=0; j<ch[i].length;j++)
			{
				System.out.printf("%3c",ch[i][j]);
			}
			System.out.println();
		}
		
	}

}
