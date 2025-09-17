package ch06.unit02;

public class EX06 {

	public static void main(String[] args) {
		
		// 객체 배열 : Test6 객체를 5개 저장할 수 있는 배열
		Test6[] tt = new Test6[5]; // run time error (객체 생성 안 됨)
		// Test6 t1 = null, t2 = null, t3 = null, t4 = null, t5 = null;와 유사
		
		// 클래스의 객체가 메모리 할당을 받을 수 있는 유일한 방법은 new 생성자() 호출
		
		// tt[0].a =10;
		// tt[0].disp(); // 런타임 에러. 객체가 메모리 할당을 받지 않음

		// 5개의 객체 생성
		for (int i=0;i<tt.length; i++)
		{
			tt[i] = new Test6();
		}
		
		tt[0].a =10;
		tt[0].disp();	
	}

}

class Test6
{
	int a;
	int b;
	
	public void disp() {
		System.out.println(a + " , " + b);
		
	}
}