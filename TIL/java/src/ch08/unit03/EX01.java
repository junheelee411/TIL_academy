package ch08.unit03;

public class EX01 {

	public static void main(String[] args) {
		// 클래스의 형 변환은 상속 관계에서만 가능
		//Integer a = 10;
		//Long b = a; 컴파일 에러
		//Long b = (Long)a; 컴파일 에러
		
		Integer a=10;
		Object b=a; // 가능 (Integer extends Object)
		Integer c = (Integer)b; // downCasting(up한 것만 down 가능)
		
		Test1 t =new Test1(); // 자식 객체 생성하면 부모 메모리할당부터함
		t.print(); 
		//System.out.println(t.c); 컴파일 에러 / 하위 클래스 멤버는 접근 불가
		System.out.println();
		
		// 클래스는 상속관계가 아니면 어떠한 경우에도 형변환이 불가능하다.
		// Integer와 Long은 형변환 불가
		
		/*
		 	up-casting
		 	상위 클래스의 객체가 하위 클래스의 객체를 참조하는 것
		 	up casting은 언제나 가능
		 	형 변환을 하지 않아도 됨
		 */
		// Test1(상위) > Demo1(하위)
		Demo1 demo = new Demo1();
		Test1 test = demo; // 실행 시점에
		System.out.println(demo==test); // true 참조 영역이 동일
		
		System.out.println(demo.b); //100
		System.out.println(test.b);  //20
		// 업캐스팅 객체라 할지라도 필드는 자기 자신것만 참조할 수 있음
		// System.out.println(test.c); 컴파일 에러. 컴파일 시점에 검사
		// Test1 클래스에 c라는 필드가 존재하지 않음
		System.out.println();
		test.print();
		// 업캐스팅된 객체(부모객체=자식객체)에서 재정의된 메소드는 숨는다.(부모메소드 호출불가)
		// 재정의된 하위 클래스 메소드가 호출됨
		// Test1의 클래스 print()메소드를 직접 호출할 수 있는 방법 x
		
		test.disp();
		
		// test.write(); 컴파일 에러
		
	}
}

class Test1{
	int a= 10;
	int b=20;
	
	public void print() {
		System.out.println(a + ", " + b);
	}
	
	public void disp() {
		System.out.println("disp");
	}
}

class Demo1 extends Test1{
	int b=100;
	int c=200;
	
	public void write() {
		super.print();
		System.out.println(super.b);
	}
	
	@Override
	public void print() {
		System.out.println(a + ", " + b + ", " + super.b + ", "+ c);
	
	}
	
}