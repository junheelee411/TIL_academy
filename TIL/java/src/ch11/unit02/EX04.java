package ch11.unit02;

public class EX04 {

	public static void main(String[] args) {
		Test4<String, Integer> obj = new Test4<>();
		
		obj.set("자바", 95);
		obj.disp();
	}

}

// 두 개의 타입 파라미터

class Test4<T, U>{
	private T t;
	private U u;
	
	public void set(T t, U u) {
		this.t =t;
		this.u =u;
	}
	
	public void disp() {
		System.out.println("T: " + t.getClass().getName() + ", " + t);
		System.out.println("U: " + u.getClass().getName() + ", " + u);
	}
}