package ch04.unit03.forEX;

public class EX02 {

	public static void main(String[] args) {
		int a;
		for(a=1; a<=10; a++)
		{
			System.out.println(a + " ");
			if(a%3==0)
			{
				a+=5; // 반복 횟수에 사용되는 변수 값 변경 -> 반복 횟수 변함
			}
		}
		System.out.println("\n밖 : " + a); 

	}

}
