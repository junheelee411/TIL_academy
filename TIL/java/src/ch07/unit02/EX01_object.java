package ch07.unit02;

public class EX01_object {

	public static void main(String[] args) {
		Test t1 =new Test();
		Test t2 =new Test();
		Test t3 = t2;

		// object 클래스의 toString() :" 클래스이름@해쉬코드를" 문자열로 반환
		System.out.println(t1.toString());
		System.out.println(t1);
		//println에서는 t2를 출력하면 t2.toString()과 동일한 결과 출력
		System.out.println();
		
		System.out.println(t1==t2);
		System.out.println(t1.equals(t2));
		
		System.out.println(t2==t3);
		System.out.println(t2.equals(t3));
		
		System.out.println("해쉬코드를 10진수로 " + t1.hashCode());
		System.out.printf("해쉬코드를 16진수로: %h\n" , t1.hashCode());
	}

}

class Test {

	int a=10;
	int b=20;
	
	public void disp() {
		System.out.println(a + " , " + b);
	}

}