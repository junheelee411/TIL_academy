package ch02.unit03;

public class EX03_printf {

	public static void main(String[] args) {
		int a=10,b=7;
		
		System.out.printf("%d %d %d %d\n", a,b,b,a);
		System.out.printf("%1$d %2$d %2$d %1$d\n", a,b);
	}

}
