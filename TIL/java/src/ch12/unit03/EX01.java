package ch12.unit03;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class EX01 {

	public static void main(String[] args) {
		Vector<String> vv = new Vector<String>();
		vv.add("자바");
		vv.add("오라클");
		vv.add("서블릿");
		
		// 전체 출력
		
		// 향상된 for문
		for(String s : vv) {
			System.out.println(s + " ");
		}
		System.out.println();
		
		// Iterator
		Iterator<String> it = vv.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s + " ");
		}
		System.out.println();
		
		
		Iterator<String> it2 = vv.listIterator();
		while(it2.hasNext()) {
			String s = it2.next();
			System.out.println(s + " ");
		}
		System.out.println();
		

		Enumeration<String> e = vv.elements();
		while (e.hasMoreElements()) {
			 String s = e.nextElement();
			 System.out.println(s + " ");
		}
		System.out.println();
		
	}

}
