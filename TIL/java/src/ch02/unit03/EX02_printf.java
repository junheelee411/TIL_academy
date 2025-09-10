package ch02.unit03;

/*
	System.out.printf("출력서식",출력값,출력값);
		: 출력 서식에 따라 값을 출력
		: 출력 후 라인을 넘기지 않는다.
		: System.out.format("출력서식",출력값,출력값)과 동일 //쓸일없음

*/

public class EX02_printf {

	public static void main(String[] args) {
		
		int a,b,c;
		
		a=12;
		b=5;
		c=a+b;
		
		System.out.println("결과 : " + c); //17
		System.out.println(a + "+" + b + " = " + c);
		// 문자열+다른 자료형-> 문자열
		
		System.out.printf("%d+%d = %d\n",a,b,c);
		// 정수 포맷은 d
		
		//System.out.printf("%d+%d = %d\n",a,b);
		// 문법이 잘못되면 런타임오류
		
		System.out.printf("%d+%d = %d\t",a,b,a+b);
		System.out.printf("%d-%d = %d%n",a,b,a-b);
		// \n==%n 둘 다 줄넘김
		System.out.printf("%d*%d = %d\t",a,b,a*b);
		System.out.printf("%d/%d = %d\n",a,b,a/b);
		
		System.out.printf("%d%%%d = %d\n",a,b,a%b);
		// %==나머지 (% escape -> %%)

		
	}

}
