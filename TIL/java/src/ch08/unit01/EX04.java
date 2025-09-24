package ch08.unit01;

public class EX04 {

	public static void main(String[] args) {
		Test4 t = new Test4(2);
		// Test4 t = new Test4(); 컴파일 에러
		t.print();
		
		Demo4 d = new Demo4();
		d.disp();
	}

}

class Test4{
	int x;
	public Test4(int x) {
		this.x=x;
		System.out.println("Test4 생성자");
	}
	
	public void print() {
		System.out.println(x);
	}
	
}

/*
 	상위 클래스에 인자 있는 생성자만 존재하는 경우
 	- 하위 클래스는 생성자를 만들고 명시적으로 인자가 있는 상위클래스 생성자를 호출해야 한다.
 */

class Demo4 extends Test4{
	int a=100;
	
	public Demo4() {
		// super(); 컴파일 에러. 상위 클래스에 인자가 없는 생성자가 없음
		super(10);
	}
	
	public void disp() {
		System.out.println(x + " , " + a);
	}
}
