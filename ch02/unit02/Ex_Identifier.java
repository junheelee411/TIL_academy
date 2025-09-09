package ch02.unit02;

public class Ex_Identifier {

	public static void main(String[] args) {
		
		// 타입 변수명 = 초기값
		
		String name = "홍길돌";
		String _tel ="010-1234-5678"; //0.-때문에 문자열로 저장
		String 주소 = "서울 마포구";
		//String int; 예약어를 식별자로 ->컴파일 에러(번역을 할 수 없는 에러)
		//String #name; 특수문자를 식별자로 ->컴파일 에러
		//String name = "김자바"; 중복된 지역 변수명(한 영역 안에서 하나만 가능) ->컴파일 에러
		
		int $age= 20; //$는 유니코드 자바 레터라 가능
		//int age-1=10; 컴파일오류
		int a = 100; //오류는 안 나지만 내용 파악 불가

		System.out.println("name : " + name);
		System.out.println("_tel : " + _tel);
		System.out.println("주소 : " + 주소);
		System.out.println("$age : " + $age);
		System.out.println("a : " + a);
	}

}
