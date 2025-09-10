
package HW;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double distance,velocity;
		double time,hour,min,sec;
		
		//주행거리 입력
		System.out.println("주행 거리(km) ?");
		distance = sc.nextInt();
		//시속 입력
		System.out.println("시속(km/h) ?");
		velocity = sc.nextInt();
		
		time=(double)(distance/velocity);
		hour=(int)time;
		min=(int)(time*60%60);
		sec=(time*3600)%60;
		sec=(int)(sec*100)/100.0;
		
		
		System.out.printf("%.0f시간 %.0f분 %.2f초 소요",hour,min,sec);
		
		sc.close();

	}

}
