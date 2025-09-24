package ch08.unit01;

public class EX02 {

	public static void main(String[] args) {

		Demo2 a = new Demo2();
		a.disp();
	}

}

class Test2 {
	int a = 10;
	int b = 20;
	
	public void print() {
		System.out.println(a + ":" + b);
		// System.out.println(this.a + ":" + this.b); this 생략 가능
 	}
}

class Demo2 extends Test2{
	int b = 100;
	int x = 200;
	int y = 300;
	
	public void disp() {
		int x=50;
		
		System.out.println("a" + a); //10
		System.out.println("this.a" + this.a); //10
		System.out.println("super.a" + super.a); //10
	
		System.out.println("b" + b);
		System.out.println("super.b" + super.b);
		System.out.println("this.x : " + this.x);
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		
	}
	
}
	
