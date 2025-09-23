package ch07.unit05;

/*
 	Math 클래스
 	- 수학과 관련된 method 제공
	- method 및 field는 static으로 작성되어 있음
  
 */
public class EX01Math {

	public static void main(String[] args) {
		double a;
		
		System.out.println(Math.PI);
		
		a=Math.sin(30.0*Math.PI/100); // 각도는 라디안으로
		System.out.println(a);
		
		a=Math.sqrt(2.0); //제곱근
		System.out.println(a);
		
		a=Math.floor(12.77); // 넘지 않는 최대 정수
		System.out.println(a);

		a=Math.ceil(12.77); // 크거나 같은 수 중 가장 작은 정수
		System.out.println(a);

		a=Math.pow(2,10); // 2의 10승
		System.out.println(a);

		a=Math.random(); // 0<=난수<1
		System.out.println(a);
	
	}
}
