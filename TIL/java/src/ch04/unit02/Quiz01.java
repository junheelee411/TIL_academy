package ch04.unit02;

import java.util.Scanner;

// 점수 입력받아 학점 구하기
// 입력 받은 점수는 0~100 사이라는 가정 하에 문제 풀기
// 90이상 A, 80이상 B, 70이상 C, 60이상 D, 나머지 F
public class Quiz01 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int score;
		String grade;
		
		System.out.println("점수 ? ");
		score = sc.nextInt();
		
		switch(score/10)
		{
		case 10:
		case 9: grade="A"; break;
		case 8: grade="B"; break;
		case 7: grade="C"; break;
		case 6: grade="D"; break;
		default : grade = "F"; break; 
		}
		
		System.out.println("점수 : " + grade);
		
		sc.close();
	}

}
