package ch06.unit02;

// 클래스 별로 파일 저장이 원칙


public class EX01 {

	public static void main(String[] args) {
		int a; // 지역 변수(메소드 안에서 선언되고 메소드 안에서만 사용 가능)
		//System.out.println(a); // 컴파일 에러 (지역 변수는 초기화 하지 않으면 사용 불가)
		a=10;
		System.out.println(a);
		
		// 객체
		// 1. 참조 변수 선언(객체 선언)
		Test1 obj;
		// System.out.println(obj.name); // 컴파일 에러(obj 객체가 초기화되지 않음)
		
		// 2. 객체 생성(메모리 할당)
		// 객체명 = new 클래스명(); // 클래스명() : 생성자
		// 생성자는 객체를 생성할 때 사용하며 new 다음에 기술해야함
		obj = new Test1();
		
		// 3. 객체 사용
		// 필드 : 객체명.필드
		// 메소드 : 객체명.메소드([인수])
		System.out.println(obj.name);
		
		// 필드에 값 할당
		obj.name = "이자바";
		obj.age = 20;
		
		// 메소드 호출
		obj.write();
		
		/*
		Test1 obj2 = null; // runtime error(new로 메모리 할당 안함)
		System.out.println(obj2.name);
		*/
		
		Test1 obj2 = new Test1(); //선언과 동시에 메모리할당
		System.out.println(obj2.name);
		
		obj2.name ="다자바";
		System.out.println(obj.name + " : " + obj2.name);
	}

}

//클래스 : 데이터(필드) + 기능(메소드)

class Test1
{
	// 필드 선언(인스턴스 변수)
	// 필드는 초기화 하지 않으면 객체가 생성되는 시점에 객체 -> null, 숫자필드 -> 0으로 초기화
	String name; // 객체 생성 시 null로 초기화
	int age; // 객체 생성 시 0으로 초기화
	int score = 100; // 객체 생성 시 100으로 초기화
	
	// 메소드(인스턴스 메소드)
	public void write()
	{
		System.out.println(name + " : " + age + " : " + score);
	}
	
}