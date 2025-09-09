package ch02.unit04;

public class EX07_Escape {

	public static void main(String[] args) {

		System.out.println("a\tb\tc"); // \t - tab키
		System.out.println("x\ny"); // \n - 엔터
		System.out.println("1\\2"); // \ 출력
		System.out.println('\101'); //8진수 101 문자 - A
		System.out.println('\u0041'); //유니코드 0041(16 진수)의 문자 A

	}

}
