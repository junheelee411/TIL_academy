package ch11.unit02;

public class EX07 {

	public static void main(String[] args) {
		Test7 t = new Test7();
		
		t.print("서울");
		t.print(100);

		t.print(1200);
		// t.disp("자바); compile error
	}
}

class Test7{
	
	public <U> void print(U u) {
		System.out.println(u.getClass().getName() + " : " + u);
	}
	
	public <U extends Number> void disp(U u) {
		System.out.println(u.getClass().getCanonicalName() + " : " + u);
	}
}