package Machine;
public class Product {
	
	private int productCode; // 상품 번호
	private String name;
	private int price;
	private int stock; // 재고
	
 public Product(int productCode, String name, int price, int stock) {
       this.productCode = productCode;
       this.name = name;
       this.price = price;
       this.stock = stock;
   }
	
	public int getProductCode() {
		return productCode;
	}
	
	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getStock() {
		return stock;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}
	
}