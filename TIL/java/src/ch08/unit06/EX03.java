package ch08.unit06;

public class EX03 {

	public static void main(String[] args) {
		Cdemo3 obj = new DemoImpl3();
		obj.disp();
		
	}

}

class DemoImpl3 implements Cdemo3{

	@Override
	public void print() {
		System.out.println("print");
		
	}

	@Override
	public void disp() {
		System.out.println("disp");
		
	}

	@Override
	public void sub() {
		System.out.println("sub");
	}
	
}

interface Ademo3{
	public void print();
}

interface Bdemo3{
	public void disp();
}	
// 인터페이스는 다른 인터페이스를 상속받을 수 있고, 다중 상속을 받을 수 있다
interface Cdemo3 extends Ademo3, Bdemo3{
	public void sub();

}
	