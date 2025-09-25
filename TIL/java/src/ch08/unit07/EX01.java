package ch08.unit07;


/* 
 	static 중첩 클래스
 	- 외부 클래스(Test1)의 객체 생성 유무와 상관 없이 객체를 생성하여 사용할 수 있는 클래스
 	- 컴파일하면 Test1$User1.class 클래스가 생성됨
 */
public class EX01 {
	public static void main(String[] args) {
		// static 중첩 클래스의 객체 생성
		Test1.User1 user = new Test1.User1();
		user.write();
		
	
	}
}

class Test1{
	int a=10;
	static int b = 20;
	
	static class User1{
		int x = 100;
		
		public void write() {
			System.out.println(b + ", " + x);
			// System.out.println(a); 컴파일 에러
		}
		
		public void sub() {
			Test1 ob = new Test1();
			System.out.println(ob.a);
		}
	}
	
	public void print() {
		System.out.println(a + ", " + b);
	}
}