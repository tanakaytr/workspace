public abstract class Player{
	public String name;
	
	Player() {
		this("名無しさん");
	}
	Player(String name){
		this.name = name;
	}
	String getName() {
		return this.name;
	}
	public abstract void fight();
	
	public abstract void run();
	
	public abstract void useMagic();
	
	public abstract void useTool();
}