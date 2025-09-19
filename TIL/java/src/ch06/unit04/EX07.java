package ch06.unit04;

public class EX07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test7 t = new Test7();
		t.disp();
		
		Test7 t2 = new Test7("다자바");
		t2.disp();
		
		Test7 t3 = new Test7("이자바",20);
		t3.disp();

		
	}

}

class Test7{
	private String name;
	private int age;
	
	public Test7() {
		System.out.println("인자 없는 생성자");
	}
	
	public Test7(String name) {
		this (name,0); // 다른 생성자 호출, 최상단에 한 번만 가능
		System.out.println("인자 하나인 생성자");
	}
	
	public Test7(String name, int age) {
		this.name=name;
		this.age=age;
		System.out.println("인자 두개인 생성자");
	}
	
	public void disp() {
		System.out.println(name + " : " + age);
	}
}