package ch04.unit03.forEX;

public class EX10 {

	public static void main(String[] args) {
		// 다중 for문
		
		for(int i=1; i<=3;i++)
		{
			System.out.println("i : " + i);
			
			for(int j=1; j<=i;j++)
			{
				System.out.println("i: " + i + ", j: " + j);
			}
			System.out.println("---------------------------");
		}

	}

}
