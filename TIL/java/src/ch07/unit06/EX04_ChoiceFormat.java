package ch07.unit06;

import java.text.ChoiceFormat;

public class EX04_ChoiceFormat {

	public static void main(String[] args) {
		//ChoiceFormat : 특정 값의 범위를 문자열로 변환
		
		double[] limits = {60,70,80,90}; // 작은 수에서 큰 수 순으로
		String[] grades = {"D","C","B","A"};
		ChoiceFormat cf = new ChoiceFormat(limits,grades);
		
		System.out.println("95: " + cf.format(95));
		System.out.println("85: " + cf.format(85));
		System.out.println("55: " + cf.format(55));

		limits = new double[]{0,60,65,70,75,80,85,90,95}; // 이하 중 가장 가까운 수
		grades = new String[]{"F","D","D+","C", "C+","B","B+","A","A+"};
		ChoiceFormat cf2 = new ChoiceFormat(limits,grades);
		System.out.println("100 : " + cf2.format(100));
		System.out.println("80 : " + cf2.format(80));
		System.out.println("75 : " + cf2.format(75));
		System.out.println("55 : " + cf2.format(55));
		
		limits = new double[]{0,60,65,70,75,80,85,90,95}; // 이하 중 가장 가까운 수
		grades = new String[]{"0.0","1.0","1.5","2.0", "2.5","3.0","3.5","4.0","4.5"};
		ChoiceFormat cf3 = new ChoiceFormat(limits,grades);
		System.out.println("100 : " + cf3.format(100));
		System.out.println("80 : " + cf3.format(80));
		System.out.println("75 : " + cf3.format(75));
		System.out.println("55 : " + cf3.format(55));}

}
