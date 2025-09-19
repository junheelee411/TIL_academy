package ch06.unit04;

public class EX11_singelton {

	public static void main(String[] args) {
		// Test11 t = new Test11(); 컴파일 에러.

		Test11 t1 = Test11.getInstance();
		Test11 t2 = Test11.getInstance();
		
		System.out.println(t1==t2);
		
		System.out.println(t1.add());
		System.out.println(t1.add());
		
		System.out.println(t2.add());
	}

}

// singleton 패턴 : 하나의 객체만 생성할 수 있게 만듦
class Test11{
	private static Test11 obj = null;
	
	private int a;
	
	// 생성자가 private이므로 외부에서 객체 생성 불가능
	private Test11() {
	}
	
	public static Test11 getInstance() {
		if(obj == null) {
			obj=new Test11();
		}
		return obj;
	}
	
	public int add() {
		return a++;
	}
	
	public int sub() {
		return --a;
	}
	
}