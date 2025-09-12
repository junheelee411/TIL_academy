package Quiz_while;

// 1 + 2+ 4 + 7 + ...의 20번째까지의 항

public class Quiz08 {

	public static void main(String[] args) {
		int sum=0, num=1, cnt=0;
		
		while(cnt<=20)
		{
			cnt++;
			sum+=num;
		}
		System.out.println("결과 : " + sum);

	}

}

// 전항 크키만큼 증가
