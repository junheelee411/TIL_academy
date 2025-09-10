package ch03.unit03;

public class EX03 {

	public static void main(String[] args) {
		int a=7, b=5, c;
		c=a; a=b; b=c;
		System.out.println(a + " , " + b);
		
		int x=7, y=5;
		x=x^y;
		y=x^y;
		x=x^y;
		System.out.println(x + " , " + y);
		
		

	}

}
