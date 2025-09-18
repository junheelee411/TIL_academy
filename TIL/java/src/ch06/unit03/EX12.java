package ch06.unit03;

public class EX12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test12 t = new Test12();
		int n;
		
		n=t.numberLen(123);
		System.out.println("123 : " + n + " 자리 정수" );
		

		n=t.numberLen(-100);
		System.out.println("-100 : " + n + " 자리 정수" );
	}

}

class Test12
{
	// 정수를 매개변수로 넘겨 받아 정수의 길이 구하기
	
	public int numberLen(int n)
	{
		if(n<0)
		{
			n=-n;
		}
		
		return n>=10 ? 1+ numberLen(n/10) : 1;
	}
	
	// 아스키코드 정수로 출력
	
	public int ascii(char c)
	{
		return c;
	}
	
}