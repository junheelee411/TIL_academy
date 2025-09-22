package HW;

import java.util.Scanner;

public class print369 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}
	
	static int num;
	
	
	// 1000보다 작은 수 입력 받기
	public int inputNum()
	{
		Scanner sc = new Scanner(System.in);
		
		do{
		System.out.println("1000보다 작은 양의 정수를 입력하세요.");
		num = sc.nextInt();
		
		}while(num<=0 || num>=1000);
	
	// 자리수 구하기
	public int[] digit(int num)
	{
		int digit_100;
		int digit_10;
		int digit_1;
		
		digit_100 = num/100;
		digit_10= num/10%10;
		digit_1 = num-digit_100*100-digit_10*10;
	
		int digit_array[]= {digit_100, digit_10, digit_1};

		return digit_array;
	}
	
	// 369 개수 구하기
	public int count(int[] digit)
	{
		int count=0;
		for(int i=0; i<3; i++)
		{
			if(digit[i]!=0 && digit[i]%3==0)
			{
				count++;
			}
		}
		return count;
	}
	
	// 369 개수만큼 박수 치기
	public void clap(int count)
	{
		for(;count==0;count--)
		{
			System.out.println("짝");
		}
	}
}

}
