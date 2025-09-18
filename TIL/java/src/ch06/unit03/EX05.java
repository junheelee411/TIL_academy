package ch06.unit03;

public class EX05 {

	public static void main(String[] args) {
		
		Test5 t = new Test5();
		int [] num = new int[] {1,3,5};
		int a=5;
		
		// 파라미터 인수 전달 방법
		t.sub1(a);
		System.out.println("sub1() 호출 후 a : " + a);
		
		t.sub2(t);
		System.out.println("sub2() 호출 후 x : " + t.x);

		t.sub3(num);
		System.out.println("sub3() 호출 후 num[1] : " + num[1]);
	}

}

class Test5
{
	int x=10;
	
	// call by value (값 보냄)
	public void sub1(int a) 
	{
		a+=10; // 부를때만 메모리 잡고 나가면 죽음요
	}
	
	// call by reference (주소 보냄 -> 값 변경 -> 메인도 값 변경)
	public void sub2(Test5 t)
	{
		t.x=100;
	}
	
	// call by reference (주소 보냄 -> 값 변경 -> 메인도 값 변경) (배열도 주소)
	public void sub3(int[] a)
	{
		a[1] +=50;
	}
}
