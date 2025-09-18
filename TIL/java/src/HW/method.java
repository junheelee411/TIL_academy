package HW;

import java.util.Scanner;

public class method {
	
	public static void main(String[] args) {
		
		methodMaking t = new methodMaking();
		t.luckyFrog();
		
	}
}

class methodMaking
{	
	Scanner sc = new Scanner(System.in);
			
	//도형의 내각의 합
	public int interiorAngle(int n)
	{
		return n<3 ? -1 : 180*(n-2);
	}
	

	//bmi 구하기
	public double bmi(int kg, int m)
	{
		if(kg<=0 || m<=0)
		{
			System.out.println("잘못 입력하셨습니다.");
			return -1;
		}
		else
		{
			double bmi=kg/(m*m);
			return bmi;
		}
		
	}
	
	// 행원의 개구리
	public void luckyFrog()
	{
		double num=Math.random()*10+1;
		while(num>0)
		{
		System.out.print("개굴 ");
		num--;
		}
	}

	// 탕수육 게임
	public void tangsuyukGame(char c) {
		if(c == '탕')
		{
			
		}
		
		
		//끝말잇기
		
		
		//필드
		String word;
		String newWord;
		String startWord[] = {"바보", "멍청이", "말미잘"}
		
		
		//마지막 음절 반환
		public String word(String word)
		{
			String lastWord = word[-1];
			return lastWord;
		}
		
		// 시작 단어 생성
		{
			
		}
		시작 단어장 배열로 만들어두고
		랜덤 정수로 인덱스 선택해 출력
		
		
		return newWord;
		
		
		// 단어 입력
		public void 
		{
			String newWord= sc.next();
		}
		
		// 검증
		
		public int IsRight(String )
		{
			
		}
		
		
	}
	
}
