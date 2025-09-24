package ch08.unit01;

public class EX01 {

	public static void main(String[] args) {
		Demo1 obj = new Demo1();
		System.out.println(obj.c); // 상위 클래스 필드 접근
		obj.print(); // 상위 클래스 메소드를 통해 private필드 간접 접근
		obj.disp();
		
	}

}

class Test1{ // 상위 클래스 : object
	private int a = 10;
	int b=20;
	protected int c =20;
	public int d = 40;
	
	public void print() {
		System.out.println(a + " : " + b + " , " + c + " , " + d);
	}
}

// 상위 클래스 Test1
class Demo1 extends Test1{
	int x = 10;
	
	public void disp() {
		// a는 private이므로 접근 불가
		System.out.println("상위에서 물려받은 필드 : " + b + " , " + c + " , " + d );
		System.out.println("x : " + x);
	}
	
	public void write() {
		print(); // 상위 클래스 메소드 호출
	}
}