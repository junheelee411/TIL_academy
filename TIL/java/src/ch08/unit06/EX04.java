package ch08.unit06;

/*
 	 인터페이스 특징
 	 - 클래스 간의 결합도를 낮출 수 있다
 	 - 표준화가 가능
 	 - 개발 시간 단축
 */
public class EX04 {

	public static void main(String[] args) {
		Store st = new Store();
		
		Orange f1 = new Orange();
		st.sell(f1);
		
		System.out.println();
		
		Fruit f2 = new Apple();
		st.sell(f2);
		
	}

}


interface Fruit{
	public String getName();
	public int getPrice();
	
}

class Apple implements Fruit{

	@Override
	public String getName() {
		return "사과";
	}

	@Override
	public int getPrice() {
		return 2500;
	}
	
}

class Orange implements Fruit{

	@Override
	public String getName() {
		return "오렌지";
	}

	@Override
	public int getPrice() {
		return 1000;
	}
	
}


class Store{

	public void sell(Fruit f) {
		System.out.printf(f.getName() + " -> " + f.getPrice());
	}
}


