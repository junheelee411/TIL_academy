package ch02.unit04;

public class EX01_Byte {

	public static void main(String[] args) {
		byte b1;
		byte b2=10;
		//byte b3=130; 컴파일 오류(범위 벗어남)
		
		System.out.println(b2);
		
		b2=20;

		System.out.println(b2);

		//'A':65~90, 'a':97~122, 문자 '0':48
		short s1,s2=100;
		s1='A';
		System.out.println(s1 +","+s2);
	
		int i1=200;
		int i2='a';
		
		//b1='a' 가능
		//b1=i2 불가능 실제로 작은 값이더라도 실행 전엔 모르기 때문에 큰 자료형의 변수를 작은 자료형에 대입 불가
		
		b1=(byte)i1;
		System.out.println(b1); //97
		
		b1=(byte)i2;
		System.out.println(b1); //오버플로우->잘림
		
		long l1,l2;
		l1=100;
		l2=i1;
		System.out.println(l1+","+l2);
		
		//l2=22000000; 컴파일에러
		l2=22000000L; //long형 리터럴
		System.out.println(l2);
		
	}

}
