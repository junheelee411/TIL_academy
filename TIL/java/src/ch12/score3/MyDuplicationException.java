package ch12.score3;

// 학번 중복 예외
public class MyDuplicationException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public MyDuplicationException(String msg) {
		super(msg);
	}
}
