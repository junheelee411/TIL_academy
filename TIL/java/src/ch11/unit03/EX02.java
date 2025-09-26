package ch11.unit03;

public class EX02 {

	public static void main(String[] args) {
		Demo2 <Integer> obj = new Demo2<>();
		Integer n = 20;
		obj.set(n);
		
		Demo2<String> obj2 = new Demo2<>();
		obj2.set("서울");
		disp(obj2);
	}
	
	/*
		젠[릭 와일드 카드
		? : 모든 클래스나 인터페이스가 가능
		제네릭 타입에 의존하지 않느 ㄴ메소드 등을 호출할 때 사용
	 */
	
	public static void disp(Demo2 <?> d) {
		d.print();
		// d.set(10); 컴파일 에러 : 자료형이 결정되지 않은 상태이므로
	}

}

class Demo2<T>{
	private T t;
	
	public void set(T t) {
		this.t=t;
	}
	
	public T get() {
		return t;
	}
	
	public void print() {
		System.out.println(t);
	}
}
