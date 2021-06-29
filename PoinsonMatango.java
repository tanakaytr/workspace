public class PoinsonMatango extends Matango {
	private int PoisonCount = 5;
	public PoinsonMatango(char suffix) {
		super(suffix);
	}
	public void attack(Hero4 h) {
		System.out.println("キノコ" + this.suffix + "の攻撃!");
		System.out.println("10のダメージ！");
		h.setHp(h.getHp() - 10);
		if(PoisonCount > 0) {
			System.out.println("さらに毒の胞子をばらまいた！");
			h.hp -= h.getHp() /5;
			System.out.println(h.getHp() /5 + "ポイントのダメージ！");
			this.PoisonCount -= 1;
			System.out.println("残りの毒は" + this.PoisonCount);
		}
	}
}