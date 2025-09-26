package ch11.unit02;

public class EX03 {

	public static void main(String[] args) {
		Test3<String> t1 = new Test3<String>();
		t1.set("서울");
		// t1.set(50); 컴파일 에러
		String s = t1.get(); // 캐스팅이 필요 없음
		System.out.println(s);
		
		Test3<Integer> t2 = new Test3<>();
		// new Test3<Integer>90에서 Integer는 생략 가능
		t2.set(100);
		int n = t2.get();
		System.out.println(n);
	}

}

// Generic(하나의 타입 파라미터) : 실행 시 타입이 결정
class Test3<T>{
	private T t;
	
	public void set(T t) {
		this.t =t;
	}
	public T get() {
		System.out.println(t.getClass());
		return t;
	}
}