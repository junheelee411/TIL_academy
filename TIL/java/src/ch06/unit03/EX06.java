package ch06.unit03;

public class EX06 {

	public static void main(String[] args) {
		
		Test6 t1= new Test6();
		Test6 t2= new Test6();
		
		t1.x=10;
		t2.x=10;
		t1.sub();
		System.out.println(t1.x + " , " + t2.x); // 15 10
		
		t1.x=10;
		t2.x=10;
		t1.sub2(t2);
		System.out.println(t1.x + " , " + t2.x); // 10 20
	}

}

class Test6
{
	int x;
	
	public void sub()
	{
		x+=5;
	}
	public void sub2(Test6 obj)
	{
		obj.x+=10;
	}
}