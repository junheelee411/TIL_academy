package ch06.score;

public class Score {
	private ScoreVO[] list; // 학생 정보를 저장하기 위한 객체 배열
	private int count; // 인원수를 저장하기 위한 변수
	
	public Score() {
		//생성자 : 초기화 작업
		count=0;
		allocation(5); // 초기에 객체를 5개 저장할 수 있도록 메모리 할당
	}
	
	private void allocation(int capacity) {
		ScoreVO[] temp = new ScoreVO[capacity];
		
		if(list != null && count>0) {
			System.arraycopy(list,0,temp,0,count);
			// 원본배열 복사시작위치 복사할곳 복사시킬위치 개수
		}
		
		list=temp;
	}
	
	// 배열에 ScoreVO 객체를 저장하고 현재 인원수를 반환
	public int append(ScoreVO vo) {
		if(count>=list.length) {
			allocation(list.length+5);
		}
		list[count++]=vo;
		
		return count;
	}
	

	// 인원수를 반환
	public int getCount() {
		return count;
	}
	
	// 학생 정보를 저장한 배열을 반환
	public ScoreVO[] findAll() {
		return list;
	}
	
	// 학번을 검색하여 해당하는 vo 객체를 반환
	// 존재하지 않으면 null을 반환, 동일한 학번이 없다는 가정 하에 작성
	public ScoreVO findByID(String hak) {
		// String class의 equals() method : 문자열이 동일한 경우 true 반환
		for(int i=0; i<count;i++) {
			ScoreVO vo = list[i];
			if(vo.getHak().equals(hak)) {
				return vo;
			}
		}
		return null;
	}
	
	public boolean deleteScore(ScoreVO vo) {
		if(count==0||vo==null) {
			return false;
		}

		for(int i=0;i<count;i++) {
			if(list[i]==vo) {
				deleteScore(i);
				return true;
			}
		}
		
		return false;
	}

	public void deleteScore(int index) {
		if(index<0||index>=count) {
			return;
		}
		
		for(int i=index+1;i<=count;i++) {
			list[i-1]=list[i];
		}
		count--;
		list[count]=null;
	}
	
}
