package ch05.unit01;

public class Ex02 {

	public static void main(String[] args) {
		int []a = new int[5];
		
		a[0] = 85; a[1] = 90; a[2] = 95; a[3]= 90; a[4] = 100;
		
		int t = 0;
		/*
		for(int i = 0; i < a.length; i++) {
			t += a[i];
		}
		*/
		
		// System.out.println(a);
		
		// for(타입 변수 : 집합변수) { } //a의 변수를 하나씩 n에 담음
		for(int n : a) { // 향상된 for 문
			t += n;
		}
		
		System.out.println("합 : " + t);
		

	}

}
