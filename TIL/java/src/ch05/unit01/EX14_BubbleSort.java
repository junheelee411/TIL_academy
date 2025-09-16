package ch05.unit01;

import java.util.Arrays;

public class EX14_BubbleSort {

	//개선된 버블정렬
	
	public static void main(String[] args) {
		int []num = new int[] {25,20,30,15,17,1,2,4,3,5};
		int t;
		boolean flag;
		
		
		System.out.println("source data : ");
		System.out.println(Arrays.toString(num));
		
		flag = true;
		
		for(int i=1;flag;i++)
		{
			flag=false;
			for(int j=0; j<num.length-i ; j++)
			if (num[j]> num[j+1])
		{
			t=num[j];
			num[j]= num[j+1];
			num[j+1]=t;
			flag=true;
		}
			System.out.println(i + "회전 : " + Arrays.toString(num));
		}
		
		
		System.out.println("sort data : ");
		System.out.println(Arrays.toString(num));
		for(int i=0;i<num.length;i++)
		{
			System.out.print(num[i] + ", ");
		}
		System.out.println();
	}
}