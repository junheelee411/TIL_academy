package ch06.unit03;

public class EX10 {

	public static void main(String[] args) {
		
		
		int a=area(10,5);
		disp("사각형 넓이 : " , a);
		

		double x=area(10);
		disp("원의 넓이 : " , x);
		
		

	}
	
	public static int area(int h, int w)
	{
		return h*w;
	}
	
	public static double area(int r)
	{
		return 3.141592 * r*r;
	}
	
	public static void disp(String title, int s)
	{
		System.out.println(title + s);
	}
	
	public static void disp(String title, double s)
	{
		System.out.println(title + s);
	}
	
	

}

