package ch11.unit02;

public class EX01 {

	public static void main(String[] args) {
		Object[] obj = new Object[5];
		
		// Object는 모든 클래스 참조 가능 (Up casting)
		obj[0] = new String("자바");
		obj[1] = new String("오라클");
		obj[2] = 90;
		obj[3] = 100;
		obj[4] = new String("스프링");
		
		// Arrays.sort(obj); ClassCastException Exception 발생
		
		for(Object o : obj) {
			/*
			String s = (String)o; // runtime error
			System.out.println(s.length());
			 */
			
			if(o instanceof String) {
				String s = (String)o;
				System.out.println(s + " : " + s.length());
			}else if(o instanceof Integer){
				Integer n = (Integer)o;
				System.out.println("정수 : " + n);
			}
		}
	}

}
