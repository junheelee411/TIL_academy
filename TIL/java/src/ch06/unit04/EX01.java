package ch06.unit04;

public class EX01 {

	public static void main(String[] args) {
		Test1 t =new Test1();

		t.disp();
	
		
	}

}


class Test1
{
	int a;
	int b;
	// System.out.println(a); 컴파일 오류 (실행문이 올 수 없음)

	public Test1()
	{
		a=5;
		b=10;
		System.out.println("인자가 없는 생성자");
	}
	
	public void disp()
	{
		// Test1(); 생성자는 일반 메소드처럼 호출 불가 
		System.out.println(a + " : " + b);
	}
}