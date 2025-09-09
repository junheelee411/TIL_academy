package academy_HW;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double distance,velocity,time,hour,min,sec;
		//주행거리 입력
		System.out.println("주행 거리(km) ?");
		distance = sc.nextInt();
		//시속 입력
		System.out.println("시속(km/h) ?");
		velocity = sc.nextInt();
		
		time=(distance/velocity);
		
		hour=(distance/velocity);
		min=(distance%velocity/60);
		sec=distance%3600;
		
		
		System.out.printf("%.0f시간 %.0f분 %.3f초 소요",hour,min,sec);
		
		sc.close();

	}

}
