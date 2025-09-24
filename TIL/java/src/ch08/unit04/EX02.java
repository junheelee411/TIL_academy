package ch08.unit04;

public class EX02 {

	public static void main(String[] args) {
		Test2 t1  = Test2.getInstance();
		Test2 t2  = Test2.getInstance();

		System.out.println(t1==t2);
	}

}

// singleton pattern

class Test2{
	private Test2() {
	}
	
	// 중첩 클래스
	private static class Holder{
		public static final Test2 INSTANCE = new Test2();
	}
	
	public static Test2 getInstance() {
		return Holder.INSTANCE;
	}
}