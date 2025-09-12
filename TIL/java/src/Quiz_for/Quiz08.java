package Quiz_for;

import java.util.Random;

public class Quiz08 {

	public static void main(String[] args) {
		int a, b;
		
		for(a=1;a<=6;a++)
		{
			for(b=1;b<=6;b++)
				{
					if(a+b==9)
					System.out.println("[" + a + "]" + b);
				}	
		}
			

	}

}
