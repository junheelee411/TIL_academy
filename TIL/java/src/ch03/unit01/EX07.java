package ch03.unit01;

public class EX07 {

	public static void main(String[] args) {
		char ch;
		
		ch='0'+'1'; //(48+49=97)
		System.out.println(ch);

		ch = 'A'+10;
		System.out.println(ch);
		
		ch ='0';
		//ch=ch+'1'; 컴파일 오류
	}

}
