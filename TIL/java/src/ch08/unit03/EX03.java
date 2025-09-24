package ch08.unit03;

public class EX03 {

	public static void main(String[] args) {
		Test3 t1 = new Test3();
		Test3 t2 = new Sample3();
		Test3 t3 = new Demo3();
		
		t1.disp(); //Test3의 print
		t2.disp(); //Sample3의 print // 오버라이딩하면 아버지 메소드는 무조건 숨음 super.print로만 호출 가능
		t3.disp(); //Test3의 print

	}

}

class Test3{
	public void print() {
		System.out.println("Test3의 print");
	}
	
	public void disp() {
		print();
		// write(); 컴파일 에러

	}
}

class Sample3 extends Test3{
	public void print() {
		System.out.println("Sample3의 print");
	}
	
	public void write() {
		System.out.println("write");
	}
}

class Demo3 extends Test3{
	public void sub() {
		System.out.println("sub");
	}
}

