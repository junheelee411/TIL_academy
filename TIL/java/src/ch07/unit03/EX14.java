package ch07.unit03;


public class EX14 {

	public static void main(String[] args) {
		
		
	Test14 t = new Test14();
	
	t.stringTime();
	t.stringBuffertime();
	t.stringBuildertime();

	}

}

class Test14{
	public void stringTime() {
		System.out.println("String...");
		
		Long start = System.currentTimeMillis();
		String s="a";
		for(int i=0; i<100000; i++) {
			s+="a";
		}
		Long end = System.currentTimeMillis();
		
		System.out.println("문자열 길이 : " +  s.length() + " 처리시간 : " + (end-start) + "ms" );
	}
	
	public void stringBuffertime() {
		System.out.println("StringBuffer...");
		
		Long start = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("a");
		for(int i=0; i<100000; i++) {
			sb.append("a");
		}
		Long end = System.currentTimeMillis();
		
		System.out.println("문자열 길이 : " +  sb.length() + " 처리시간 : " + (end-start) + "ms" );
	}
	public void stringBuildertime() {
		System.out.println("StringBuilder...");
		
		Long start = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder("a");
		for(int i=0; i<100000; i++) {
			sb.append("a");
		}
		Long end = System.currentTimeMillis();
		
		System.out.println("문자열 길이 : " +  sb.length() + " 처리시간 : " + (end-start) + "ms" );
	}
}
