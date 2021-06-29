public class Sample13{
	public static void main(String[] args) {
		Character[] c = new Character[4];
		c[0] = new Hero4();
		c[1] = new Hero4();
		c[2] = new Wizard2("メレブ");
		c[3] = new Wizard2("レイ");
		for(Character ch : c) {
			ch.setHp(ch.getHp() + 50);
			System.out.println(ch.getHp() + 50);
		}
		Monster[] monsters = new Monster[2];
		monsters[0] = new Matango('E');
		monsters[1] = new Slime();
		for(Monster m : monsters) {
			m.run();
		}
	}
}