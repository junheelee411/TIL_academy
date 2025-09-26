package ch11.unit02;

public class EX06 {

	public static void main(String[] args) {
		Test6<Integer> t = new Test6<>();
		t.set(10);
		int n = t.get();
		System.out.println(n);
		
		// Test6<String> t2 = new Test6<>(); 컴파일 에러

	}

}

// 제한된 타입 파라미터
// Number를 상속 받은 클래스(Integer, Long, Double 등)만 가능

class Test6<T extends Number>{
	private T t;
	
	public void set(T t) {
		this.t = t;
	}
	public T get() {
		return t;
	}
}