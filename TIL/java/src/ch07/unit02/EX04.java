package ch07.unit02;

// 클래스와 기본 자료형은 다름
// 컴파일 에러 발생

public class EX04 {

	public static void main(String[] args) {
		long a; // 기본 자료형 null 가질 수 없음
		Long b; //클래스 자료형 null 가질 수 있음
		int c;
		
		a=10; //int -> long 자동 형변환(casting)
		// b=10; 컴파일 에러 Long과 int는 캐스팅 불가 (클래스->기본자료형 불가)
		b=10L; //롱형만 넣어야함
		
		//c=a; 컴파일 에러
		c=(int)a; //Long형을 int로 강제 캐스팅
		
		//클래스는 상화관계 제외하고는 캐스팅 불가
		
		//Integer과 Long은 상속관계가 아니므로 캐스팅 불가
		//Integer d= (Integer)b; 컴파일 에러
		
		Integer n=10;
		long m=n; //가능
		
		System.out.println(a+" , " + b + " , " + c);
		System.out.println(n+" , " + m);
		

	}

}
