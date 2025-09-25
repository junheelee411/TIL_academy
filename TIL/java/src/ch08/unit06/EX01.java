package ch08.unit06;

public class EX01 {

	public static void main(String[] args) {
		
		// Demo1 d = new Demo1(); 컴파일 에러 - 인터페이스는 객체 생성 불가
		
		// 인터페이스는 상위 클래스와 유사
		Demo1 d = new DemoImpl(); // up casting
		d.print();
		d.disp();
		
		// d.sub(); 컴파일 에러 - 인터페이스에 없음
		((DemoImpl)d).sub();
		
		System.out.println(Demo1.B);

	}

}

// interface - 선언만 있고 정의가 없는 abstract class의 일종

interface Demo1{
	
	// 인터페이스 필드는 static final만 가능
	public static final int A = 10;
	int B = 20; // 필드는 자동으로 public static final 처리됨
	
	// 인터페이스 메소드는 public abstract만 가능
	public abstract void disp();
	void print(); // 메소드는 자동으로 public abstract으로 처리됨
	
	// public void write() {} 컴파일 에러 - 구현은 불가함	
}

// 인터페이스 구현
// 인터페이스를 구현한 클래스는 추상 클래스가 아니면 모든 메소드를 재정의(overriding) 해야함
class DemoImpl implements Demo1{
	
	@Override
	public void disp() {
		System.out.println("disp");
	}
	
	@Override
	public void print() {
		System.out.println("print");
	}
	
	public void sub() {
		System.out.println("sub");
	}
}