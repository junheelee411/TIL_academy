package ch08.unit01;

public class EX05 {

	public static void main(String[] args) {

	}

}

class Test5{
	int x;
	
	public Test5() {
		x=0;
		System.out.println("Test5 - 인자 없는 생성자");
	}
	

	public Test5(int x) {
		this.x=x;
		System.out.println("Test5 - 인자 하나 있는 생성자");
	}
	
	public void print() {
		System.out.println(x);
	}
}

class Demo5 extends Test5{
	int a;
	
	public Demo5() {
		// super(); 생략된 것
		a = 0;
		System.out.println("Demo5 - 인자 없는 생성자");
	}
	
	public Demo5 (int a) {
		this(a,10); //this 인수가 있으면 super 인수는 올 수 없음
		System.out.println("Demo5 - 인자 하나 있는 생성자");
	}
	
	public Demo5 (int a, int x) {
		super(x); // 생략하면 super();이 호출됨
		
		this.a = a;
		System.out.println("Demo5 - 인자 둘 생성자");
	}
	
	public void disp() {
		System.out.println(a + " , " + x);
	}
}
