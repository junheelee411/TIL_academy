package Machine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// 창고 클래스
// storage는 프로그램 실행 시 단 한개만 생성됨. 모든 메소드가 하나의 storage를 공유
public class MemoryProductRepository {
	// Storage : Map<상품번호, 상품명>
	// Product 클래스에 따라 ArrayList<Product> 또는 Map<Integer, Product> 등으로 변환
	private static final List<Product> productList = new ArrayList<>();
	// 테스트용 데이터 삽입
	static {
		Product p1 = new Product(1, "메로나", 1500, 10);
		Product p2 = new Product(2, "쌍쌍바", 1400, 10);
		Product p3 = new Product(3, "하겐다즈", 7500, 5);

		productList.add(p1);
		productList.add(p2);
		productList.add(p3);
	}

	// 상품 리스트를 가격 오름차순으로 정렬
	public List<Product> sortByPriceAsc() {
		List<Product> sortedList = new ArrayList<>(productList);
		Collections.sort(sortedList, new Comparator<Product>() {
			@Override
			public int compare(Product p1, Product p2) {
				return Integer.compare(p1.getPrice(), p2.getPrice());
			}
		});
		return sortedList;
	}

	// 가격 내림차순 정렬된 상품 리스트 반환
	public List<Product> sortByPriceDesc() {
		List<Product> sortedList = new ArrayList<>(productList);
		Collections.sort(sortedList, new Comparator<Product>() {
			@Override
			public int compare(Product p1, Product p2) {
				return Integer.compare(p2.getPrice(), p1.getPrice());
			}
		});
		return sortedList;
	}

	// 상품 코드로 상품 검색
	public Product findByProductCode(int code) {
		for (Product p : productList) {
			if (p.getProductCode() == code) {
				return p; // 처음으로 매칭되는 상품 반환
			}
		}
		return null; // 없으면 null 반환
	}

	// 상품 이름으로 상품 검색
	public Product findByProductName(String name) {
		for (Product p : productList) {
			if (p.getName().equals(name)) {
				return p; // 처음으로 매칭되는 상품 반환
			}
		}
		return null; // 없으면 null 반환
	}

	// 상품 리스트 출력
	public void printProductList(List<Product> list) {
		for (int i = 0; i < list.size(); i++) {
			Product p = list.get(i);
			System.out
					.println((i + 1) + ". " + "이름: " + p.getName() + ", 가격: " + p.getPrice() + ", 재고: " + p.getStock());
		}
	}

}
