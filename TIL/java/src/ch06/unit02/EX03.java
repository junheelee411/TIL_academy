package ch06.unit02;

import ch06.unit.Demo;
// import ch06.unit.Demo2; // 컴파일 에러
// 해당 클래스가 없거나 / public 클래스가 아닐 때

public class EX03 {

	public static void main(String[] args) {
		
		Demo obj = new Demo();
		// System.out.println(obj.a); private : 클래스 내부에서만 접근 가능
		// System.out.println(obj.b); // 동일한 패키지 x
		// System.out.println(obj.c); // 하위 클래스 x, 동일한 패키지 x
		System.out.println(obj.d); //public은 어디에서나 가능
		
		
		obj.disp(); // 간접적으로 호출은 가능
		obj.sub(); // 간접적으로 호출은 가능
		
	}
	
}
