package ch04.unit03.forEX;

public class EX06 {

	public static void main(String[] args) {
		int n,s;
		
		//for문 뒤에 세미콜론 찍으면 x
		
		/*
		s=0;
		for(n=1; n<=10;n++)
		{
			s+=n;
		}
		System.out.println(n + " , " + s);
		*/
		
		s=0;
		for(n=2; n<=10;n+=2)
		{
			s+=n;
		}
		System.out.println("짝수 합 : " + s);
	
		s=0;
		for(n=1; n<=10;n+=2)
		{
			s+=n;
		}
		System.out.println("짝수 합 : " + s);

	}
}