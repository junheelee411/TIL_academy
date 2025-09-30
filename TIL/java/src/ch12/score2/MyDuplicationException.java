package ch12.score2;

import java.util.List;

import ch12.unit02.ScoreVO;

public interface MyDuplicationException extends Exception{
	private static final long serialVersionUID = 1L;
	
	// 생성자 만들어주심
	public ScoreException(String msg) {
		super(msg);
	}
	
}