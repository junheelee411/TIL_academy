package ch07.unit03;

public class EX10 {

	public static void main(String[] args) {
		
		// 여러줄의 문자열 : """ ~ """
		String s;
	
		s="""
				SELECT hak,name,kor,eng,mat
				FROM score
				WHERE hak=?
				""";
		
		System.out.println(s);

	}

}
