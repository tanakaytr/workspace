public class Cat2 {
	String name;
	int age;
	String seibetsu;

	public Cat2() {
		this.name = "ネコちゃん";
		this.age = 1;
		this.seibetsu = "未定";
	}

	public String toString() {
		return "name : " + this.name + "\n" + 
	"age : " + this.age + "\n" + 
				"seibetsu : " + this.seibetsu;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void showName() {
		System.out.println("name:" + this.name);
	}
}
