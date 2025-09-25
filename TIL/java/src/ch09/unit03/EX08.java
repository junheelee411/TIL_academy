package ch09.unit03;

public class EX08 {

	public static void main(String[] args) {
		divide(10,-5);
	}
	
	public static void divide(int a, int b) {
		try {
			if(b<0) {
				System.out.println("음수입니다.");
				System.exit(0); // 죽어라.(프로그램 강제 종료) finally도 실행 x
				// return;
			}
			
			int c=a/b;
			System.out.println(a + "/" + b + "=" + c);
			
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		} finally {
			System.out.println("finally 블럭은 return을 해도 실행");
		}
		
		System.out.println("end");
	}
}
