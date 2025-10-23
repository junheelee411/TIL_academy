package Machine;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class MachineUI {

	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private MemoryProductRepository repo = new MemoryProductRepository();
	private Buy22 buy = new Buy22();

	private int money = 0;

	public void menu() {

		int ch;
		String main = """
				=====================================
				1.가격 오름차순 상품 출력 2.가격 내림차순 상품 출력 3.현금 입력 4.종료
				=====================================
				""";

		try {
			while (true) {
				System.out.println("=====================================");
				System.out.println("현재 잔고 : " + money);
				System.out.print(main);
				System.out.print("=> ");
				ch = Integer.parseInt(br.readLine());

				if (ch == 4) {
					System.out.println("이용해주셔서 감사합니다.");
					System.exit(0);
				}

				switch (ch) {
				case 1:
					getAllProduct(repo.sortByPriceAsc());
					break;
				case 2:
					getAllProduct(repo.sortByPriceDesc());
					break;
				case 3:
					setCash();
					break;
				}
			}

		} catch (NumberFormatException e) {
			System.out.println("숫자만 입력 가능합니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// 1. 상품 출력 UI
	public void getAllProduct(List<Product> list) {
		String name;

		print(list);
		try {
			System.out.println("원하는 상품의 이름을 입력하세요.");
			System.out.print("아무것도 입력하지 않을 시 뒤로가기 => ");
			name = br.readLine();

			// 해당 코드의 제품 유무 체크 메소드 필요 ( Storage 클래스에서 구현 )

			if (repo.findByProductName(name) == null) {
				System.out.println("존재하지 않는 제품입니다.");
				System.out.println("메인 메뉴로 돌아갑니다.");
			} else {
				purchase(name);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 2. 현금 입력 UI
	private void setCash() {
		int n;

		try {
			System.out.print("얼마를 넣으시겠습니까 ? ");
			n = Integer.parseInt(br.readLine());

			money = n;

		} catch (NumberFormatException e) {
			System.out.println("숫자를 입력하세요");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 구매 메소드
	 * 
	 * @param code 구매할 상품의 코드
	 */
	public void purchase(String name) {
		int ch, ea;

		try {
			System.out.println("[" + name + "] 상품을 구매하시겠습니까?");
			System.out.print("1.구매 2.취소 => ");
			ch = Integer.parseInt(br.readLine());

			switch (ch) {
			case 1:
				System.out.print("몇 개 구매하시겠습니까 ? ");
				ea = Integer.parseInt(br.readLine());

				money = buy.buy2(name, money, ea);
				System.out.println("[ " + name + " ] 상품을 " + ea + "개 구매하셨습니다.");
				break;
			case 2:
				System.out.println("구매를 취소하셨습니다.");
				break;
			default:
				System.out.println("올바르지 않은 값입니다.");
				break;
			}
		} catch (StockXException e) {
			System.out.println(e.getMessage());
		} catch (MoneyXException e) {
			System.out.println(e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println("숫자만 입력 가능합니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 양식에 맞게 출력하는 메소드
	 * 
	 * @param list 출력할 데이터가 담긴 Map
	 */
	public void print(List<Product> list) {
		System.out.println("-------------------------------------");
		System.out.printf("%5s%7s%6s%7s\n", "상품번호", "상품명", "가격", "재고");
		System.out.println("-------------------------------------");

		// 테스트용 데이터 출력
		for (Product p : list) {
			System.out.printf("%8d%8s%8s%8s\n", p.getProductCode(), p.getName(), p.getPrice(), p.getStock());
		}

		System.out.println("-------------------------------------");
	}

}
