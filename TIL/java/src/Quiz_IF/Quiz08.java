package Quiz_IF;

import java.util.Scanner;

public class Quiz08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String id, name;
		int mid_score, fin_score, abscent, report_score; 
		int attendance_score,full_score;
		char grade;
		
		//입력
		System.out.println("학번 ? ");
		id = sc.next();
		
		System.out.println("이름 ? ");
		name = sc.next();
		
		System.out.println("중간고사 점수 ? ");
		mid_score = sc.nextInt();
		
		System.out.println("기말고사 점수 ? ");
		fin_score = sc.nextInt();
		
		System.out.println("결석 횟수 ? ");
		abscent = sc.nextInt();
		
		System.out.println("레포트 점수 ? ");
		report_score = sc.nextInt();
		
		//출석 점수 
		if(abscent<=1)
		{
			attendance_score=100;
		}
		else if (abscent<=3)
		{
			attendance_score=80;
		}
		else if (abscent<=5)
		{
			attendance_score=60;
		}
		else
		{
			attendance_score=0;
		}
		
		//전체 점수
		full_score = (int)(0.4 * mid_score + 0.4 * fin_score + 0.1 * attendance_score + 0.1 * report_score);
		
		//학점
		
		if(full_score>=90)
		{
			grade='A';
		}
		else if(full_score>=80)
		{
			grade='B';
		}
		else if(full_score>=70)
		{
			grade='C';
		}	
		else if(full_score>=60)
		{
			grade='D';
		}
		else
		{
			grade='F';
		}
		
		System.out.printf("학번\t이름\t중간고사\t기말고사\t출석점수\t레포트\t힙신잠수\t학점 \n");
		System.out.printf("%s \t %s \t",id,name);
		System.out.printf("%d \t %d \t", mid_score, fin_score);
		System.out.printf("%d \t %d \t", attendance_score, report_score);
		System.out.printf("%d \t %c \t", full_score, grade);
		
		sc.close();

	}

}
