package ncs.test4;

public class Product {
	//field
	private String name;
	private int price;
	private int quantity;
	
	//constructor
	public Product() {
		
	}
	public Product(String name, int price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	//getter & setter
	//getter
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	//setter
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	//method
	public String information() {
		String info = "상품명 : " + name +"\n"
					+ "가격 : " + price +"원\n"
					+ "수량 : " + quantity+"개\n";
		return info;
	}
}
