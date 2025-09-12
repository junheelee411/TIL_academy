package ch04.unit03;

public class EX21_infiniteLoop {

	// 무한 루프
	
	public static void main(String[] args) {
		
		int n=0;
		int s=0;
		
		while(true)
		{
			n++;
			s+=n;
			if(n >=10)
			{break;}	// while문 빠져나감
		}
		
		System.out.println("결과 : " + s);

	}

}
