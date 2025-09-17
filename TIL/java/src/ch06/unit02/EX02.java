package ch06.unit02;

public class EX02 {

	public static void main(String[] args) {

		// 객체 선언 및 메모리 할당
		Test2 t = new Test2();
		
		// System.out.println(t.a); //컴파일 에러
		System.out.println(t.b);
		System.out.println(t.c);
		System.out.println(t.d);
	}

}

// 클래스 : 필드(데이터) + 메소드(기능)

class Test2
{
	// 필드 접근 제어자
	// private < 디폴트 < protected < public
	
	private int a = 10; // 클래스 안에서만 접근 가능
	int b = 20; // 동일한 패키지 안에서만 접근 가능
	protected int c = 30; //하위 클래스 및 동일한 패키지 안에서만 접근 가능
	public int d =40; // 제약 없이 어디에서나 접근 가능
	
	//메소드
	
	public void disp()
	{
		System.out.println(a + " , " + b + " , " + c + " , " + d);
	}
}
