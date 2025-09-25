package ch08.unit06;

public class EX05 {

	public static void main(String[] args) {
		System.out.println(Demo5.sum(100));
		
		Demo5 d = new DemoImp15();
		
		int n = d.max(10,20);
		System.out.println(n);
	}

}

interface Demo5{
	public void write(int n);
	
	// static 메소드 : jdk 8부터 가능
	public static int sum(int n) {
		int s = 0;
		
		for(int i=1;i<=n;i++) {
			s+=i;
		}
		
		return s;
		
	}
	
	// default 메소드 : jdk 8부터 가능
	// 구현 클래스에서 재정의 가능
	public default int max(int m, int n) {
		return m>n? m:n;
	}
}

class DemoImp15 implements Demo5{

	@Override
	public void write(int n) {
		System.out.println("write");
		
	}
	
}