package ch04.unit03;

public class EX07 {

	public static void main(String[] args) {
		
		/*
		//1~100까지 짝수합
		
		int num, sum;
		num=0;
		sum=0;
		
		while(num<=100)
		{
			num+=2;
			sum+=num;
		}
		System.out.println("결과 : " + sum);
		*/
		
		//1~100까지 홀수합
		
		int num, sum;
		num=1;
		sum=0;
		
		while(num<100)
		{
			sum+=num;
			num+=2;
		}
		System.out.println("결과 : " + sum);

	}

}
