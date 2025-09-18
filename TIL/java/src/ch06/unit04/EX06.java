package ch06.unit04;

import java.util.Scanner;

public class EX06 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

		 Test6 t = new Test6();
		 
		 String name;
		 System.out.println("이름 ? ");
		 name = sc.next();
		 t.setName(name);
		 // t.setName(sc.next(name));
		 
		 System.out.println("나이 ? ");
		 t.setAge(sc.nextInt());
		 // int age = sc.nextInt();
		 // t.setAge(age);
		 
		 String s=t.result();
		 System.out.println(t.getName() + "님은 " + s + "입니다.");

		 sc.close();
	}

}

class Test6
{
	private String name;
	private int age;
	
	// getter/setter : shift + alt + sra
	
	public String result()
	{
		return age >=20 ? "성인" : "미성년자";
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
	
	
}