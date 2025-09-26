package ch06.di;

import java.util.Scanner;

public class UserUI {
	private Scanner sc = new Scanner(System.in);
	private User user = new UserImpl();
	private UserDisplay disp;
	
	public UserUI() {
		disp = new UserDisplay(user);
	}
	
	public void menu() {
		int ch;
		
		while(true) {
			do {
				System.out.println("1.입력 2.출력 3.종료 => ");
				ch=sc.nextInt();
			}while(ch<1 || ch>3);
			
			if(ch==3) {
				System.out.println("프로그램 종료");
				return;
			}
			
			switch(ch) {
			case 1:input(); break; 
			case 2:print(); break;  
			}
		}
	}
	
	public void input() {
		System.out.println("[데이터 입력]");
		
		try {
			UserVO vo = new UserVO();
		
			System.out.println("이름 ? ");
			vo.setName(sc.next());

			user.append(vo);
			System.out.println("나이 ? ");
			vo.setAge(sc.nextInt());
			
			System.out.println("등록완료\n");
			
		} catch (Exception e) {
			sc.nextLine();
			System.out.println("나이는 숫자만 가능합니다.");
		}
		
	}
	
	public void print() {
		System.out.println("[데이터 출력]");
		
		disp.printAll();
	}
	
}
