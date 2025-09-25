package ch08.unit07;

public class EX02 {

	public static void main(String[] args) {
		// Test2.User2 ob = new Test2.User2(); 컴파일 에러 - 외부 클래스 객체를 생성 후 생성 가능

		Test2 t = new Test2();
		Test2.User2 u = t.new User2();
		u.sub();
		
	}
}

/*
 	내부 클래스(member class)
 	- 외부 클래스의 객체가 생성되어야 객체를 생성할 수 있는 클래스
 */

class Test2{
	int a=10;
	static int b=20;
	
	class User2{
		int x =30;
		
		public void sub() {
			System.out.println(a + ", " + b + ", " + x);
			// print(); 가능
		}
	}

	public void print() {
		System.out.println(a + ", " + b);
	}
	
	public void method() {
		// 일반적으로 클래스의 메소드 내에서 내부 클래스의 객체를 생성하여 사용
		User2 user = new User2();
		user.sub();
	}
}