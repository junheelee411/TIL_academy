package ch12.unit02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class ScoreUI {
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private Score ss = new ScoreImpl();
	
	public void menu() {
	    int ch;
	    while(true) {
	        try {
	            System.out.print("1.등록 2.수정 3.삭제 4.전체리스트 5.학번 6.이름검색 7.종료 => ");
	            ch = Integer.parseInt(br.readLine());

	            if(ch == 7) {
	                System.out.println("프로그램 종료");
	                return;
	            }

	            switch(ch) {
	                case 1: insert(); break;
	                case 2: update(); break;
	                case 3: delete(); break;
	                case 4: findAll(); break;
	                case 5: findByHak(); break;
	                case 6: findByName(); break;
	                default:
	                    System.out.println("잘못된 입력입니다.");
	            }
	        } catch (Exception e) {
	            System.out.println("입력 오류가 발생했습니다. 다시 시도하세요.");
	        }
	    }
	}

	private void insert() {
		System.out.println("\n[등록]");
		
		ScoreVO vo = new ScoreVO();
		
		try {
			System.out.println("학번 ? ");
			vo.setHak(br.readLine());

			System.out.println("이름 ? ");
			vo.setName(br.readLine());

			System.out.println("국어 ? ");
			vo.setKor(Integer.parseInt(br.readLine()));

			System.out.println("영어 ? ");
			vo.setEng(Integer.parseInt(br.readLine()));
			
			System.out.println("수학 ? ");
			vo.setMat(Integer.parseInt(br.readLine()));
			
			ss.insertScore(vo);
			System.out.println("등록 완료 \n");
			
		} catch (NumberFormatException e) {
			System.out.println("점수는 숫자만 입력 가능합니다. \n");
		} catch (Exception e) {
				e.printStackTrace();
				}
	}
	private void update() {
		System.out.println("\n[수정]");
		
		String hak;
		
		try {
			System.out.println("수정할 학번");
			hak=br.readLine();
			
			ScoreVO vo = ss.findById(hak);
			if(vo==null) {
				System.out.println("등록된 학번이 아닙니다.\n");
				return;
			}
			
			System.out.println("이름 ? ");
			vo.setName(br.readLine());

			System.out.println("국어 ? ");
			vo.setKor(Integer.parseInt(br.readLine()));

			System.out.println("영어 ? ");
			vo.setEng(Integer.parseInt(br.readLine()));
			
			System.out.println("수학 ? ");
			vo.setMat(Integer.parseInt(br.readLine()));
			
			System.out.println("수정 완료 \n");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println();
	}
	private void delete() {
		System.out.println("\n[삭제]");
		
		String hak;
		
		try {
			System.out.println("삭제할 학번");
			hak=br.readLine();
			
			ScoreVO vo = ss.findById(hak);
			if(vo==null) {
				System.out.println("등록된 학번이 아닙니다.\n");
				return;
			}
		} catch (Exception e) {
			
		}
	}
	private void findAll() {
		System.out.println("\n[전체리스트]");
		
		List<ScoreVO> list = ss.listScore();
		System.out.println("등록 인원 : " + list.size());
		
		for(ScoreVO vo : list) {
			System.out.print(vo.getHak() + "\t");
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMat() + "\t");
			System.out.print(vo.getTot() + "\t");
			System.out.print(vo.getAve() + "\t");
		}
		System.out.println();
	}
	private void findByHak() {
		System.out.println("\n[학번 검색]");
		
		String hak;
		
		try {
			System.out.println("검색할 학번 ? ");
			hak = br.readLine();
			
			ScoreVO vo = ss.findById(hak);
			
			if(vo==null) {
				System.out.println("등록된 학번이 아닙니다.");
				return;
			}
			
			System.out.print(vo.getHak() + "\t");
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMat() + "\t");
			System.out.print(vo.getTot() + "\t");
			System.out.print(vo.getAve() + "\t");			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println();
	}
	private void findByName() {
		System.out.println("\n[이름 검색]");
		
		String name;
		
		try {
			System.out.println("검색할 이름 ? ");
			name = br.readLine();
			
			List<ScoreVO> list = ss.listScore(name);
			
			if(list.size()==0) {
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
	}
	
}
