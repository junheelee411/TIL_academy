package Quiz_while;

public class Quiz05 {

	public static void main(String[] args) {
		int n=0, sum=0;
		
		while(sum<100)
		{
			n++;
			sum += n;
		}
		
		System.out.println("최소의  n : " + n);
		System.out.println("합 : " + sum);

	}

}
