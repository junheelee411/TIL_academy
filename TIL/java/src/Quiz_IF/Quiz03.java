package Quiz_IF;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자 ? ");
		char ch, first_letter;
		ch = sc.next().charAt(0);
		
		first_letter = ch;
				
		if(ch>='A' && ch<='Z')
		{
			ch+=32;
		}
		else if(ch>='a' && ch<='z')
		{
			ch-=32;
		}
		
		System.out.println(first_letter + " -> " + ch);
		
		sc.close();
	}
}