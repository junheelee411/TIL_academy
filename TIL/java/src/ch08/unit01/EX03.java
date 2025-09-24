package ch08.unit01;

/*
  하위 클래스 객체 생성
  1) 상위 클래스 필드 메모리 할당. 기본값 초기화, 초기화 수식 실행 
  2) 하위 클래스 필드 메모리 할당. 기본값 초기화, 초기화 수식 실행 
  3) 상위 클래스 초기화 블럭 실행
  4) 상위 클래스의 생성자 몸체 실행
  5) 하위 클래스 초기화 블럭 실행
  6) 하위 클래스의 생성자 몸체 실행
 */

public class EX03 {

	public static void main(String[] args) {
		Demo3 obj = new Demo3();
		
		obj.disp();

	}

}

class Test3{
	int a=10;
	
	public Test3() {
		System.out.println("Test3 생성자");
	}
	
	public void print() {
		System.out.println(a);
	}
}

class Demo3 extends Test3{
	int x=100;

	public Demo3(){
		super(); 
		// 최상단 한 번만 가능(밑으로 못 내림)
		// 상위 클래스의 생성자 몸체 호출
		// 없으면 컴파일 할 때 super(); 추가하여 상위 클래스 생성자 몸체 호출
		
		System.out.println("Demo3 생성자");
	}
	
	public void disp() {
	System.out.println(a + ":" + x);
	}
}
