package ch05.unit03;

public class EX01_arraycopy {

	public static void main(String[] args) {
		int a[] = new int[] {10,20,30};
		
		int[]x =a; //주소 복사
		System.out.println(a==x);
		System.out.println(a[1] + " , " + x[1]);
		
		int[]b =new int[a.length];
		
		       //원본 배열, 원본에서 복사할 시작 위치, 복사할 배열, 복사시킬 위치, 복사할 개수
		System.arraycopy(a,0,b,0,a.length); //값만 복사
		System.out.println(a==b); //false
		System.out.println(a[1] + " , " + b[1]);
		
		x[1]=100;
		System.out.println(a[1] + " , " + x[1] + " , " + b[1]);
		                    //100         100             20

	}

}
