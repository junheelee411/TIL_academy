package Quiz_IF;

import java.util.Scanner;

public class Quiz07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,b,c;
		int score;
		String name, statement;
		
		System.out.println("이름 ? ");
		name = sc.next();
		
		System.out.println("세 과목 점수 ? ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		score= a+b+c;
		
		if (a>=40 && b>= 40 && c>=40 && score>=60)
		{
			statement = "합격";
		}
		else if(score>=60)
		{
			statement = "과락";
		}
		else
		{
			statement= "불합격";
		}
		
		System.out.printf("%s님은 %s 입니다.", name, statement);
		
		sc.close();

	}

}
