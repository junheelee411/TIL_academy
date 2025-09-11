package ch04.unit03;

public class EX02 {

	public static void main(String[] args) {
		int n=10;
		
		//처음 조건식이 거짓이면 while 안은 한 번도 실행하지 않음

		while(n<10)
		{
			n++;
			System.out.println("안 : " + n);
		}
		System.out.println("밖 : " + n);

	}

}
