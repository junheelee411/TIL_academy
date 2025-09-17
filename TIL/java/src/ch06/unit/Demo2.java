package ch06.unit;

// 다른 패키지는 Demo2의 객체를 생성할 수 없음

class Demo2 {

	private int a = 100; // 클래스 안에서만 접근 가능
	int b = 200; // 동일한 패키지 안에서만 접근 가능
	protected int c = 300; //하위 클래스 및 동일한 패키지 안에서만 접근 가능
	public int d =400; // 제약 없이 어디에서나 접근 가능
	
	//메소드
	
	public void disp()
	{
		System.out.println(a + " , " + b + " , " + c + " , " + d);
	}
	
}
