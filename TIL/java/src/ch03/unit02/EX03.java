package ch03.unit02;

public class EX03 {

	public static void main(String[] args) {
		int a;
		boolean b1, b2;
		
		// 단축 연산 : &&는 앞이 거짓이면 뒤쪽 연산을 하지 않는다.
		a=10;
		b1=false;
		b2 = a>20 && (b1=true); // 앞에 연산이 이미 거짓이라 뒤에 대입연산 안 함
		System.out.println(b1 + "," + b2); //false, false

		a=10;
		b1=false;
		b2 = a<20 && (b1=true);
		System.out.println(b1 + "," + b2); //true,true

		a=10;
		b1=false;
		b2 = a>20 || (b1=true);
		System.out.println(b1 + "," + b2); //true,true
	
		// 단축 연산 : ||는 앞이 참이면 뒤쪽 연산을 하지 않는다.
		a=10;
		b1=false;
		b2 = a<20 || (b1=true); // 앞에 연산이 이미 참이라 뒤에 대입연산 안 함
		System.out.println(b1 + "," + b2); //true,true
	}

}
