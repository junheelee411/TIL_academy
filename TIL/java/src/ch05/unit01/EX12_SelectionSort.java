package ch05.unit01;

public class EX12_SelectionSort {

	public static void main(String[] args) {
		int []num = new int[] {25,20,30,15,17};
		System.out.println("source data : ");
		for(int i=0;i<num.length;i++)
		{
			System.out.println(num[i] + " ");
		}
		System.out.println();

		//selection sort
		//1회전 1-2,1-3,1-4,1-5
	    //    (0:1) ()	
	    //2회전 2-3,2-4,2-5
		//     (1:2) 
		
		/*
		for(int i=0;i<num.length-1;i++)
		{
			for (int j=i+1;j<num.length;j++)
			{if (num[i]) > num[j])
[]t=num[i];
(num[i]) = num[j]);
			}
				System.out.print(i +":" + j + " ");
		}
		
		*/
		
		
		
		System.out.println("sort data : ");
		for(int i=0;i<num.length;i++)
		{
			System.out.print(num[i] + " ");
		}
		System.out.println();
	}

}
