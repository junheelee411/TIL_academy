package ch04.unit03;

public class EX13 {

	public static void main(String[] args) {
		// 1+ (1+2) + ... + (1+2+...+10)
		
		int n=0, s=0, t=0;
		
		while(n<10)
		{
			n++;
			s+=n;
			t+=s;
			
		}

		System.out.println(t);
	}

}
