package ch12.score3;

import java.util.List;

public interface Score {
	public void insertScore(ScoreVO vo) throws MyDuplicationException;
	public List<ScoreVO> listScore();
	public ScoreVO findById(String hak);
	public boolean deleteScore(String hak);
	public List<ScoreVO> listScore(String name);
}
