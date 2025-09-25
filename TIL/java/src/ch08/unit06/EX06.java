package ch08.unit06;

public class EX06 {

	public static void main(String[] args) {
		// 익명의 클래스로 인터페이스 구현 및 객체 생성
		// 익명의 클래스는 EX06$1.class 형식으로 생성됨
		Demo6 d = new Demo6() {
			@Override
			public void disp() {
				System.out.println("disp");
			}
		};
		
		d.disp();
		
		// 람다를 이용하여 구현
		Demo6 d2 = () -> System.out.println("disp2");
		d2.disp();
	}

}

interface Demo6{
	public void disp();
}


