package ch04.unit03;

public class EX22 {

	public static void main(String[] args) {
		// 2~9단까지 구구단 출력
		
		int dan = 2, n;
		
		while(dan<=9)
		{
			System.out.println(">>" + dan + "단 <<");
			
			n=0;
			while(n<9)
			{
				n++;
				System.out.printf("%d * %d = %d\n",dan,n,dan*n);
			}
			dan++;
			System.out.println("---------------------\n");
		}

	}

}
