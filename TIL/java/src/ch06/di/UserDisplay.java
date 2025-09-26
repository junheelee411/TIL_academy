package ch06.di;

public class UserDisplay {
	private User user;
	
	// 인자가 있는 생성자만 존재
	public UserDisplay(User user) {
		this.user = user;
		
		// 생존자를 이용환 의존성 주입 : 프로그램 실행 중 변경이 불가능하므로 안전
		user = new UserImpl();
		}
	
	public void printAll() {
		UserVO[] list = user.getList();
		
		System.out.println("이름\t나이\t결과");
		System.out.println("---------------------");
		for(int i=0; i<user.getCount();i++) {
			UserVO vo = list[i];
			System.out.println(vo.getName()+"\t");
			System.out.println(vo.getAge()+"\t");
			System.out.println(vo.getAdult());
		}
		System.out.println();

	}
}
