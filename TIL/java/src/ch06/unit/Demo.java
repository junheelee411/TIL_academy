package ch06.unit;

public class Demo {

	private int a = 10; // 클래스 안에서만 접근 가능
	int b = 20; // 동일한 패키지 안에서만 접근 가능
	protected int c = 30; //하위 클래스 및 동일한 패키지 안에서만 접근 가능
	public int d =40; // 제약 없이 어디에서나 접근 가능
	
	//메소드
	
	public void disp()
	{
		System.out.println(a + " , " + b + " , " + c + " , " + d);
	}
	
	public void sub()
	{
		Demo2 dd = new Demo2();
		System.out.println(dd.b + " , " + dd.c + " , " + dd.d);
	}

}
