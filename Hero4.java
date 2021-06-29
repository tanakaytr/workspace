public class Hero4 extends Character {
	protected String name = "ミナト";
	protected int hp = 100;
	
	public Hero4() {
		System.out.println("Heroが生成されました！");
	}
	public String toString() {
		return "名前：" + this.name + "/HP:" + this.hp;
	}

	public void attack(Monster m) {
		System.out.println(this.name + "の攻撃！");
		m.hp -= 10;
		System.out.println("敵に10ポイントのダメージを与えた！");
	}

	public void run() {
		System.out.println(this.name + "は逃げ出した！！");
	}

	public final void slip() {
		this.hp -= 5;

		System.out.println(this.name + "は転んだ！");
		System.out.println("5のダメージ");

	}
	public int getHp() {
		return this.hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
}