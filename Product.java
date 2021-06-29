public class Product{
	String name;
	int price;
	int unit;
	
	public Product(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setUnit(int unit) {
		this.unit = unit;
	}
	public int getTotal() {
		return this.price * this.unit;
	}
}