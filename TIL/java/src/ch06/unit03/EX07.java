package ch06.unit03;

//Stack 구조 : LIFO
//지역변수, 매개변수는 Stack 영역에 메모리 확보
//지역변수는 메소드를 호출할 때 메모리가 확보되고 메소드 빠져나올 때 메모리 해제
//지역 변수는 메소드 내부 또는 블럭 내부에서만 사용 가능
//지역 변수는 초기화 하지 않으면 가비지 값 가지고 있음

public class EX07 {

	public static void main(String[] args) {
	
		Test7 obj = new Test7();
		
		obj.disp(5);
		

	}

}

class Test7
{
	//재귀호출(recursion)
	// 종료 조건 주지 않으면 stackoverflowError 발생
	public void disp(int n)
	{
		if(1<n) //무한루프 걸면 StackOverflowError
		{
			disp(n-1);
		}
		System.out.printf("%3d", n); // 잠시 보류 조건 다 빠져나오면 스택에서 뽕뽕뽕뽕뽕 빠짐
	}
}