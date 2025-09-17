package ch06.unit02;

public class EX05 {

	public static void main(String[] args) {
		
		// 클래스 변수 : 객체 생성과 무관하게 언제나 접근하여 사용할 수 있는 변수
		// 클래스가 로딩될 때 한 번만 메모리가 할당되는 변수
		System.out.println(Test5.c);
		
		// 인스턴스 변수
		// 객체가 메모리 할당이 되어야 사용할 수 있는 변수
		// 객체 생성만큼 메모리 할당
		// 객체명.필드 형식으로 사용
		
		Test5 t = new Test5();
		System.out.println(t.a);
		// System.out.println(t.b);  컴파일 에러 private 변수
		t.disp();
		}

}

class Test5
{
	// 필드 - 인스턴스 변수
	int a;
	private int b=10;
	
	// 필드 - 클래스 변수
	public static int c=20;
	
	// 메소드 - 인스턴스 메소드
	public void disp() {
		System.out.println(a + " , " + b + " , " + c);
	}
}