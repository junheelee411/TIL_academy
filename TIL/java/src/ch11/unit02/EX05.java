package ch11.unit02;

public class EX05 {

	public static void main(String[] args) {
		TestImp15<Integer> t = new TestImp15<>();
		t.print(100);
		
		DemoImp15 d = new DemoImp15();
		d.print("자바");
	}

}

// 제네릭 인터페이스 
interface Test5<T>{
	public void print(T t);
}

// 구현1
class TestImp15<T> implements Test5<T> {
	@Override
	public void print(T t) {
		System.out.println(t);
	}
	
}

// 구현2
class DemoImp15 implements Test5<String>{
	@Override
	public void print(String t) {
		System.out.println(t);
	}
	
}