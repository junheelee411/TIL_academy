package ch06.unit04;

public class EX10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Test10{
	public static int a=10;
	public final static double PI =3.141592; //파이널 변수는 일반적으로 대문자로
			public final static int x;
			
			static{ // static 블럭에서 final static 변수 초기화,
			
				x=10;
			}
	
			// final 인스턴스 변수 : 선얼할 때 초기화하거나 생성자에서 초기화
			// final 인스턴스 변수가 생성될 때 한 번만 초기화 가능
			final int b =10;
			final int c;
			
			public Test10() {
				// x=10; 생성자는 여러번 호출될 수 있기 때문에 final static 변수 초기화 불가  
			
				c=100;
			}
			
			public void sub() {
				// c=100; 일반 메소드에서는 final 인스턴스 변수 초기화 불가
			}
			
			public int sum(final int n) { //final 매개변수
				// n=100; 에러. final 변수는 변경 불가
				
				int s=0;
				for(int i=1;i<=n;i++) {
					s+=i;
				}
				return s;
			}
}