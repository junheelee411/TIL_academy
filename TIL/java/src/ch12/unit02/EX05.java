package ch12.unit02;

import java.util.ArrayList;
import java.util.List;

public class EX05 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("D");
		list.add("C");
		list.add("A");
		list.add("B");
		list.add("B");
		list.add("A");
		list.add("F");
		
		for(int i=0; i<list.size(); i++) {
			if(list.indexOf(list.get(i))==i) {
				System.out.println(list.get(i));
			}
			
		}

	}

}
