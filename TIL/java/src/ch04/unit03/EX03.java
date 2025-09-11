package ch04.unit03;

public class EX03 {

	public static void main(String[] args) {
		//1~10 사이의 짝수 출력
		int n =0;
		while(n<10)
		{
			n+=2;
			System.out.println(n + " ");
		}
		System.out.println("밖");

		//1~10 사이의 짝수 출력
		n =1;
		while(n<10)
		{
			System.out.println(n + " ");
			n+=2;
		}
		System.out.println("밖");
		
	}

}
