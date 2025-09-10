package ch03.unit01;

public class Ex08 {

	public static void main(String[] args) {
		String s;
		
		s="Korea" + 9 + 3;
		System.out.println(s); //Korea93
		
		s= 9 + 3+ "Korea" ;
		System.out.println(s); //12Korea
		
		s='A' + 3 + "Korea";
		System.out.println(s); //68Korea
		
		s='A' + "Korea" + 3  ;
		System.out.println(s); //AKorea3
	}

}
