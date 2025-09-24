package Quiz_while;

public class Quiz03 {

	public static void main(String[] args) {
		char ch='A';
		int cnt=0;
		
		while((int)ch <='Z')
		{
			System.out.print(ch + " ");
			
			cnt++;
			if (cnt%5==0)
				{
				System.out.println();
				}
			
			ch++;
		}

	}

}
