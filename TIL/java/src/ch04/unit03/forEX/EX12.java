package ch04.unit03.forEX;

public class EX12 {

	public static void main(String[] args) {
		for(int n=2;n<=9;n++)
		{
			System.out.println("**" + n + "단 **");
			
			for(int m=1;m<=9;m++)
			{
				System.out.printf("%d * %d = %d\n", n,m,n*m);
			}
			System.out.println("..............\n");
		}

	}

}
