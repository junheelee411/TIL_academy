package ch06.unit03;

public class EX_varargs {

	public static void main(String[] args) {
		
		Test11 obj = new Test11();
		int s;
		
		s=obj.sum(10);
		System.out.println(s);

		s=obj.sum(new int[] {1,2,3});
		System.out.println(s);

		s=obj.sum(1,2,3,4,5);
		System.out.println(s);
		
		//s=obj.total(10); 컴파일 에러
		//s=obj.total(1,2,3); 컴파일 에러
		s=obj.total(new int[] {1,2,3});
		System.out.println(s);

	}

}

// 비정형(가변) 인수
// 비정형 인수는 가장 오른쪽에 하나만 가능
// ex) System.out.printf()

class Test11
{
	public int sum(int... args) //내부적으로 배열로 처리
	{
		// int[]num = args; 가능
		int s=0;
		
		for(int n:args)
		{
			s+=n;
		}
		
		return s;
	}
	
	public int total(int[] num)
	{
		int s=0;
		
		for(int n:num)
		{
			s+=n;
		}
		
		return s;
	}
}

