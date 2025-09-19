package ch06.unit04;

public class EX08 {

	public static void main(String[] args) {

		Test8.write(5);
		Test8 t = new Test8();
		t.disp();
	}

}

class Test8{
	private int a;
	public static int b=20;
	
	public void set(int a) {
		this.a=a;
	}
	
	public void disp() {
		System.out.println("a: " + this.a + " b: " + b);
		//동일한 이름의 지역변수가 없으므로 this 생략 가능
	}
			
	public static void write(int b) {
		
		// b=b+10; 매개변수 값 증가
		// this.b=b+100; 컴파일 에러 / this는 static 메소드에서는 사용 불가
		// this는 호출한 객체르 의미
		
		// 클래스 메소드는 객체 생성과 관계 없음
		Test8.b=b+100; // 평상시에는 동일한 클래스 내에서는 클래스명 생략 가능
	}
}