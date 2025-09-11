package ch04.unit03;

// 3 또는 5의 배수를 제외하고 한 줄에 5개씩 출력

public class EX16 {

	public static void main(String[] args) {
		//1~100 찍어 3,5의배수 빼, 5개씩 출력
		
		int n, cnt;
		
		n=cnt=0;
		
		while(n<100)
			{
				n++;
				if(n%3!=0 && n%5!=0)
				{
					System.out.printf("%4d", n);
					if(++cnt % 5==0)
					{
						System.out.println();
					}
				}
			}

	}

}
