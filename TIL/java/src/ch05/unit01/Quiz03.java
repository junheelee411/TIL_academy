package ch05.unit01;

import java.util.Arrays;
import java.util.Scanner;

//  0 <= Math.random() < 1
public class Quiz03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] lotto = new int[6];
		int count;

		do {
			System.out.print("구매 개수 ? ");
			count = sc.nextInt();
		} while(count < 1 || count > 5);
		
		for (int c = 1; c <= count; c++) {
			
			for (int i = 0; i < lotto.length; i++) {
				lotto[i] = (int) (Math.random() * 45) + 1;
				for (int j = 0; j < i; j++) {
					if (lotto[i] == lotto[j]) {
						i--;
						break;
					}
				}
			}

			Arrays.sort(lotto);

			System.out.print(c + "게임 : ");
			for (int n : lotto) {
				System.out.printf("%3d", n);
			}
			System.out.println();
		}

		sc.close();
	}

}
