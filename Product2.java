public class Product2{
	String name;
	int price;
	int unit;
	
	public Product2(String name, int price, int unit) {
		this.name = name;
        this.price = price;
        this.unit = unit;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setUnit(int unit) {
		this.unit = unit;
	}
	public String getName() {
		return this.name;
	}
	public int getPrice() {
		return this.price;
	}
	public int getUnit() {
		return this.unit;
	}
}