package ch07.unit03;

public class EX12 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		System.out.println("초기 버퍼 크기 : " + sb.capacity()); //16

		sb.append("Seoul");
		sb.append("Korea");
		sb.append("우리나라");
		sb.append("대한민국");
	
		System.out.println("문자열 길이 : " + sb.length());
		System.out.println("버퍼 크기 : " + sb.capacity()); // 알아서 확장 - 버퍼크기 고려할필요 x
		
		System.out.println(sb.indexOf("Korea"));
	
		sb.insert(0, "한국");
		System.out.println(sb);
		
		//korea 뒤에 사람 추가
		
		sb.insert(sb.indexOf("Korea")+ "Korea".length(),"사람");
		

		// Korea 삭제
		sb.delete(7,12);
		System.out.println(sb);
		
		sb.delete(sb.indexOf("대한민국"),sb.indexOf("대한민국") + "대한민국".length());
		System.out.println(sb);
		
		
		//Korea 이후 문자열 삭제 
		//sb.delete(sb.indexOf("Korea"), sb.length());
		System.out.println(sb);
		
		sb.trimToSize();
		System.out.println("버퍼크기 : " + sb.capacity());
		
		//모든 문자열 삭제
		sb.delete(0,sb.length());
		System.out.println("모두 삭제 후 " + sb);
	} 

}
