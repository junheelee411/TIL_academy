package ch08.unit06;

public class EX02 {

	public static void main(String[] args) {
		DemoImpl2 di = new DemoImpl2();
		di.disp();
		di.print();
		di.sub();
		
		// 업캐스팅
		Ademo2 ad = new DemoImpl2();
		Bdemo2 bd = new DemoImpl2();
		
		ad.disp();
		// ad.print() 컴파일 에러
		bd.print();
		
		// 다운 캐스팅
		((DemoImpl2)ad).disp(); 


	}

}

interface Ademo2{
	public void disp();
}

interface Bdemo2{
	public void print();
}

class DemoImpl2 implements Ademo2, Bdemo2{

	@Override
	public void print() {
		System.out.println("Bdemo2 print");
		
	}

	@Override
	public void disp() {
		System.out.println("Ademo2 disp");
	}
	
	public void sub() {
		System.out.println("sub");
	}
	
}