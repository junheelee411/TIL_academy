package ch05.unit01;

public class Ex07 {

	public static void main(String[] args) {
		// 1 ~ 10 까지 난수를 100개를 발생하여 한줄에 10개씩 출력하고
		// 마지막에 각 숫자별 발생 횟수를 출력
		int n;
		int[] count = new int[10];
		
		for(int i = 1; i <= 100; i++) {
			n = (int)(Math.random() * 10) + 1;
			count[n-1]++;
			
			System.out.printf("%3d", n);
			
			if(i%10 == 0) {
				System.out.println();
			}
		}
		
		System.out.println("\n각 숫자별 발생횟수...");
		for(int i = 1; i <= 10; i++) {
			System.out.printf("%2d : %d \n", i, count[i-1]);
		}

	}

}
