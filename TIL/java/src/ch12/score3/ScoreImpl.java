package ch12.score3;

import java.util.ArrayList;
import java.util.List;

public class ScoreImpl implements Score {
	// 학생 정보를 저장하기 위한 List 구현 클래스 객체
	private List<ScoreVO> list = new ArrayList<ScoreVO>();
	
	@Override
	public void insertScore(ScoreVO vo) throws MyDuplicationException {
		if( findById(vo.getHak()) != null ) {
			throw new MyDuplicationException("학번 중복입니다.");
		}
		
		// List 객체의 마지막에 요소 추가
		list.add(vo);
	}

	@Override
	public List<ScoreVO> listScore() {
		// 전체 리스트
		return list;
	}

	@Override
	public ScoreVO findById(String hak) {
		// 학번 검색
		for(ScoreVO vo : list) {
			if(vo.getHak().equals(hak)) {
				return vo;
			}
		}
		
		return null;
	}

	@Override
	public boolean deleteScore(String hak) {
		// 삭제
		ScoreVO vo = findById(hak);
		
		return list.remove(vo);
	}

	@Override
	public List<ScoreVO> listScore(String name) {
		// 이름 검색
		List<ScoreVO> finds = new ArrayList<ScoreVO>();
		
		for(ScoreVO vo : list) {
			if( vo.getName().contains(name) ) {
				finds.add(vo);
			}
		}
		
		/*
		for(ScoreVO vo : list) {
			if( vo.getName().indexOf(name) >= 0 ) {
				finds.add(vo);
			}
		}
		*/
		
		return finds;
	}

}
