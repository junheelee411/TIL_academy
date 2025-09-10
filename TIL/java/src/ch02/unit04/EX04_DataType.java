package ch02.unit04;

public class EX04_DataType {

	public static void main(String[] args) {
		
		/*
		 byte < short < int < long < float < double;
		 		char  < int < long < float < double;
		
		 */

		//float : 단정도형 실수
		float f1=0; //int 리터럴을 float 변수에 대입
		float f2=0.5f; //0.5f : 단정도형 리터럴
		float f3=1.2e04f; //1.2*10^4
		float f4;
		System.out.println(f1+","+f2+","+f3);
		f4='A';
		System.out.println(f4);
		
		//f4=0.0; 불가 - 0/0은 배정도형(double)이므로 float에 대입 불가
		
		//double - 배정도형 실수
		
		double d1=0.5;
		double d2=3.14D;
		double d3=1.2e04;
		double d4=1.2e-04;
		System.out.println(d1 + "," + d2 + "," + d3 + "," + d4);
		
	}

}
