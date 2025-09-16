package ch05.unit01;

public class Ex08 {

	public static void main(String[] args) {
		// 1차원 배열의 초기화
		// 초기화 하는 경우 초가값의 개수가 배열의 크기
		// 초기화 할 경우 new int[]를 new int[5] 처럼 요소 크기를 지정하면 안됨
		int []num = new int[] {2,4,6,8,10};
		// int []num = {2,4,6,8,10};
			// 선언과 동시에 초기화 하는 경우에는 new int[] 생략 가능
		
		/*
		 int []num;
		 num = new int[] {2,4,6,8,10}; // new int[] 생략 불가 
		*/
		
		System.out.println("요소의 수 : " + num.length);
		
		int s = 0;
		for(int n : num) {
			s += n;
		}
		System.out.println("결과 : " + s);

	}

}
