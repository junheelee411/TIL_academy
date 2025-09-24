package Quiz_IF;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int time, over;
		double salary;
		
		System.out.println("근무 시간 ? ");
		time = sc.nextInt();
		
		if(time > 8)
		{
			over=time-8;
			salary = 10_000 * (time-8) + 1.5 * 10_000 * over;
		}
		else
		{
			salary = 10_000 * time;
		}
		
		System.out.printf("급여 : %,.0f원",salary);
		
		sc.close();

	}

}
