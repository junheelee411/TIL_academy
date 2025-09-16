package ch05.unit01;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		// 5개의 점수를 입력 받아 최대 및 최소를 뺀 합구하기
		Scanner sc = new Scanner(System.in);
		int [] score = new int[5];
		int tot, max, min;
		
		tot = 0;
		for(int i = 0; i < score.length; i++) {
			do {
				System.out.print((i+1) + "번째 점수 : ");
				score[i] = sc.nextInt();
			} while(score[i] < 0 || score[i] > 10);
			
			tot += score[i]; // 총합 구하기
		}
		
		// 최대 및 최소 값 구하기
		max = min = score[0];
		for(int i = 1; i < score.length; i++) {
			if(max < score[i]) {
				max = score[i];
			} else if(min > score[i]) {
				min = score[i];
			}
		}
		
		System.out.println("\n점수 리스트");
		for(int n : score) {
			System.out.printf("%5d", n);
		}
		System.out.println("\n취득 점수 : " + (tot - max - min));
		
		sc.close();
	}

}
