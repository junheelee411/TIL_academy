package ch02.unit04;

public class EX03_DataType {

	public static void main(String[] args) {
		
		short a=350;
		short b=-350;
		System.out.printf("a=%x, b=%x\n",a,b);
		System.out.printf("a=%04x, b=%04x\n",a,b);
		System.out.printf("a=%d, b=%d\n",a,b);
		
		byte b1= (byte)129;
		byte b2= (byte)385;
		System.out.println(b1+","+b2);
		System.out.println(b1==b2); // ==: 두 값이 동일-true 반환/ 그렇지 않으면 false
		//실제로는 다르지만 같다고 나옴- 오버플로우로 인한 문제

	}

}
