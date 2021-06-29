public class Hero5{
	String name;
	
	public Hero5(String name) {
		this.name = name;
	}
	public String getName() {
		return "ヒーロー : " + this.name;
	}
	public void fight() {
		System.out.println(this.getName() + "は戦った");
	}
	public void useMagic() {
		System.out.println(this.getName() + "は簡単な魔法を使った");
	}
	public void run() {
		System.out.println(this.getName() + "は必死に逃げ出した");
	}
}