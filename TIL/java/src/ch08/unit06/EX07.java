package ch08.unit06;

public class EX07 {

	public static void main(String[] args) {
		DemoImp7 obj = new DemoImp7();
		System.out.println(obj.sub(5,7));

	}

}

interface Demo7{
	private int max(int m, int n) {
		return m>n ? m : n;
	}
	
	public default int sub(int x, int y) {
	int s = max(x,y);
	
	return s;
	}
}

class DemoImp7 implements Demo7{
	
}