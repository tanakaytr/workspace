public class Cleric {
	String name = "レイ";
	int hp = 50;
	static final int MAX_HP = 50;
	int mp = 10;
	static final int MAX_MP = 10;
	
	void selfAid() {
		System.out.println(this.name + "は、セルフエイドを唱えた！");
		this.mp -= 5;
		this.hp = Cleric.MAX_HP;
		System.out.println(this.name + "は、全回復した！");
	}
	public int pray(int sec) {
		System.out.println(this.name + "は" + sec + "秒間、天に祈った！");
		int recover = new java.util.Random().nextInt(3) + sec;
		int recoverActual = Math.min(Cleric.MAX_MP - this.mp, recover);
		
		this.mp = recoverActual;
		System.out.println("MPが" + recoverActual + "ポイント回復した！");
		return recoverActual;
	}
	public Cleric(String name, int hp, int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}
	public Cleric(String name, int hp) {
		this(name, hp, Cleric.MAX_MP);
		
	}
	public Cleric(String name) {
		this(name, Cleric.MAX_HP);
	}
}