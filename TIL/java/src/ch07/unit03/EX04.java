package ch07.unit03;

// 이름을 입력받아 김씨 인원수 출력
// 입력받은 이름이 end END End처럼 대소문자를 구분하지 않고 end이면 인원수 출력후 종료

// 이름 ? 스프링
// 이름 ? 김자바
// 이름 ? 김하하
// 이름 ? end
// 김씨 인원수 : 2

import java.util.Scanner;

public class EX04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String name;
		int cnt=0;
		
		do {System.out.println("이름 ? ");
			name=sc.next();
			
			if (name.startsWith("김")){
				cnt++;
				}

		}while(!(name.equalsIgnoreCase("end")));
		
		System.out.println("김씨 인원수 : " + cnt);
		
		sc.close();
	}

}
