package ch07.unit01;

import java.util.Calendar;
import java.util.Scanner;

// import java.util.*; 패키지의 모든 클래스 임포트

public class EX01_import {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Calendar cal = Calendar.getInstance();
		System.out.printf("%tF %tT %tA\n",cal,cal,cal);

		sc.close();
	}

}
