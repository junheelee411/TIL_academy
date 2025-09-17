package ch06.unit02;

public class EX04 {

	public static void main(String[] args) {
	
		// 참조변수 선언 및 메모리 할당
		// 메모리 할당을 받은 참조변수만큼 필드는 메모리 할당 받음
		Test4 t1 = new Test4(); //a:10,b:0 메모리 할당
		Test4 t2 = new Test4(); //a:10,b:0 메모리 할당
		// 참조변수(레퍼런스 변수)는 주소를 가지고 있음

		
		t1.b=100;
		System.out.println(t1.a + " , " + t1.b);
		System.out.println(t2.a + " , " + t2.b);

		System.out.println(t1==t2); // 주소비교. false
		
		Test4 t3 = new Test4();
		Test4 t4 = t3; // t3과 t4는 참조값이 동일 (주소 복사)
		
		t4.b=200;
		System.out.println(t3.a + " , " + t3.b);
		System.out.println(t4.a + " , " + t4.b);
		
		System.out.println(t3==t4); //true 동일한 주소(동일한 영역 참조)
		
		// 객체는 값을 가지고 있는 것 x
		// 필드가 저장된 주소 가지고 있음
		
		// 클래스이름@해쉬코드 출력
		// 해쉬코드 : JVM에서 객체르 빠르게 검색하기 위해 사용
		// 동일한 객체 : 해쉬코드 동일 / 해쉬코드 같다고 같은 객체 아님(주소 다를 수 있고 해쉬코드 변경 가능)
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);
		
		String s1 = "서울";
		String s2 = new String ("서울");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode()); 
		// false 문자열을 비교 x 주소 비교
		// 해쉬코드는 값을 기반으로 생성되기 때문에, 값이 같아서 동일하게 생성된 것
	}

}

class Test4
{
	int a = 10;
	int b;
	
	public void disp() 
	{	
		System.out.println(a + " , " + b);
	}
}
