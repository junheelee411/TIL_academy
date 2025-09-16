package ch05.unit02;

public class EX01 {

	public static void main(String[] args) {
		int [][]a = new int[3][4]; //열수 고정
		
		System.out.println("행수 : " + a.length);
		System.out.println("0행의 열수 : " + a[0].length);
		
		System.out.println("배열의 참조 위치(주소) : " + a);
		System.out.println("0행열의 참조 위치(주소) : " + a[0]);
		System.out.println("0행 0열의 값 : " + a[0][0]);

		int [][]b = new int[3][];
		b[0] = new int[4];
		b[1] = new int[3];
		b[2] = new int[5];
		
		System.out.println("b 베열 행수 : " + b.length);
		System.out.println("0행의 열수 : " + b[0].length);
		System.out.println("1행의 열수 : " + b[1].length);
		System.out.println("2행의 열수 : " + b[2].length);
		

	}

}
