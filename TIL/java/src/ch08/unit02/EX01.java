package ch08.unit02;

public class EX01 {

	public static void main(String[] args) {
		Demo1 d = new Demo1();
		d.disp();
		

	}

}

class Test1{
	int a=10;
	
	public void disp() {
		System.out.println("a : " + a);
	}
}

class Demo1 extends Test1{
	int x=100;
	
	public void write() {
		super.disp(); // 상위 클래스 메소드 호출
		
	}
	
	/* 컴파일 에러 : 접근 제어자는 크거나 같아야 함
	protected void disp() {
	}
	*/
	
	// overloading : 중복 정의
	public void disp(int n) {
		System.out.println(n);
	}
	
	/*
	 * 메소드 재정의()override
	 * 상속 관계
	 * 메소드의 시그니처가 동일
	 * 상위 클래스의 메소드를 재정의 하면 상위클래스의 메소드는 숨는다.
	 *  @Ov
	 *  @Override
	 *  메소드가 재정의의 규칙에 맞는지 검증하여 맞지 않으면 에러 발생
	 
	@Override // 재정의가 아니면 compile error 
	public void disp(int a, int x) {
		System.out.println("a : " + a + "x : " + x);
	}
	*/
	
	
	
	
}
