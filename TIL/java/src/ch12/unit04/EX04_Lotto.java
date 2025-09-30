package ch12.unit04;

import java.security.SecureRandom;
import java.util.TreeSet;

//1~45까지의 난수 6개(중복x)

public class EX04_Lotto {

	public static void main(String[] args) {
		
		SecureRandom rnd = new SecureRandom();
		
		TreeSet<Integer> num = new TreeSet<Integer>();
		
		while(num.size()<6) {
		num.add(rnd.nextInt(45)+1);
		}
		
		for(int i : num) {
			System.out.println(i + " ");
		}
		System.out.println();

		
	}

}


