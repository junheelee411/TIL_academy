package Quiz_ArrayOfArray;

/*
 	1	2	3	4	5
 		6	7	8	9
 			10	11	12
 				13	14
 					15
 */


public class Quiz04__ {
	public static void main(String[] args) {
		
		int [][]num = new int[5][5]; //num[][] int 5*5 배열 생성
		int n=0; //숫자 0으로 시작

		for(int i=0; i<num.length; i++) 
			{
				for(int j=i; j<num[i].length;j++)
					{
						num[i][j]=++n; //1씩 증가된 값이 대입됨
					}
				}
		
		
		for(int i=0; i<num.length; i++) //출력
			{
				for(int j=0; j<num[i].length;j++)
					{
						if (num[i][j] !=0)
							{
								System.out.printf("%4d",num[i][j]);
							}
						else
							{System.out.print("  ");}
					}
				System.out.println();
				
			}
		
	}

}
		

		
		
		
		
		/*
		
		for(int i=0; i<5 ;i++)
		{
			for(int j=0;j<5;j++)
			{
				num[i][j]=n;
				if 
				System.out.printf(num[i][j]+ "\t");
				n++;
			}
			System.out.println();
		}
		*/
		
		
		
		
		

