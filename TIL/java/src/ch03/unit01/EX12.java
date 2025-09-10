package ch03.unit01;

public class EX12 {

	public static void main(String[] args) {
		char ch;
		
		ch='A';
		//ch=ch+1; 컴파일 오류(형변환 일어나서 int가 char에 들어가게됨)
		
		ch++; //형변환 x
		System.out.println(ch);

		ch='A';
		System.out.printf("%c %c\n", ch++, ++ch);
	}

}
