package ch12.unit04;

import java.util.Set;

public class EX05 {

	public static void main(String[] args) {
		// 불변 Collection : JDK 9
		Set<String> set =Set.of("a", "b", "c");
		System.out.println(set);

		set.add("d");
	}

}
