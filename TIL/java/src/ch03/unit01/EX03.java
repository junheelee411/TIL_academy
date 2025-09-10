package ch03.unit01;

public class EX03 {

	public static void main(String[] args) {
		
		// 정수끼리 연산 -> 정수
		
		int a;
		a=3/2+1/2+2/3; // 정수/=몫(파이썬의 //)
		System.out.println(a);

		double b;
		b=3/2+1/2+2/3; //더블 b=정수 -> 실수로 표기
		System.out.println(b);
		
		b=3/2+1/2+2/3; //더블 b=정수 -> 실수로 표기
		System.out.println(b);

		//2.==2.0
		
		b=3/2.+1/2+2/3; //정수, 실수 연산 -> 실수,실수 연산
		System.out.println(b);
		
		b=(double)(3/2+1/2+2/3);
		System.out.println(b);

		
	}

}
