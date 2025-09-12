package ch04.unit03;

public class EX19 {

	public static void main(String[] args) {
		int s,n;
		
		n=s=0;
		
		do
		{
			n++;
			s += n;
		}while(n<10);
		System.out.println("결과 : " + s);

	}

}
