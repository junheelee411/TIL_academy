package ch12.unit02;

import java.util.Stack;

/*
 	Stack
 	- LIFO
 	- Vector 하위클래스
 	- 주요 메소드
 	push : stack에 data 추가
 	pop() : top 요소 반환 후 삭제
 	peek() : top 요소 반환 후 삭제 x
 	Stack은 Vector 하위 클래스이지만 Vector 메소드 사용은 권장하지않음
 */
public class EX07 {

	public static void main(String[] args) {
		Stack<String> st = new Stack<String>();
		
		st.push("자바");
		st.push("오라클");
		st.push("HTML");
		st.push("서블릿");
		st.push("스프링");
		
		while(! st.empty()) {
			String s = st.pop();
			System.out.println(s + " ");
		}
		System.out.println();

	}

}
