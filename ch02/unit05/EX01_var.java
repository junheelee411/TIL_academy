package ch02.unit05;

public class EX01_var {

	public static void main(String[] args) {
		// var - 지역 변수 유형 추론
		var a= 10;
		int n= a;
		System.out.println(a+","+n);
		
		//var s; 컴파일 에러 - var은 초기값으로 타입 추론함으로 반드시 초기화 필요
		var s="Korea";
		System.out.println(s instanceof String);
		
	}

}
