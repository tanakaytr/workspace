public class Book{
	String name;
	int price;
	int unit;
	
	public Book(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public void setUnit(int unit) {
		this.unit = unit;
	}
	public int getSubTotal() {
		return this.price * this.unit;
	}
}