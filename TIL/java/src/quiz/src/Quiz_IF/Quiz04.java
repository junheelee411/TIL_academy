package Quiz_IF;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score;
		double grade;
		
		System.out.println("점수 ? ");
		score = sc.nextInt();
		
		if(score>=95)
		{
			grade=4.5;
		}
		else if(score>=90)
		{
			grade=4.0;
		}
		else if(score>=85)
		{
			grade=3.5;
		}
		else if(score>=80)
		{
			grade=3.0;
		}
		else if(score>=75)
		{
			grade=2.5;
		}
		else if(score>=70)
		{
			grade=2.0;
		}
		else if(score>=65)
		{
			grade=1.5;
		}
		else if(score>=60)
		{
			grade=1.0;
		}
		else
		{
			grade=0.0;
		}
		
		System.out.println("점수 : " + score + "평점 : " + grade);
		
		sc.close();

	}

}