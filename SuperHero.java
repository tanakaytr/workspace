public class SuperHero extends Hero4 {
	private boolean flying;

	public SuperHero() {
		System.out.println("SuperHeroが生成されました！");
	}

	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった！");
	}

	public void land() {
		this.flying = false;
		System.out.println("着地した！");
	}

	public void attack(Matango m) {

		System.out.println(this.name + "の攻撃！");
		if (this.flying) {
			super.attack(m);
			System.out.println(this.name + "の攻撃！");
			m.hp -= 10;
			System.out.println("10ポイントのダメージを与えた！");
		}
	}
}