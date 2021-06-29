public class Dog{
	String name;
	int age;
	String seibetsu;
	String kenshu;
	
	public Dog(String name, int age, String seibetsu, String kenshu) {
		this.name = name;
		this.age = age;
		this.seibetsu = seibetsu;
		this.kenshu = kenshu;
	}
	public String toString() {
		return this.name + "\t" + this.age + "\t" + this.seibetsu + "\t" + this.kenshu;
	}
}