package ch06.unit02;

public class EX07 {

	public static void main(String[] args) {
		Test7.c = 500;
		Test7.write();
		
		Test7 obj = new Test7();
		
		obj.disp();
		obj.sub();

	}

}

class Test7
{
	// 인스턴스 변수 - 객체 생성해야 사용 가능(객체 생성 시마다 메모리 할당)
	// 접근 - 객체명.필드
	int a=5; // (초기값은 5)
	int b=7;
	
	// 클래스 변수
	// 클래스 로딩 시 한 번만 메모리 할당 - 객체 생성과 무관
	// 클래스명.필드
	static int c = 10; 
	
	// 인스턴스 메소드
	// 객체명.메소드
	public void disp() {
		System.out.println(a + " , " + b + " , " + c);
	}	
	
	public void sub() {
		System.out.println(a + " , " + b);
	}
	
	// 클래스 메소드 - 객체 생성 안해도 쓸수있는 메소드
	// 클래스명.메소드()
	// 클래스 메소드는 바로 인스턴스 변수를 호출하여 사용 불가
	public static void write() {
		
		// System.out.println(a); //컴파일 에러
		System.out.println(c);	
		
		Test7 tt = new Test7();
		
		System.out.println(tt.a);
	}
}
