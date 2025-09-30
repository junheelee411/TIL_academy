package ch12.unit02;

public class ScoreVO {
	private String hak;
	private String name;
	private int Kor;
	private int Eng;
	private int Mat;
	
	public String getHak() {
		return hak;
	}
	public void setHak(String hak) {
		this.hak = hak;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return Kor;
	}
	public void setKor(int kor) {
		Kor = kor;
	}
	public int getEng() {
		return Eng;
	}
	public void setEng(int eng) {
		Eng = eng;
	}
	public int getMat() {
		return Mat;
	}
	public void setMat(int mat) {
		Mat = mat;
	}
	
	public int getTot() {
		return Kor + Eng + Mat;
	}
	
	public int getAve() {
		return getTot()/3;
		
	}
	
	
}
