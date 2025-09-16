package ch05.unit04;


/*
  cmd > java EX01_argument aa bb //main이 넘겨받는 명령 행 인수
  args[0] <-"aa" args[1] <- "bb"
  
 */
public class EX01_argument {

	public static void main(String[] args) {
		System.out.println("명령행 인수 개수 : " + args.length);

		System.out.println("명령행 인수 값 : ");
		for(int i=0;i<args.length;i++)
		{
			System.out.println(args[i] + " ");
		}
		System.out.println();

		/*
		for(String s : args)
		{
			System.out.println(s + " ");
		}
		System.out.println();
		*/
	
	}

}
