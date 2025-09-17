package ch06.unit03;

public class EX01 {

	public static void main(String[] args) {

		Test1 t=new Test1();
		int n=5;
		int s;
		
		s=t.sub(n);
		//1. 인수 n을 가지고 sub() 메소드 호출
		//2. sub()메소드 실행
		//3. sub()메소드 return s로 인하여 복귀
		//4. 반환값을 s 변수에 대입
		
		System.out.println("s : " + s);
		

	}

}

class Test1
{
	// 접근 제어자 리턴타입 메소드명 (매개변수 타입 매개변수) {코드}
	
	// n : 매개변수, 지역변수 -> 메소드 안에서만 사용 가능, 스택 영역에 메모리 할당
	// 지역 변수는 메소드를 호출할 때 메모리를 할당 받고, 메소드를 빠져나갈 떄 메모리에서 해제
	public int sub(int n)
	{
		int s =0; //지역변수 (스택에서 메모리 할당)
		
		s=n+5;
		for(int i=0;i<s;i++)
		{
			System.out.print("#");
		}
		System.out.println();
	
		return s;
		
		//return 아래는 코드 넣기 불가
	}
	
}
