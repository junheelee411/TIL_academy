package ch08.unit04;

public class EX01 {

	public static void main(String[] args) {
		Demo1 obj = new Demo1();
		
		double s = obj.area(10);
		obj.disp(s);
	}
}

/*
final 클래스는 하위 클래스를 가질 수 없음
대표적인 final 클래스
- String, StringBuffer 등
*/

class Test1{
	public static final double PI = 3.141592;
	
	//final 메소드는 재정의 불가
	public final double area(final double r) {
		return r*r*PI;
	}
}

class Demo1 extends Test1{
	public void disp(double s) {
		System.out.println("결과 : " + s);
	}
}