package ch07.unit06;

import java.text.NumberFormat;

public class EX02 {

	public static void main(String[] args) {
		String s1 = "1000";
		String s2 = "1,234";
		String s3 = "4567.12";
		
		int a= Integer.parseInt(s2.replaceAll(",", ""));
		System.out.println(a);
		
		// 문자열 -> 숫자
		NumberFormat nf = NumberFormat.getInstance();
		try {
			// 예외를 가지고 있는 코드 : 실행 중 예외가 발생하면 catch 블럭 실행
			// Number : Integer, Long, Double 등의 상위 클래스
			// Integer, Long, Double 등은 서로 상속 관계가 아니므로 형 변환 불가
			
			Number n1 = nf.parse(s1); // Long
			Number n2 = nf.parse(s2); //Long
			Number n3 = nf.parse(s3); //Double 소수점이 있기 때문,,,
			
			System.out.println(n1);
			System.out.println(n2);
			System.out.println(n3);
			
			// System.out.println(n1+100); 컴파일 에러 (n1은 객체이므로 연산 불가)
			
			// 정수 형태의 문자열을 parse() 로 반환하면 Long, 실수는 Double
			long ll = (Long)n1; // 다운캐스팅. 원래 자료형으로 변환
			System.out.println(ll + 10);
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
