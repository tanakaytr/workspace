public class Car{
	String name;
	String maker;
	int price;
	
	public Car(String name, String maker) {
		this.name = name;
		this.maker = maker;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String toString() {
		return this.name + "\t" + this.maker + "\t" + this.price + "万円";
	}
}