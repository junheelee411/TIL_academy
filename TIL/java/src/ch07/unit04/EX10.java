package ch07.unit04;

public class EX10 {

	public static void main(String[] args) {
		DateUtil util = new DateUtil();
		
		int age = util.toAge("2001-12-05");
		System.out.println(age);
		
		String s = util.toGender("051010-311111");
		System.out.println(s);
		
		int a = util.toAgeID("011102-3131311");
		System.out.println(a);
	}

}
