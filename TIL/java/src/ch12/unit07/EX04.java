package ch12.unit07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EX04 {

	public static void main(String[] args) {
		List<UserDTO> list = new ArrayList<UserDTO>();
		
		list.add(new UserDTO("다자바", "010-123",23));
		list.add(new UserDTO("너자바", "010-223",22));
		list.add(new UserDTO("감자바", "010-213",23));
		list.add(new UserDTO("김자바", "010-122",24));
		list.add(new UserDTO("마자바", "010-111",25));
	
		disp("Sort 전",list);
		System.out.println();
		
		// 이름 정렬
		//Comparator 인터페이스 구현 : 정렬 기준 설정
		
		Comparator<UserDTO> comp = new Comparator<UserDTO>() {
			@Override
			public int compare(UserDTO o1, UserDTO o2) {
				return o1.getName().compareTo(o2.getName());
			}
		};
		Collections.sort(list,comp);
		
		disp("이름 오름차순",list);
		
		// 나이 내림차순
		Comparator<UserDTO> comp2 = new Comparator<UserDTO>() {
			
			@Override
			public int compare(UserDTO o1, UserDTO o2) {
				return o2.getAge()-o1.getAge();
			}
		};
		Collections.sort(list,comp2);
		
		disp("이름 내림차순",list);
	}
	
	public static void disp(String title, List<UserDTO> list) {
		System.out.println(title);
		
		for(UserDTO dto : list) {
			System.out.print(dto.getName() + "\t");
			System.out.print(dto.getTel()+"\t");
			System.out.println(dto.getAge()+"\t");
		}
		System.out.println();
	}

}

class UserDTO{
	private String name;
	private String tel;
	private int age;

	public UserDTO() {
		
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

	public UserDTO(String name, String tel, int age) {
		this.name = name;
		this.tel = tel;
		this.age = age;
	}
}



