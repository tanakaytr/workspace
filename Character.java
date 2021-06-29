public abstract class Character{
	protected String name;
	protected int hp;
	public abstract void attack(Monster m);
	public void run() {
		
	}
	public int getHp() {
		return this.hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
}