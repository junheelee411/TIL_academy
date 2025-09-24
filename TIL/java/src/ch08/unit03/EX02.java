package ch08.unit03;

/*
 * down casting
 	up casting한 객체를 다시 원래의 객체로 캐스팅하는 것
 	down casting은 upcasting한 객체만 가능하다
 	down casting은 반드시 강제 캐스팅이 필요하다
 	
 	up casting
 	상위 클래스의 객체가 하위 클래스의 객체를 참조(상위 클래스 객체에 하위 클래스 객체의 주소값 복사)
 	언제나 가능
 	형변환 필수 아님
 	
 	
 */
public class EX02 {

	public static void main(String[] args) {
		Test2 obj = new Demo2(); // up casting
		// obj.write(); 컴파일 에러 뉴 뒤에 뭐오나 몰라 그래서 터뜨려
		Demo2 dd = (Demo2)obj; // down casting
		dd.write();
		
		// ((Demo2)obj).write(); down casting
		
		// Test2 t2 = new Test2();
		// Demo2 d2=(Demo2)t2; 런타임 에러 classCastException
	}

}

class Test2{
	int a=10;
	int b=20;
	
	public void print() {
		System.out.println(a + ", " + b);
	}
	
	public void disp() {
		System.out.println("disp");
	}
}

class Demo2 extends Test2{
	int b=100;
	int c=200;
	
	public void print() {
		System.out.println(a + ", " + b + ", " + super.b + ", " + c);
	}
	
	public void write() {
		System.out.println("write");
	}
}