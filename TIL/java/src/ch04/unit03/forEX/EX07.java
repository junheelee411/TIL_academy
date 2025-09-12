package ch04.unit03.forEX;

public class EX07 {

	public static void main(String[] args) {
		// 1~100까지 수중 3의 배수 한 줄에 5개씩 출력, 마지막에 전체 개수 출력
		
		int num, cnt=0, sum=0;
		
		for(num=3; num <=100; num+=3)
		{
			sum +=num;
			cnt++;
			System.out.print(num+ (cnt%5==0 ? "\n" : "\t"));
		}
		
		System.out.println("\n");
		System.out.println("3의 배수의 합 : " + sum);
		System.out.println("3의 배수의 평균 : " + sum/cnt);
		

	}

}
