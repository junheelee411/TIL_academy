package ch06.unit02;

public class EX08 {

	
	private int r;
	
	public double area()
	{
		return r*r*3.141592;
	}
	
	public double length()
	{
		return r*2*3.141592;
	}
	
	public static void main(String[] args) {
		
		// r=10; //컴파일 에러 인스턴스 변수는 클래스 메소드에서 바로 접근 불가
		
		EX08 obj= new EX08();
		double a,b;
		
		obj.r=10;
		
		
		obj.r =10;
		a= obj.area();
		b= obj.length();
		
		System.out.println("반지름 : " + obj.r);
		System.out.println("넓이 : " + a);
		System.out.println("둘레 : " + b);
	}
}


	
	
