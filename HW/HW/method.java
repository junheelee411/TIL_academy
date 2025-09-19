package HW;

import java.util.Scanner;

public class method {
	
	public static void main(String[] args) {
		
		methodMaking t = new methodMaking();
		t.luckyFrog();
		
	}
}

class methodMaking
{	
	Scanner sc = new Scanner(System.in);
			
	//도형의 내각의 합
	public int interiorAngle(int n)
	{
		return n<3 ? -1 : 180*(n-2);
	}
	

	//bmi 구하기
	public double bmi(int kg, int m)
	{
		if(kg<=0 || m<=0)
		{
			System.out.println("잘못 입력하셨습니다.");
			return -1;
		}
		else
		{
			double bmi=kg/(m*m);
			return bmi;
		}
		
	}
	
	// 행원의 개구리
	public void luckyFrog()
	{
		double num=Math.random()*50+1;
		while(num>0)
		{
		System.out.print("개굴 ");
		num--;
		}
	}
	
	// 1000보다 작은 수 입력 받기
	public int inputNum()
	{
		int n
		do{
		System.out.println("1000보다 작은 양의 정수를 입력하세요.");
	}while()
	
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