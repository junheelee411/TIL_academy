package ch02.unit05;


// javadoc 주석

//cmd> javadoc -use -d doc 파일명.java
//doc 폴더가 존재하지 않으면 doc 폴더를 작성하여 도움말을 html로 doc 폴더에 작성

public class NumberUtil {

	/**
	 * 짝수인지 판별하는 메소드
	 * <p> 정수를 2로 나눈 나머지가 0이면 짝수이다.<p>
	 * 
	 * @param	num 짝수인지 판별할 수 <code>int</code>
	 * @return	짝수 여부를 반환한다. <code>boolean</code>
	 */
	
	public boolean isEven(int num) {
		return num % 2 == 0;
	}
	
}
