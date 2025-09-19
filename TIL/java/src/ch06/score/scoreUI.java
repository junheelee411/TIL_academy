package ch06.score;

import java.util.Scanner;

public class scoreUI {
	private Scanner sc = new Scanner(System.in);
	private Score score = new Score(); // 클래스는 자료형

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
		System.out.println();
		System.out.println("데이터 입력...");
		ScoreVO vo = new ScoreVO();
		
		System.out.println("학번 ? ");
		vo.setHak(sc.next());
		
		System.out.println("이름 ? ");
		vo.setName(sc.next());
		
		System.out.println("국어 ? ");
		vo.setKor(sc.nextInt());
	
		System.out.println("영어 ? ");
		vo.setEng(sc.nextInt());
		
		System.out.println("수학 ? ");
		vo.setMat(sc.nextInt());
		
		// 입력된 정보를 배열에 저장
		score.append(vo);
		
		System.out.println("학생 정보가 등록 되었습니다.\n");
		
	}

	public void printAll() {
		System.out.println("*************");
		System.out.println("데이터 전체 리스트");
		System.out.println("*************");
		
		System.out.println("학번\t 이름\t 국어\t 영어 \t 수학 \t 총점 \t 평균");
		
		int count = score.getCount();
		ScoreVO[] list = score.findAll();
		
		for(int i=0; i<count; i++) {
			ScoreVO vo=list[i];
			System.out.print(vo.getHak() + "\t");
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMat() + "\t");
			System.out.print(vo.getTot() + "\t");
			System.out.println(vo.getAve());
			}
		System.out.println();
		
	}

	public void findByHak() {
		System.out.println("학번 검색...");
		
		String hak;
		
		System.out.println("검색할 학번 ? ");
		hak = sc.next();
		
		ScoreVO vo = score.findByID(hak);
		
		if(vo==null) {
			System.out.println("등록된 정보가 없습니다.\n");
			return;
		}
		
		System.out.print(vo.getHak() + "\t");
		System.out.print(vo.getName() + "\t");
		System.out.print(vo.getKor() + "\t");
		System.out.print(vo.getEng() + "\t");
		System.out.print(vo.getMat() + "\t");
		System.out.print(vo.getTot() + "\t");
		System.out.println(vo.getAve());
		
		System.out.println();
	}

	public void update() {
		System.out.println("데이터 수정...");

		String hak;
		
		System.out.println("수정할 학번 ? ");
		hak = sc.next();
		
		ScoreVO vo = score.findByID(hak);
		
		if(vo==null) {
			System.out.println("등록된 정보가 없습니다.\n");
			return;
		}
		
		System.out.println("이름 ? ");
		vo.setName(sc.next());
		
		System.out.println("국어 ? ");
		vo.setKor(sc.nextInt());
		
		System.out.println("영어 ? ");
		vo.setEng(sc.nextInt());
		
		System.out.println("수학 ? ");
		vo.setMat(sc.nextInt());
		
		System.out.println("수정이 완료되었습니다.\n");
	}

	public void delete() {
		System.out.println("데이터 삭제...");
		
		String hak;
		
		System.out.println("삭제할 학번 ? ");
		hak=sc.next();
		
		ScoreVO vo = score.findByID(hak);
		if(vo==null) {
			System.out.println("등록된 정보가 아닙니다.\n");
			return;
		}
		
		boolean b = score.deleteScore(vo);
		if(b) {
			System.out.println("학생 정보를 삭제했습니다.\n");
		} else {
			System.out.println("학생 정보 삭제를 실패했습니다.\n");
		}
				
	}
	
}
