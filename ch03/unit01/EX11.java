package ch03.unit01;

public class EX11 {

	public static void main(String[] args) {
		int a,b;
		
		a=10;
		b=a++ + a++ + 1; // 10 + 11 + 1
		System.out.println(a+","+b);

		a=10;
		b=++a + ++a + 1; //11+ 12 = 1
		System.out.println(a+","+b);
		
		a=10;
		b=a++ + ++a + ++a + a++ + a++; // 10+ 12 + 13 + 13 + 14
		System.out.println(a+","+b);
		
		a=0;
		b=a---a;
		System.out.println(b);
	}

}
