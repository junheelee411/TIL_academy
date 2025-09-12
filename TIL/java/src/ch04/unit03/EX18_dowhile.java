package ch04.unit03;

public class EX18_dowhile {

	// do~while : 적어도 한 번은 실행
	
	public static void main(String[] args) {	
		
		int n;
		
		n=10;
		while(n<10) // 조건이 거짓 -> 한 번도 실행 x
		{
			n++;
			System.out.println("while 안 : " + n);
		}
		System.out.println("while 밖 : " + n); //10
				
		n=10;
		do // 조건을 나중에 비교 -> 적어도 한 번은 실행함
		{
			n++;
			System.out.println("while 안 : " + n); //11
		} while(n<10);
		System.out.println("while 밖 : " + n); //11

	}

}
