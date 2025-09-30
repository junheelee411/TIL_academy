package ch12.unit06;
import java.util.ArrayList;
import java.util.List;

public class Comparable {

	public static void main(String[] args) {
		List<UserVO> list = new ArrayList<UserVO>();
		
		list.add(new UserVO("이자바","010-011",25));
		list.add(new UserVO("너자바","010-102",25));
		list.add(new UserVO("다자바","010-112",25));
		list.add(new UserVO("홍자바","010-321",25));
		list.add(new UserVO("김자버","010-521",25));
		
		disp("Sort 전", list);
		
		// Collections.sort(list); 정렬 기준 설정이 안 되어있음
		
		
		disp("Sort 후", list);
	}

	public static void disp(String title, List<UserVO> list) {
		System.out.println(title);
		
		for(UserVO vo : list) {
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getTel() + "\t");
			System.out.print(vo.getAge());
		}
	}
}

class UserVO implements Comparable<UserVO>{
	private String name;
	private String tel;
	private int age;
	
	public UserVO() {
	}
	
	public UserVO(String name, String tel, int age) {
		this.name = name;
		this.tel = tel;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
