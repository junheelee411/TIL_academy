package Quiz_for;

public class Quiz09__ {

	public static void main(String[] args) {
		
		int a;
		int b;
		int sum=0;
		
		for(b=10;b<=100;b+=10)
		{
			for(a=b-9;a<=b;a++)
			{
				sum += a;
			}
			System.out.printf("%d~%d 까지 합 : %d \n",b-9,b,sum);
		}

		/*
		int s=0;
		for(int n=1;n<=100;n++)
		{
			s+=n;
			if(n%10==0)
			{
				System.out.println((n-9) + " ~ " + n + " : " + s);
				s=0;
			}
		}
				*/


	}

}
