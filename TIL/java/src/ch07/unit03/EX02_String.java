package ch07.unit03;

public class EX02_String {

	public static void main(String[] args) {
		// 문자열 비교
		String s1 = "Seoul";
		String s2 = new String("Seoul");
		
		//객체에서 ==는 주소 비교
		System.out.println(s1==s2); //false
		
		//주소가 아닌 문자열 비교
		//String의 equals() : object 클래스의 equals()를 재정의 (override)하여 문자열 비교
		System.out.println(s1.equals(s2));

	}

}
