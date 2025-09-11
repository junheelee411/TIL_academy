package ch04.unit03;

public class EX06 {

	public static void main(String[] args) {
		//1~10 합
		
		/*
		int n=0, s=0;
		
		while(n<10)
		{
			n++;
			s+=n;
		}
		System.out.println("결과 " + s);
		*/
		
		/*
		int n=0, s=0;
		
		while(n++<10)
		{
			s+=n;
		}
		System.out.println("결과 : " + s);
		 */

		int n=0, s=0;
		
		while(++n<=10)
		{
			s+=n;
		}
		System.out.println("결과 : " + s);
		
	}

}
