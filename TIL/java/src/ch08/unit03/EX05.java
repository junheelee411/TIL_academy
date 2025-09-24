package ch08.unit03;

public class EX05 {

	public static void main(String[] args) {
		// object > Test5 > Demo5
		
		Test5 t = new Test5();
		Test5 t1 = new Demo5(); // up-casting
		System.out.println(t1);
		Object o1 = new Demo5(); // up-casting
		
		//Test5 t2=(Test5)o1; 문제 x
		//Test5 t2=(Demo5)o1; 문제 x
		
		System.out.println(t1.b); //20
		// System.out.println(o1.b); //컴파일 에러
		System.out.println(((Test5)o1).b); //20
		System.out.println(((Demo5)o1).b); //100
		
		// Demo5 d = (Demo5)t; 런타임 에러
		if (t instanceof Demo5) {
			Demo5 d = (Demo5)t;
			d.write();
		} else {
			System.out.println("Demo 객체가 아님");
		}
		
		if(t1 instanceof Demo5) {
			Demo5 d = (Demo5)t1;
			d.write();
		}
		
		// instanceof 연산자의 패턴 매칭
		if(t1 instanceof Demo5 d) { //JDK16 정식 스팩
			d.write();
		}
	}

}

class Test5{
	int a=10;
	int b = 20;
	public void print() {
		System.out.println(a + ", " + b);
	}
	public void disp() {
		System.out.println("disp");
	}
}

class Demo5 extends Test5{
	int b=100;
	int c= 200;
	public void print() {
		System.out.println(a+":"+super.b+":"+b+":"+c);
	}
	public void write() {
		System.out.println("write");
	}
}