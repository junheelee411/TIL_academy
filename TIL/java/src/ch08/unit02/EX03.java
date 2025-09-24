package ch08.unit02;

public class EX03 {

	public static void main(String[] args) {
		Demo3 d = new Demo3("이자바", 20);
		Demo3 d2 = new Demo3("이자바", 20);
		
		System.out.println(d.getName() +  "\t" + d.getAge());
		System.out.println(d.toString());
		System.out.println(d);

		// 주소비교
		System.out.println(d==d2);
		
		//equals를 재정의하여 주소를 비교하지 않고 값을 비교
		System.out.println(d.equals(d2));
	}
}

class Demo3{
	private String name;
	private int age;
	
	public Demo3() {
	}
	
	public Demo3(String name, int age) {
		this.name = name;
		this.age= age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name+"\t" + age;
	}
	
	@Override
	public boolean equals(Object obj) {
		Demo3 t = (Demo3)obj;
		
		return name.equals(t.getName()) && age==t.getAge();
	}
}

