public class SuperHero2 extends Hero5 {
	boolean isFlying;

	public SuperHero2(String name, boolean isFlying) {
		super(name);
		this.isFlying = isFlying;
	}

	public void fly() {
		if (this.isFlying) {
			System.out.println(this.getName() + "は空を飛んだ");
		} else {
			System.out.println(this.getName() + "は空を飛べない");
		}
	}
	public String getName() {
		return this.name;
	}
	public void useMagic() {
		System.out.println(this.getName() + "は高度な魔法を使った");
	}
	public void run() {
		System.out.println(this.getName() + "は華麗に撤退した");
	}
}