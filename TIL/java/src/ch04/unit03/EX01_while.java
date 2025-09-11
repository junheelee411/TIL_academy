package ch04.unit03;

public class EX01_while {
	public static void main(String[] args) {
		
		/*
		int n;
		n=0; //변수 초기화
		
		while(n<10)
		{
			n++;
			System.out.print(n + " ");
		}
		
		System.out.println();
		System.out.println(10);
		*/
		
		/*
		int n;
		n=0; //변수 초기화
		
		while(n++<10)
		{
			System.out.print(n + " ");
		}
		
		System.out.println();
		System.out.println(n);
		*/
		
		/*
		int n = 0;
		while(++n<10)
		{
			System.out.print(n + " ");
		}
		
		System.out.println();
		System.out.println(n);
		*/
		
		int n = 0;
		while(n++<10)
		{
			System.out.print(n + " ");
			n++;
		}
		
		System.out.println();
		System.out.println(n);
	}

}
