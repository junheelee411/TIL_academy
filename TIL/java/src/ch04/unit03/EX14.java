package ch04.unit03;

public class EX14 {

	public static void main(String[] args) {
		// 1/2 + 2/3 + ... 9/10
		
		int a=0;
		double sum=0;
		
		while(a<9)
			{
				a++;
				sum += a/(a+1.0);
		
			}

		System.out.println(sum);
	}

}
