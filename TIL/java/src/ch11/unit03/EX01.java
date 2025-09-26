package ch11.unit03;

public class EX01 {

	public static void main(String[] args) {
		Demo1<Integer> obj = new Demo1<>();
		// Demo1<Number> obj2 = new pbj; 컴파일 에러 / 제네릭은 상속 관계가 아님 -> 업캐스팅 불가
		obj.set(100);
		System.out.println(obj.get());
		
		// Integer <Number < Object
		Demo1<Number> obj2 = new Demo1<>();
		Integer i = 10;
		obj2.set(i); // 타입 매개변수의 상속 관계는 성립
		
		// Integer i2 = obj2.get(); Number이므로 컴파일 에러
		Integer i2 = (Integer) obj2.get();
		System.out.println(i2);
	}

}

class Demo1<T>{
	private T t;
	
	public void set(T t) {
		this.t=t;
	}
	

	public T get() {
		return t;
	}
	
}