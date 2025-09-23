package ch07.unit05;

import java.security.SecureRandom;
import java.util.Scanner;

/*
 	1~100 사이의 난수를 발생시켜 20번 안에 맞히는 게임
 	
 */

public class Quiz02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SecureRandom rnd = new SecureRandom();

		int com = rnd.nextInt(100) + 1;
		int input = 0;
		int count = 1;

		do {
			System.out.print("input : ");
			input = sc.nextInt();

			if (input > com) {
				System.out.println("↓");
			} else if (input < com) {
				System.out.println("↑");
			}
		} while (++count < 20 && input != com);

		System.out.println("com : " + com);
		if (com != input) {
			System.out.println("실패");
		} else {
			System.out.println("count : " + count);
		}

		sc.close();
	}
}

/*
 * for(; count<20; count++) { System.out.println("숫자를 맞혀보세요. " + "기회 : " +
 * (int)(20-count+1)); System.out.println(com); input = sc.nextInt();
 * if(com==input) { System.out.println(count + "번만에 맞히셨습니다."); break; } }
 * 
 * if(com!=input) { System.out.println("실패하셨습니다."); }
 * 
 */
