package ch03.unit03;

public class EX04 {

	public static void main(String[] args) {
		int a,b;
		
		// 암호화
		a=13;
		b=a^5;
		System.out.println(b); //8
		
		//복호화
		b=b^5;
		System.out.println(b); //8

	}

}
