package ch12.unit07;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EX03 {
    public static void main(String[] args) {
        Set<TestVO> set = new TreeSet<TestVO>();

        set.add(new TestVO("다자바", 22));
        set.add(new TestVO("김자바", 25));
        set.add(new TestVO("나자바", 23));
        set.add(new TestVO("하자바", 23));
        set.add(new TestVO("마자바", 21));

        for(TestVO vo : set) {
            System.out.println(vo.getName() + "\t" + vo.getAge());
        }
        System.out.println();
    }
}

class TestVO implements Comparator<TestVO> {
    private String name;
    private int age;

    public TestVO(String name, int age) {  
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    @Override
    public String toString() {
        return name;
    }

	@Override
	public int compare(TestVO o1, TestVO o2) {
		return name.compareTo(o1.getName());
	}
}
