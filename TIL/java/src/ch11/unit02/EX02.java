package ch11.unit02;

public class EX02 {

	public static void main(String[] args) {
		Test2 t1 = new Test2();
		
		t1.set("서울");
		String s = (String)t1.get(); // 캐스팅이 필요
		System.out.println(s);
		
		//t1.set(20);
		// s=(String)t1.get(); runtime error
	}
}

class Test2{
	private Object obj;
	
	protected void set(Object obj) {
		this.obj=obj;
	}
	
	public Object get() {
		return obj;
	}
}