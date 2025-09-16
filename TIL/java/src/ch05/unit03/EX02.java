package ch05.unit03;

public class EX02 {

	public static void main(String[] args) {
		String [] s1 = new String [] {"자바", "서블릿", "스프링"};
		String [] s2 = new String [s1.length+3];
		
		// 배열에서 객체는 초기화 하지 않으면 null로 초기화
		
		System.arraycopy(s1, 0, s2, 1, s1.length-1);
		
		System.out.println("s1 베열 : ");
		for(String s:s1)
		{
			System.out.print(s + " "); //자바 서블릿 스프링 
		}
		System.out.println();
		
		System.out.println("s2 베열 : ");
		for(String s:s2)
		{
			System.out.print(s + " "); //null 자바 서블릿 null null null 
		}
		System.out.println();

	}

}
