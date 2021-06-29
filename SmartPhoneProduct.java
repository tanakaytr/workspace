public class SmartPhoneProduct extends Product2{
	String carrier;
	
	public SmartPhoneProduct(String carrier, String name, int price, int unit) {
		super(name,price,unit);
        this.carrier = carrier;
	}
	public String getCarrier() {
		return this.carrier;
	}
	public int getTotal() {
		return this.getPrice() * this.getUnit();
	}
}