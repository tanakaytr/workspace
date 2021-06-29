public class Sample2
{
	public static void main(String[] args) {
		System.out.println("あなたの名前を入力してください");
		String name = new java.util.Scanner (System.in).nextLine();
		System.out.println("貴方の年齢を入力してください");
		int age = new java.util.Scanner (System.in).nextInt();
		System.out.println("ようこそ、" + age + "際の" + name + "さん");
	}
}