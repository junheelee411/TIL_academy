package ch05.unit02;

import java.util.Scanner;

/*
 80 :1+1+1 = 3등
		80(+1):90, 80:80, 80:70(+1), 80(+1):95, 80:65(+1)
 90 :1+1 = 2등
 		90:80(+1), 90:70(+1), 90(+1):95, 90:65(+1) 
 80 :1+1+1 = 3등
 		80:70(+1), 80(+1):95, 80:65(+1)
 70 :1+1+1+1+1 = 5등
 		70(+1):95, 70:65(+1)
 95 :1 = 1등
 		95:65(+1)
 65 :1+1+1+1+1+1 = 6등
 
 1로 초기화 -> 0등은 없음
 
 */


public class EX06_Score {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] name; //[인원수]
		int [][] score; //[인원수][과목수]
		int [] tot;
		int [] rank;
		int count;
		
		String[] subject = new String[] {"국어","영어","수학"};
		
		do
		{
			System.out.println("인원수 ? ");
			count = sc.nextInt();
		} while(count<1);
		
		//배열 메모리 할당
		
		name = new String[count];
		score= new int[count] [3];
		tot = new int [count];
		rank = new int [count];
		
		// 인원수만큼 이름, 국, 영, 수 점수를 입력 받아 총점을 계산
		
		for(int i=0; i<count; i++)
		{
			System.out.println((i+1) + " 번째 이름 ? ");
			name[i] = sc.next();
			
			//세 과목 점수 입력
			
			for(int j=0;j<3; j++)
			{
				System.out.println(subject[j] + " ? ");
				score[i][j] = sc.nextInt();
				
				tot[i] += score[i][j];
			}
		}
		
		
		// 석차를 1로 초기화
		
		
		for(int i=0;i<count;i++)
		{
			rank[i] =1;
		}
		
		//석차 계산 (selection sort)
		for(int k=count; k<count-1;k++) //count-1회 회전
		{
			for(int l=k+1; l<count; l++)
			{	if (tot[k]>tot[l])
					rank[k]++;
				else if(tot[l] < tot[k])
				{
					rank[l]++;
				}
			}
		}
		
		
		
		//출력
		
		System.out.println("이름\t극어\t영어\t수학\t총점\t평균\t석차");
		for(int i=0;i<count;i++)
		{
			System.out.print(name[i] + "\t");
			for(int j=0;j<score[i].length; j++)
			{
				System.out.print(score[i][j] + "\t");
			}
			System.out.print(tot[i] + "\t");
			System.out.print((tot[i]/3) + "\t");
			System.out.println(rank[i]);
		}
		
		sc.close();

	}
}
