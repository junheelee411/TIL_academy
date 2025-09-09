package ch03.unit01;

/*
 	지비의 연산 기본 타입 int
 	피연산자가 byte, char, short이면 int로 변환하여 연산
 	피연산자가 모두 리터럴이면 형변환이 일어나지 않는다.
 */

public class EX01 {

	public static void main(String[] args) {
		byte b1,b2,b3;
		b1=10;
		b2=5;
	
		// b3=b1+b2; 
		//byte형+byte형 => int형+int형으로 연산 = int형
		//int형을 byte형에 담으려 하니 오버플로우로 컴파일 오류 발생
	
		b3=(byte)(b1+b2); //int형을 byte형으로 변환
		System.out.println(b3);
		
		b3=10+5; // 리터럴끼리 덧셈 = 형변환 x
		
		b1=100;
		b2=120;
		b3=(byte)(b1+b2);
		System.out.println(b3); //-36 오버플로우로 가비지값 들어감
		
		short s1,s2,s3;
		s1=100;
		s2=130;
		// s3=s1+s2; int형 덧셈으로 형변환-> s3에 못 담아서 컴파일오류
		
		s3=(short)(s1+s2);
		System.out.println(s3);

		//s1=s1+10
		s1+=10; //대입 연산자는 가능
		
		//변수 껴있으면 무조건 형변환 // 리터럴+리터럴은 형변환x 따라서 연산 가능
	
	}

}
