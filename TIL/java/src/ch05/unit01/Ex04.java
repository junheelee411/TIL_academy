package ch05.unit01;

public class Ex04 {

	public static void main(String[] args) {
		// 일반 변수
		int x = 10;
		int y = x;
		y += 5;
		System.out.println(x + ", " + y); // 10 15
		
		// 배열
		int[] a = new int[3];
		a[0] = 10; a[1] = 20; a[2] = 30;
		
		System.out.println("a 배열...");
		for(int n : a) {
			System.out.print(n + " "); // 10 20 30
		}
		System.out.println();
		
		// 배열은 참조형이다.
		int[] b = a;
		b[0] += 5;
		b[1] += 5;
		
		System.out.println("a 배열...");
		for(int n : a) {
			System.out.print(n + " "); // 15 25 30
		}
		System.out.println();

		System.out.println("b 배열...");
		for(int n : b) {
			System.out.print(n + " "); // 15 25 30
		}
		System.out.println();
		

	}

}
