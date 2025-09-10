package ch03.unit03;

public class EX02 {

	public static void main(String[] args) {
		//shift 연산자
		int a, b;
		
		a=128;
		
		//좌측으로 3비트 이동, 남은 값 0으로 채움
		b= a<<3; //a에 2의 3승을 곱한 값
		System.out.println("128 << 3" + b );
		
		//우측으로 3비트 이동, 남은 값 부호로 채움
		b= a>>3; //a를 2의 3승으로 나눈 값
		System.out.println("128 >> 3" + b );
		
		a=-128;
		b= a>>3; //a를 2의 3승으로 나눈 값
		System.out.println("-128 >> 3" + b );
		
		//우측으로 3비트 이동, 남은 값 0으로 채움
		a=-128;
		b= a>>>3; 
		System.out.println("-128 >>> 3" + b );
	}

}
