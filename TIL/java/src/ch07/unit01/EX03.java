package ch07.unit01;

// 정적인 멤버를 클래스 이름을 명시하지 않고 접근가능
import static java.lang.Math.*;

import java.util.Scanner;

public class EX03 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a;
		double s;
		
		System.out.println("각도 ? ");
		a = sc.nextInt();
		
		// 각도 입력 받아 코사인값 계산
		// 라디안 : 각도/180*3.14
		//s= Math.cos(Math.PI*a/180.0);
		s= cos(PI*a/180.0);
		System.out.println("각도에 대한 cos 값: " + s);
		
		sc.close();

	}

}