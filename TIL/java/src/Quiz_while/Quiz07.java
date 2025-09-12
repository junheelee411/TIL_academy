package Quiz_while;

//x 100부터 시작 1초마다 2씩 증가, y 0부터 시작 1초마다 5씩증가
// y==x일 때 시간과 x,y의 값

public class Quiz07 {

	public static void main(String[] args) {
		
		//변수 선언 및 초기화
		int x=100, y=0;
		int sec=0;
		
		while(x>y)
		{
			sec++;
			
			x+=2;
			y+=5;
		}
		
		System.out.println("x : " + x + ", y : " + y);
		System.out.println("걸린 시간 : " + sec + "초");
		

	}

}
