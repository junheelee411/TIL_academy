package ch07.unit03;

public class EX13 {

	public EX13() {
		
		// 내부적으로 StringBuilder를 이용하여 연산 - 결과값은 string으로 반환
		String s;
		s="자바"
		+", 오라클"
		+", 스프링"
		+", HTML";
		System.out.println(s);
	
		StringBuilder sb = new StringBuilder();
		sb.append("자바");
		sb.append(", 오라클");
		sb.append(", 스프링");
		sb.append(", HTML");
		System.out.println(sb);
	}

}
