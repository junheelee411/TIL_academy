package ch05.unit01;

public class Ex06 {

	public static void main(String[] args) {
		// 1 ~ 100 까지 수중 서로 다른 난수 10개 발생하여 출력
		
		int[]num = new int[10];
		
		// i 0  1  2  3  4
		//   50 60 55 45 55
		for(int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random() * 100) + 1;

			// 중복값이 존재 여부 확인
			for(int j = 0; j < i; j++) {
				if(num[i] == num[j]) {
					i--;
					break;
				}
			}
			
		}
		
		for(int n : num) {
			System.out.print(n + "  ");
		}
		System.out.println();

	}

}
