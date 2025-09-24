package ch08.unit02;

public class EX02 {

	public static void main(String[] args) {
		Demo2 d = new Demo2();
		d.setName("다자바");
		d.setAge(19);

		System.out.println(d.getName() + "," + d.getAge());
		System.out.println(d.toString()); // 클래스명@해쉬코드
		System.out.println(d); // 출력할 때만 : 클래스명@해쉬코드
	}

}

class Demo2{
	private String name;
	private int age;
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
	
}