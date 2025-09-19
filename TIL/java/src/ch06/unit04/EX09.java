package ch06.unit04;


public class EX09 {

	public static void main(String[] args) {
		Test9 t;
		
		// 클래스가 로딩되는 시점
		// 처음 객체를 생성하거나 클래스 변수, 클래스 메소드를 사용할 때
		// System.out.println(Test9.x);
		t=new Test9();
		
		// Test9 T2 = new Test9();
		t.print();
	}

}

/*
 	- 클래스가 로딩될 때 한 번 실행
 	1) 클래스 변수의 메모리 할당 - 메소드 영역
 	2) 클래스 변수를 디폴트 값으로 초기화
 	3) 초기화 변수의 수식을 실행
 	4) static 블럭이 존재하면 실행 
 	
 	- 객체를 생성할 때마다 실행
 	1) new Test9() 인스턴스 변수의 메모리 할당
 	2) 모든 인스턴스 변수를 디폴트 값으로 초기화
 	3) 초기화 수식
 	4) 초기화 블럭 존재하면 실행
 	5) 생성자의 몸체를 실행
 	 (1) 생성자 몸체의 첫 번째 문장 super([인수]) 또는 this([인수]) 실행
 	 (2) 생성자 몸체 실행
 */

class Test9{
	private int a;
	private int b=1;
	private int c;
	private int d;
	
	public static int x=10;
	public static int y;
	
	static {
		//static 초기화 블럭
		//클래스가 로딩될 때 한 번만 실행
		y=20;
		System.out.println("static 초기화 블럭");
	}
	
	// d=5; //컴파일 에러 선언부는 실행문이 올 수 없음
	{
		//객체가 생성될 때마다 실행
		//생성자 몸체보다 먼저 실행
		d=5;
		System.out.println("인스턴스 초기화 블럭");
	}
	
	public Test9() {
		c=10;
		System.out.println("생성자");
	}
	
	public void print() {
		System.out.println(a + " , " + b + " , " + c + " , " + d);
		
	}
	
}