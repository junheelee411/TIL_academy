package ch04.unit03.forEX;

public class EX09 {

	public static void main(String[] args) {
		int s=0, n=0;
		
		for(;;) // 무한루프
		{
			n++;
			s+=n;
			if(n>=10)
				break;
		}
		System.out.println(s);

	}

}
