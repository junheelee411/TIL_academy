package ch06.unit04;

// 필드와 매개변수(지역변수)의 이름이 동일하면 매개변수(지역변수)가 우선순위가 높다.
public class EX04 {

	public static void main(String[] args) {
		
		Test4 obj = new Test4();
		
		obj.set(5);
		obj.disp(); //10 0 50
		obj.write(); // 10 0 5
		
	}
}

class Test4
{
	private int a;
	private int b;
	private int c=5;
	
	public void set(int b) { //b는 매개변수(지역변수)
		
		a=10; // 필드변수
		b+=100;	// 매개변수 -> 필드변수는 영향 x (이름 중복하면 매개변수가 우선)
	}
	
	public void disp() {
		int c=50; //지역변수
		System.out.println("disp : " + a + " , " + b + " , " + c);
		//필드 지역 지역
	}
	
	public void write() {
		System.out.println("write : " + a + " , " + b + " , " + c);
		//필드 필드 필드
	}
	
	
	
	
}