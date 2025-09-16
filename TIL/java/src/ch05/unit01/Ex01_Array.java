package ch05.unit01;

// 배열 선언 및 값 할당
public class Ex01_Array {

	public static void main(String[] args) {
		// 배열 : 크기와 성격이 같은 일련의 원소들이 모여 공동의 집합구조를 갖는 자료의 집합체
		
		int [] num; // 배열 선언
		num = new int[5]; // 메모리 할당(정수 5개를 저장할 수 있는 배열)
		
		// int [] num = new int[5]; // 배열 선언 및 메모리 할당
		
		// int a;
		// System.out.println(a); // 컴오류. 초기화가 되어 있지 않음
		
		// System.out.println(num[0]); // 0
			// 배열을 메모리를 할당하면 기본적으로 숫자배열은 0, 객체는 null로 초기화
		
		// 배열에 값 할당 : 첨자는 0 ~ 길이-1 까지 사용 가능
		num[0] = 1; num[1] = 3; num[2] = 5; num[3] = 7; num[4] = 9;
		
		// num[5] = 11; // 런타임오류. ArrayIndexOutOfBoundsException 발생
				
		// length 속성 : 배열의 요소의 수(길이)를 반환
		int s = 0;
		for(int i = 0; i < num.length; i++) {
			s += num[i];
		}
		
		System.out.println("결과 : " + s);

	}

}
