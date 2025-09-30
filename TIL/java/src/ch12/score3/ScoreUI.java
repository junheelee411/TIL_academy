package ch12.score3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import ch12.unit06.Comparable;

public class ScoreUI {
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private Score ss = new ScoreImpl();
	
	public void menu() {
		int ch;
		
		while(true) {
			try {
				System.out.print("1.등록 2.수정 3.삭제 4.리스트 5.총점내림차 6.이름오름차 7.학번검색 9.이름검색 9.종료 => ");
				ch = Integer.parseInt(br.readLine());
				
				if(ch == 9) {
					System.out.println("프로그램 종료");
					return;
				}
				
				switch(ch) {
				case 1: insert(); break;
				case 2: update(); break;
				case 3: delete(); break;
				case 4: list(); break;
				case 5: totalDesc(); break;
				case 6: nameAsc(); break;
				case 7: findByHak(); break;
				case 8: findByName(); break;
				}
				
			} catch (Exception e) {
			}
		}
		
	}
	
	protected void insert() {
		System.out.println("\n[등록]");
		
		ScoreVO vo = new ScoreVO();
		
		try {
			System.out.print("학번 ? ");
			vo.setHak(br.readLine());
			
			System.out.print("이름 ? ");
			vo.setName(br.readLine());
			
			System.out.print("국어 ? ");
			vo.setKor(Integer.parseInt(br.readLine()));
			
			System.out.print("영어 ? ");
			vo.setEng(Integer.parseInt(br.readLine()));
			
			System.out.print("수학 ? ");
			vo.setMat(Integer.parseInt(br.readLine()));
			
			ss.insertScore(vo);

			System.out.println("등록 완료 !!!");
			
		} catch (NumberFormatException e) {
			System.out.println("점수는 숫자만 입력 가능합니다.");
		} catch (MyDuplicationException e) {
			System.out.println("등록된 학번입니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println();
	}
	
	protected void update() {
		System.out.println("\n[수정]");
		
		String hak, name;
		int kor, eng, mat;
		
		try {
			System.out.print("수정할 학번 ? ");
			hak = br.readLine();
			
			ScoreVO vo = ss.findById(hak);
			if(vo == null) {
				System.out.println("등록된 학번이 아닙니다.\n");
				return;
			}
			
			System.out.print("이름 ? ");
			name = br.readLine();
			
			System.out.print("국어 ? ");
			kor = Integer.parseInt(br.readLine());
			
			System.out.print("영어 ? ");
			eng = Integer.parseInt(br.readLine());
			
			System.out.print("수학 ? ");
			mat = Integer.parseInt(br.readLine());
			
			vo.setName(name);
			vo.setKor(kor);
			vo.setEng(eng);
			vo.setMat(mat);
			
			System.out.println("수정 완료 !!!");
			
		} catch (NumberFormatException e) {
			System.out.println("점수는 숫자만 가능합니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println();
	}

	protected void delete() {
		System.out.println("\n[삭제]");
		
		String hak;
		
		try {
			
			System.out.print("삭제할 학번 ? ");
			hak = br.readLine();
			
			if(ss.deleteScore(hak)) {
				System.out.println("삭제 완료 !!!");
			} else {
				System.out.println("등록된 학번이 아닙니다.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println();
		
	}
	
	protected void list() {
		System.out.println("\n[전체리스트]");
		
		List<ScoreVO> list = ss.listScore();
		
		Comparator<ScoreVO> comp = new Comparator<ScoreVO>() {
			@Override
			public int compare(ScoreVO o1, ScoreVO o2) {
			return (o1.getName().compareTo(o2.getName()));
			}
		};
		Collections.sort(list,comp);
		
		System.out.println("등록 인원 : " + list.size());
		
		for(ScoreVO vo : list) {
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
	
	protected void findByHak() {
		System.out.println("\n[학번검색]");
		
		String hak;
		
		try {
			System.out.print("검색할 학번 ? ");
			hak = br.readLine();
			
			ScoreVO vo = ss.findById(hak);
			
			if(vo == null) {
				System.out.println("등록된 학번이 아닙니다.\n");
				return;
			}
			
			System.out.print(vo.getHak() + "\t");
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMat() + "\t");
			System.out.print(vo.getTot() + "\t");
			System.out.println(vo.getAve());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println();
		
	}
	
	protected void findByName() {
		System.out.println("\n[이름검색]");
		
		String name;
		
		try {
			System.out.print("검색할 이름 ? ");
			name = br.readLine();
			
			List<ScoreVO> list = ss.listScore(name);
			
			if(list.size() == 0) {
				System.out.println("등록된 자료가 없습니다.\n");
				return;
			}
			
			for(ScoreVO vo : list) {
				System.out.print(vo.getHak() + "\t");
				System.out.print(vo.getName() + "\t");
				System.out.print(vo.getKor() + "\t");
				System.out.print(vo.getEng() + "\t");
				System.out.print(vo.getMat() + "\t");
				System.out.print(vo.getTot() + "\t");
				System.out.println(vo.getAve());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println();
	}
	
	protected void totalDesc() {
		System.out.println("\n[총점 내림차순]");
		
		List<ScoreVO> list = ss.listScore();
		
		// 총점 내림차순 정렬하고 총점이 동일하면 국어점수 내림차순 정렬
		
		Comparator<ScoreVO> comp = new Comparator<ScoreVO>() {
			@Override
			public int compare(ScoreVO o1, ScoreVO o2) {
				if(o1.getTot()==o2.getTot()) {
					return -(o1.getKor()- o2.getKor());
				} else {
				return - (o1.getTot()-o2.getTot());}
			}
							};
		Collections.sort(list,comp);		
		
		
		for(ScoreVO vo : list) {
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


		
	protected void nameAsc() {
		System.out.println("\n[이름 오름차]");
		
		List<ScoreVO> list = ss.listScore();
		
		Comparator<ScoreVO> comp = new Comparator<ScoreVO>() {
			@Override
			public int compare(ScoreVO o1, ScoreVO o2) {
			return (o1.getName().compareTo(o2.getName()));
			}
		};
		Collections.sort(list,comp);	
		
		for(ScoreVO vo : list) {
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
	
}
