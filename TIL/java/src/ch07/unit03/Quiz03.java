package ch07.unit03;

public class Quiz03 {

	public static void main(String[] args) {
		String s;
		for(int i=1; i<=100; i++) {
			s=Integer.toString(i);
			
			s=s.replaceAll("3|6|9", "*");
			
			if(s.contains("*")) {
				s=s.replaceAll("\\d", "");
			}
			
			
			System.out.printf("%5s",s);
			
			if(i%10==0) {
				System.out.println();
			}
		}
	}

}
