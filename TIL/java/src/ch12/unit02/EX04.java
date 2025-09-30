package ch12.unit02;

import java.util.List;

public class EX04 {

	public static void main(String[] args) {
		// 불변 Collection, JDK 9 이상
		List< String> list = List.of("A","B","C");
		System.out.println(list);

		// list.add("D") 런타임 에러 unSupportedOperationException
		// list.set(0,"a");
		// list.remove(0); 
	}

}
