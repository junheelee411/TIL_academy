package ch02.unit04;

public class EX05_DataType {

	public static void main(String[] args) {
		int i1=2_000_000_000;
		int i2=2_000_000_050;
		System.out.println(i1==i2);
		
		float f1=2_000_000_000;
		float f2=2_000_000_050;
		System.out.println(f1==f2); //float 정밀도 낮음 -> 사용 시 주의
		System.out.printf("%.2f %.2f\n",f1,f2);

		double d1=2_000_000_000;
		double d2=2_000_000_050;
		System.out.println(d1==d2);
		System.out.printf("%.2f %.2f\n",d1,d2);
	}

}
