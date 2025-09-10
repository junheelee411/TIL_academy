package ch03.unit02;

public class EX01 {

	public static void main(String[] args) {
		// 관계연산자 : 결과는 boolean(true or false)
		
		int a = 10, b = 5;
		boolean c;
		
		System.out.println("a : " + a + ",\t b : " + b);
		
		c= a>b;
		
		System.out.println("a>b : " + c);
		System.out.println("a>=b : " + (a>=b));

		System.out.println("a<b : " + (a<b));
		System.out.println("a<=b : " + (a<=b));
		
		System.out.println("a==b : " + (a==b));
		System.out.println("a!=b : " + (a!=b));
		

	}

}
