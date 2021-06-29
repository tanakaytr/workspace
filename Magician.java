public class Magician extends Player{
	public Magician(String name) {
		super(name);
	}
	public String getName() {
		return "魔法使い：" + this.name;
	}
	public void fight(){
		System.out.println(this.getName() + "：戦うのはあまり得意ではない");
	}
	public void run() {
		 System.out.println(this.getName() + "：必死に逃げ出した");
	}
	public void useMagic() {
		System.out.println(this.getName() + "：強力な魔法を使った");
	}
	public void useTool() {
		System.out.println(this.getName() + "：薬草を使った");
	}
}