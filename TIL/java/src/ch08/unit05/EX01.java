package ch08.unit05;

public class EX01 {

	public static void main(String[] args) {

		int [] num = {50,25,60,55,33,54,67,51};
		
		System.out.println("sort 전 : ");
		print(num);
		System.out.println();
		
		SortInt ss = new SelectionSort();
		ss.sort(num);
		
		System.out.println("sort 후 : ");
		print(num);
		System.out.println();
		
	}	
	
	public static void print(int[] num) {
		for(int n : num) {
			System.out.print(n + " ");
		}
		System.out.println();
	}
}

abstract class SortInt{
	private int[] value;
	
	// 추상 메소드
	protected abstract void sorting();
	
	public void sort(int[] value) {
		this.value = value;
		sorting();
	}
	
	// 배열의 길이
	protected int length() {
		int n = -1;
		
		if(value != null) {
			n=value.length;
		}
		
		return n;
	}
	
	// 두 정수 비교
	protected final int compare(int i, int j) {
		return value[i] - value[j];
	}
	
	// 배열의 두 요소 값바꾸기
	protected final void swap(int i, int j) {
		int t = value[i];
		value[i] = value[j];
		value[j] = t;
	}
}

// 추상클래스를 상속 받은 하위 클래스가 추상클래스가 아니면 반드시 추상 메소드를 재정의 해야함

class SelectionSort extends SortInt{
	@Override
	protected void sorting() {
		for(int i =0; i<length()-1; i++) {
			for(int j=i; j<length();j++) {
				if(compare(i,j)>0) {
					swap(i,j);
				}
			}
		}
		
	}
}

class BubbleSort extends SortInt{

	@Override
	protected void sorting() {
		boolean flag = true;
		for(int i=1;flag;i++) {
			flag=false;
			for(int j=0;j<length()-i;j++) {
				if(compare(j,j+1)>0) {
					swap(j,j+1);
					flag=true;
				}
			}
		}
	}
	
}