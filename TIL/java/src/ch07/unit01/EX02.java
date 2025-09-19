package ch07.unit01;

public class EX02 {

	public static void main(String[] args) {
		// import 하지 않고 클래스 사용
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		int a;
		double s;
		
		System.out.println("수 ? ");
		a = sc.nextInt();
		
		// Math : java.lang 패키지에 존재하므로 import 하지 않음
		// 제곱근
		s = Math.sqrt(a);
		System.out.println(s);

		sc.close();

	}

}
