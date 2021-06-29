public class Matango extends Monster {
	protected int hp = 50;
	final int LEVEL = 10;
	protected char suffix;
	
	public Matango(char suffix) {
		this.suffix = suffix;
	}
	public void attack(Hero4 h) {
		System.out.println("キノコ" + this.suffix + "の攻撃!");
		System.out.println("10のダメージ！");
		h.setHp(h.getHp() - 10);
	}
	public void run() {
		System.out.println("お化けキノコ" + this.suffix + "は逃げ出した！");
	}
}