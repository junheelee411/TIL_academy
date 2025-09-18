package ch06.unit04;

public class EX02 {

	public static void main(String[] args) {
		Demo2 obj = new Demo2();
		obj.disp();

		// Test2 obj = new Demo2(); 컴파일 에러(인자가 없는 생성자가 없음/undefined creator)
		Test2 obj2= new Test2(15);
		obj2.print();
		
	}
}

class Demo2
{
	private int a = 10;
	// 생성자가 존재하지 않으면 자바는 디폴트 생성자를 만든다.
	// 디폴트 생성자 : public Demo2(){}

	public void disp()
	{
		System.out.println(a);
	}
}

class Test2
{
	private int a;
	// 생성자가 존재하면 자바는 디폴트 생성자를 만들지 않는다.
	public Test2(int n) // 생성자
	{
		a=n;
		System.out.println("인자 하나인 생성자");
	}
	
	public void print()
	{
		System.out.println("a : " + a);
	}
}

