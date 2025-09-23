package ch07.unit05;

import java.util.Random;

public class Quiz01 {

	public static void main(String[] args) {
		String s;
		
		s=toNumber3();
		System.out.println(s);
	}
	
	public static String toNumber3() {
		// 서로 다른 3자리 난수(123~987)
		Random rnd = new Random();
		int a,b,c;
		
		a= rnd.nextInt(9)+1; // 0~9
		
		do {
			b= rnd.nextInt(9)+1;
		}while(a==b);
		
		do {
			c= rnd.nextInt(9)+1;
		}while(b==c);
		
		/*
			StringBuilder sb = new StringBuilder();
			String s;
			
			while(sb.length()<3){
			s=Integer.toString(rnd.nextInt(9)+1);
			if(sb.indexOf(s) != -1)
			{continue;}
			sb.append(s);
			}
		 */
		
		
		
		return ""+a+b+c;
	}

}
