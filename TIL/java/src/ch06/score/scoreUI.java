package ch06.score;

import java.util.Scanner;

public class scoreUI {
	private Scanner sc = new Scanner(System.in);

	public void menu() {
		int c;

		while (true) {
			do {
				System.out.println("1.등록 2.수정 3.삭제 4.학번검색 5.리스트 6.종료 ? ");
				c = sc.nextInt();
			} while (c < 1 || c > 6);

			if (c == 6) {
				System.out.println("프로그램 종료...");
				return; // 빠져나가라
			}

			switch (c) {
			case 1:
				input();
				break;
			case 2:
				update();
				break;
			case 3:
				delete();
				break;
			case 4:
				findByHak();
				break;
			case 5:
				printAll();
				break;
			}
		}

	}

	public void input() {
		System.out.println("데이터 입력...");
	}

	public void printAll() {
		System.out.println("데이터 전체 리스트");
	}

	public void findByHak() {
		System.out.println("학번 검색...");
	}

	public void update() {
		System.out.println("데이터 수정...");
	}

	public void delete() {
		System.out.println("데이터 삭제...");
	}

}
