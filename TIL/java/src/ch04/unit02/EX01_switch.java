package ch04.unit02;

import java.util.Scanner;

public class EX01_switch {

	public static void main(String[] args) {
		
		/*
		int n=2;
		switch(n)
		{
		case 3:System.out.println("A");
		case 2:System.out.println("B");
		case 1:System.out.println("C");
		}
		*/
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("쩡수 ? ");
		n = sc.nextInt();
		
		//switch : byte, short, int, char, String(switch case에서는 ==가능), (롱형 길어서 표한할일 없음)enum만 가능
		//		   boolean, long, float, double 불가
		switch(n)
		{
		case 3: System.out.println("*");
		case 2: System.out.println("*");
		case 1: System.out.println("*");
		}
		System.out.println();

		sc.close();
	}

}
