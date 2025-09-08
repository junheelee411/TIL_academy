package ch02.unit03;


/*
	System.out.print(인수);
	-> 인수의 내용을 출력 장치르 통해 출력. 출력 후 라인 넘기지 않음(괄호 속 인수 생략 불가)
 */

public class EX01_print {

	public static void main(String[] args) {
		
		//System.out.print(); 컴파일 오류. 괄호안에 출력할 내용 없으면 에러 발생
		System.out.print("HTML 5, ");
		System.out.print("javascript, ");
		System.out.print("CSS 3, ");
		System.out.print("\n"); //escape 라인을 넘기세요

		System.out.print("JAVA\nJSP\n");
		System.out.print("Spring");
		System.out.print("\nORACLE\n\n");
		
		System.out.print("국어\t");
		System.out.print("영어\t");
		System.out.print("수학\n");
		System.out.print(90 + "\t");
		System.out.print(85 + "\t");
		System.out.print(95 + "\n");
		
		System.out.println("end...");
		
	}

}
