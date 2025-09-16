package ch04.unit03;

/*
  - 369 게임
    1 ~ 100 까지 수중 3, 6, 9가 들어 있는 수는 *를 출력하고
    기타 숫자는 해당 숫자를 출력하며, 한줄에 10개씩 출력하는 프로그램 작성
    
    1   2  *   4   5  *   7   8  *  10
   11  12  *  14  15  *  17  18  *  20
           :
*/

public class Ex23 {
	public static void main(String[] args) {
		/*
		int a = 123;
		System.out.println("일의 자리수 : " + (a % 10));
		System.out.println("10의 자리수 : " + (a / 10 % 10));
		System.out.println("100의 자리수 : " + (a / 100 % 10));
		*/

		int count;
		for(int i = 1; i <= 100; i++) {
			count = 0;
			if(i%10 >= 3 && i%10%3 == 0) { // 일의자리
				count++;
			}
			if(i/10>=3 && i/10%3==0) { // 10의 자리
				count++;
			}
			
			if(count >= 1) {
				System.out.printf("%5s", "*");
			} else {
				System.out.printf("%5d", i);
			}
			
			if(i % 10 == 0) {
				System.out.println();
			}
		}
		
	}
}
