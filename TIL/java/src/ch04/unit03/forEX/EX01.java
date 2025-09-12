package ch04.unit03.forEX;

/*
 	for(초기화(1); 조건식(2); 재초기화(4))
 	{
 		실행문(3)
	}
	1. 초기화
	2. 조건식 : 거짓이면 for문 빠져나감
	3. 실행문
	4. 재초기화
	5. 조건식 : 거짓이면 for문 빠져나감
	6. 실행문 ...
 */
public class EX01 {

	public static void main(String[] args) {
		int n;
		
		for(n=1; n<=10; n++)
		{
			System.out.println(n + " ");
		}
		System.out.println("\n밖 : " + n); //11

		for(int a=1; a<=10; a+=2)
		{
			System.out.println(a + " ");
		}
		System.out.println("\n");
		// for문 안에서 선언한 변수 - for문 안에서만 사용 가능
	}

}
