public class Animal{
	String name;
	int age;
	String seibetsu;
	
	public Animal() {
		name = "NO NAME";
		age = 0;
		seibetsu = "NOT SET";
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setSeibetsu(String seibetsu) {
		this.seibetsu = seibetsu;
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public String getSeibetsu() {
		return this.seibetsu;
	}
}