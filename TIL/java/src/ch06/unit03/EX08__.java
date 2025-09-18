package ch06.unit03;

public class EX08__ {

	public static void main(String[] args) {

		Test8 t = new Test8();
		int s;
		
		s = t.sum(10);
		System.out.println("결과 : " + s);
		
		double d = t.pow(2, -10);
		System.out.println("결과 : " + d);
		
		/*
		int a = t.pow(4,12);		
		System.out.println("결과 : " + a);
	
	*/}

}

class Test8
{
	public int sum(int n) // 스택에 넣었다뺐다해서 속도 느림 -> 반복문이 나아
	{
		return n > 1 ? sum(n-1) + n : 1;
	}
	
	public double pow(int a, int b) // 스택에 넣었다뺐다해서 속도 느림 -> 반복문이 나아
	{
		if (b>=0)
			{
			return  b==0 ? 1 : a*pow(a,b-1);
			}

		else
		{
			return  (1.0/a)*pow(a,b+1);
		}
	}
	
	public int gcd(int x, int y)
	{
		return x!=0 && x!=0 ? x : gcd(x ,x%y);
	}
}
