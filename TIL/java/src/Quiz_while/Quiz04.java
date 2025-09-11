package Quiz_while;

public class Quiz04 {

	public static void main(String[] args) {
		int num=0, cnt=0;
		int sum=0, average=0;
		
		while(num<100)
		{	
			num++;
			
			if(num%3==0 || num%5==0)
			{
				sum += num;
				cnt++;
			}
			
		}
		
		average = sum/cnt;

		System.out.println("합 : " + sum);
		System.out.println("평균 : " + average);
	}

}
