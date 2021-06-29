public class Sample11{
	public static void main(String[] args) {
		PoinsonMatango pm = new PoinsonMatango('A');
		Hero4 h = new Hero4();
		pm.attack(h);
		pm.attack(h);
		h.attack(pm);
		h.attack(pm);
		h.attack(pm);
	}
}