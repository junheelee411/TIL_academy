package Quiz_while;

public class Quiz02 {

	public static void main(String[] args) {
		
		int n=0, sum=0;
		
		while(n<10)
		{
			n++;
			
			if (n%2!=0)
			{
				sum+=n;
			}
			else 
			{
				sum-=n;
			}
		}
		
		System.out.println("결과 : " + sum);

	}

}
