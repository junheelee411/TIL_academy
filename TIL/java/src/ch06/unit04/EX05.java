package ch06.unit04;

public class EX05 {

	public static void main(String[] args) {
		Test5 t = new Test5();
		t.set(5);
		t.disp();
		t.write();
		System.out.println();

		Test5 t2 = new Test5();
		t2.set(100);
		t2.disp();
		t2.write();
	}

}

class Test5
{
	private int a;
	private int b;
	private int c =5;
	
	public void set (int b)
	//this : 호출한 객체를 나타냄
	{
		a=5; //this.a 에서 this가 생략됨
		this.b = b+100; //파라미터 아니고 객체의 필드변수임을 나타냄
	}
	
	public void disp() {
		int c=50;
		System.out.println(a+" , "+b+" , " + this.c + " , "+ c);
		// 필드 필드 필드 지역
	}
	
	public void write() {
		System.out.println(a+" , "+b+" , "+ this.c +  " , "+c);
		// 필드 필드 필드 필드
	}
	
	
}

