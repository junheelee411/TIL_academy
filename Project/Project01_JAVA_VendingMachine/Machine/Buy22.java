package Machine;

public class Buy22 {
	
	private MemoryProductRepository repo = new MemoryProductRepository();
	public int buy2(String name, int mon, int gaesu) throws Exception { // 내가 해야할것 : 내가 가진 돈과 원하는 물건의 가격을 비교해서 내가 가진돈이 같거나 많으면 구매.
		// 구매 불가 상황 구현하기. 1. 돈이 부족 2. 재고 부족
		
		Product p = repo.findByProductName(name);
		// p = 입력한 제품의 정보를 가져다줌.
		
		if(!iceEaComp(p, gaesu)) {
			throw new StockXException("재고가 부족합니다!"); // 예외 만들기
		} else if(iceMoneyComp(p, mon, gaesu)) {
			throw new MoneyXException("돈이 부족합니다!"); // Exception
		} else {
			p.setStock(p.getStock() - 1);
			return mon - (p.getPrice() * gaesu); // 구매 성공시 리턴되는 값.
		}
				
	}
	// 재고차감 클래스
	public void iceminusCount(Product a) throws Exception {
		if (a.getStock() < 1) {
			throw new Exception();
		}
		a.setStock(a.getStock() - 1);
	}
	// 금액비교
	public boolean iceMoneyComp(Product a, int money, int ea) {
		if (a.getPrice() * ea >= money) {
			return true;
		} else {
			return false;
		}
	}
	// 재고비교
	public boolean iceEaComp(Product a, int ea) {
		if (a.getStock() >= ea) {
			return true;
		} else
			return false;
	}
}

