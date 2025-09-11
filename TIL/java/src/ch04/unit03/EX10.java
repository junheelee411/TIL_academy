package ch04.unit03;

public class EX10 {

	public static void main(String[] args) {
		//10! 계산
		
		int n=1,s=1;
		
		while(n<=10)
		{
			s*=n;
			n++;
		}
		
		System.out.println(s);
		
	}
}
