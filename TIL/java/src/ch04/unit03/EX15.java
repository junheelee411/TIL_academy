package ch04.unit03;

public class EX15 {

	public static void main(String[] args) {
		// 홀수를 한 줄에 5개씩 출력하고 마지막에 합 출력
		
		int n, s, cnt;
		
		n=1;
		s=0;
		cnt=0;
		
		while(n<=100)
		{
			s+=n;
			
			System.out.print(n + "\t");
			
			if(++cnt % 5==0)
			{
				System.out.println();
			}
			
			n+=2;
		}
		System.out.println("\n홀수 합 : " + s);

	}

}
