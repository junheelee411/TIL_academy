package ch03.unit02;

public class EX04 {

	public static void main(String[] args) {
		int a,b;
		boolean c;
		
		a = 20; b=20;
		c= ++a > 20 && ++b > 20;
		System.out.println(a + "," + b + "," + c);

		a = 20; b=20;
		c= a++ > 20 && ++b > 20; //단축연산
		System.out.println(a + "," + b + "," + c);
		
		a = 20; b=20;
		c= ++a > 20 && b++ > 20; 
		System.out.println(a + "," + b + "," + c);

		
		a = 20; b=20;
		c= ++a > 20 || ++b > 20; //단축연산
		System.out.println(a + "," + b + "," + c);

		a = 20; b=20;
		c= a++ > 20 || ++b > 20;
		System.out.println(a + "," + b + "," + c);
		
		a = 20; b=20;
		c= ++a > 20 || b++ > 20; //단축연산 
		System.out.println(a + "," + b + "," + c);

		a = 20; b=20;
		c= a++ > 20 || b++ > 20;
		System.out.println(a + "," + b + "," + c);
	}

}
