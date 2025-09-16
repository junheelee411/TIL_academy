package ch05.unit01;

public class EX13_BubbleSort {

	public static void main(String[] args) {
		int []num = new int[] {25,20,30,15,17};
		int t;
		
		
		System.out.println("source data : ");
		for(int i=0;i<num.length;i++)
		{
			System.out.println(num[i] + " ");
		}
		System.out.println();
		
		//sort
		
		for(int i=1;i<num.length;i++)
			{
			for(int j=0; j<num.length-i ; j++)
			{
				if (num[j]> num[j+1])
						{
					t=num[j];
					num[j]= num[j+1];
					num[j+1]=t;
						}
						
			}
			System.out.println();
			}
		
		
		
		System.out.println("sort data : ");
		for(int i=0;i<num.length;i++)
		{
			System.out.print(num[i] + " ");
		}
		System.out.println();
	}
}