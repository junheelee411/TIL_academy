package ch06.unit03;

public class EX02 {

	public static void main(String[] args) {

		Test2 obj = new Test2();
		int result;
		
		result = obj.sum(10);
		System.out.println("결과 : " + result);

		char a='a'; 
		char b;
		b = obj.upper(a);
		System.out.println(a + " -> " + b);
		
		int x=5, y=13;
		result = obj.max(x, y);
		System.out.println("큰 수 : " + result);
		
		obj.gugudan(7);
	}

}

class Test2
{
	//1~n 합 구하기
	
	public int sum(int n)
	{
		int s=0;
		
		for (int i=1; i<=n; i++)
		{
			s+=i;
		}
		return s;
	}
	// 정수 n이 짝수이면 true, 홀수이면 false를 반환하는 메소드
	// 필드 변수 boolean 초기값은 false
	public boolean isEven(int n)
	{
		return n%2==0;
	}
	
	// 정수 n이 홀수인지 판별
	public boolean isOdd(int n)
	{
		return n%2==1;
	}
	
	//문자가 소문자인지 판별
	public boolean isLower(char c)
	{
		return c>='a' && c<='z';
	}
	
	//문자가 대문자인지 판별
	public boolean isUpper(char c)
	{
		return c>='A' && c<='Z';
	}
		
	//소문자면 대문자로 변환
	public char upper(char c)
	{
		return isLower(c) ? (char)(c-32) : c;
	}
	
	// 년도가 윤년인지 판별
	public boolean isLeap(int y)
	{
		return y%4==0 && y%100!=0 || y%400==0;
	}
	
	// 두 수 중 큰 수 구하기
	public int max(int a, int b)
	{
		return a>b ? a: b;
	}
	
	// 두 수 중 작은 수 구하기
	public int min(int a, int b)
	{
		return a<b ? a: b;
	}
	
	// 구구단
	public void gugudan(int dan)
	{
		if (dan<1 || dan>9)
		{
			return;
		}
		System.out.println("** " + dan + "단 **");
		for(int i=1;i<=9;i++)
		{
			System.out.printf("%d * %d = %d\n",dan,i,dan*i);
		}
		// return; //리턴 타입이 void인 경우 return은 생략 가능
	}
	
	// 평점 계산하기
	// 95~100 : 4.5 /  90~94 : 4.0 / 85~89 : 3.5 / 80~84 : 3.0
	// 75~79 : 2.5 / 70~74 : 2.0 / 65~69 : 1.5 / 60~64 : 1.0 / 나머지 1.0
	
	public double grade(int score)
	{
		if (score>=95)
		{
			return 4.5;
		}
		else if(score>=90)
		{
			return 4.0;
		}
		else if(score>=85)
		{
			return 3.5;
		}
		else if(score>=80)
		{
			return 3.0;
		}
		else if(score>=75)
		{
			return 2.5;
		}
		else if(score>=70)
		{
			return 2.0;
		}
		else if(score>=65)
		{
			return 1.5;
		}
		else if(score>=60)
		{
			return 1.0;
		}
		else
		{
			return 0.0;
		}
		
		
		
	}
	
	
	
}
