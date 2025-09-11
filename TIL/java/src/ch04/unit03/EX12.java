package ch04.unit03;

public class EX12 {

	public static void main(String[] args) {
		//1~100까지 합을 수가 10의 배수가 될 때마다 출력
		
		int n=0, sum=0;
		
		while(n<100)
		{
			n++;
			sum+=n;
			if (sum%10==0)
					{
						System.out.println("1~" + n + "까지의 합 " +sum);
					}	
		}

	}

}
