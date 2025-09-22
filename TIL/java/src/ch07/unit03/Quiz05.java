package ch07.unit03;

public class Quiz05 {

	public static void main(String[] args) {
		
		String s = generatePwd();
		System.out.println(s);
		
		s= nameMasking("홍길동");
		System.out.println("s");
		System.out.println(nameMasking("자바"));
		System.out.println(nameMasking("김하하하"));
	

	}
	//임시패스워드
	public static String generatePwd() {
		StringBuilder sb = new StringBuilder();
		
		//영어 소문자. 대문자, 숫자, 특수문자를 조합하여 10자리 임시 패스워드 만들기
		//(int)(Math.random()*10) -> 0~9 사이의 변수
		String s ="abcedfghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ~!@#$%^&*+-";
		int n;
		
		for (int i=0; i<10; i++) {
			n=(int)(Math.random()*s.length());
			sb.append(s.charAt(n));
		}
		
		return sb.toString();
		
	}
	//이름 중간에 *
	public static String nameMasking(String name) {
		name = name.replaceAll("\\s", "");
		if (name.length()<2) {
			return name;
		}
		
		String first,mid,last,s;
		
		first=name.substring(0,1);
		s="";
		
		if (name.length()>2)
		{
			mid=name.substring(1,name.length()-1);
			for(int i=0;i<mid.length();i++) {
				s+="*";
			}
			last = name.substring(name.length()-1, name.length());
		}else {
			last="*";
		}
		return first + s + last;
		
		
	
	}

}
