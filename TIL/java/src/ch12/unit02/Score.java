package ch12.unit02;

import java.util.List;

public interface Score {
	public void insertScore(ScoreVO vo);
	public List<ScoreVO> listScore();
	public ScoreVO findById(String hak);
	public boolean deleteScore(String hak);
	public List<ScoreVO> listScore(String name);
}
