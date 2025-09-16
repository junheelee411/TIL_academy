package ch05.unit01;

import java.util.Arrays;

/*
  - Arrays 클래스
    : 배열을 조작할 수 있는 메소드를 가지고 있는 클래스
    : 모든 메소드가 static 이므로 객체 생성 없이 바로 사용 가능
    : 배열 복사, 정렬, 검색, 비교와 간은 기능을 제공
*/

public class Ex11 {

	public static void main(String[] args) {
		int[] num = new int[10];
		
		for(int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random() * 100) + 1;
		}
		
		System.out.println("발생된 난수 : ");
		/*
		for(int n : num) {
			System.out.print(n + "  ");
		}
		System.out.println();
		*/
		String s = Arrays.toString(num);
		System.out.println(s);
		
		// 정렬
		Arrays.sort(num);
		
		System.out.println("정렬 후 : ");
		for(int n : num) {
			System.out.print(n + "  ");
		}
		System.out.println();

	}

}
