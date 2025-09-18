package ch06.unit03;

import java.util.Arrays;

public class EX03 {

	public static void main(String[] args) {
		Test3 t = new Test3();
		String s;
		
		s = t.grade(100);
		System.out.println("결과 : " + s);
		
		int[] num = new int[] {2,4,6,8,10};
		int h = t.total(num);
		System.out.println("결과 : " + h);

		int[] nn = t.lotto();
		System.out.println("로또 : " + Arrays.toString(nn));
		
		int [] nn2 = t.random(10);
		for(int n : nn2)
		{
			System.out.println(n + " ");
		}
		System.out.println();
		
	}

}

class Test3
{
	public int total (int []n)
	{
		int s=0;
		for(int a : n)
		{
			s+=a;
		}
		return s;
	}
	
	public int[] lotto()
	{
		int []num = new int[6];
		
		for(int i =0; i<num.length; i++)
		{
			num[i] =(int)(Math.random() * 45) + 1;
			
			for (int j=0; j<i; j++)
			{
				if(num[i]==num[j])
				{
					i--;
					break; //중복제거?
				}
			}
		}
		
		Arrays.sort(num);
		
		return num;
	}
	
	// 1~100까지 난수를 n개 발생하는 메소드 작성
	
	public int[] random(int n)
	{
		int []num = new int[n];
				
		for(int i =0; i<n; i++)
		{
			num[i] =(int)(Math.random() * 100 +1);
		}
		
		return num;		
	}
	
	public String grade(int score)
	{
		String s;
	
		if(score <0 || score>100)
		{
			return null;
		}
		/*
		switch(score/10)
		{
		case 10:
		case 9: s = "A"; break;
		case 8: s = "B"; break;
		case 7: s = "C"; break;
		case 6: s = "D"; break;
		default: s = "F"; break;
		}
		*/
		
		
		switch(score/10)
		{
		case 10,9 -> s = "A"; 
		case 8 -> s = "B"; 
		case 7 -> s = "C";
		case 6 -> s = "D";
		default ->s = "F";
		}
		return s;
	}
}
		
		/*
	public String grade2 (String score)
	{
	return
	switch(score/10)
	{
	case 10,9 -> "A"; 
	case 8 -> "B"; 
	case 7 -> "C";
	case 6 -> "D";
	default -> "F";
	};
	}}
	*/
	
	
	


