public class Hero2 {
	String name;
	int hp;
	static int money;

	Sword sword;

	void attack() {
		System.out.println(this.name + "は攻撃した！");
		System.out.println("敵に5ポイントのダメージを与えた！");
	}

	Hero2(String name) {
		this.hp = 100;
		this.name = name;
	}

	Hero2() {

		this("ダミー");
	}
	static void setRandomMoney() {
		Hero2.money = (int) (Math.random() * 1000);
	}
}