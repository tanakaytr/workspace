public class Test51 {
	public static void main(String[] args) {
		introduceOneself();
		email("ぼくドラえもん", "時間停止", "wryyyyyyy");
		
		
	}
	public static void introduceOneself() {
		String name = "ドラえもん";
		int age = 24;
		double height = 129.4;
		char seibetsu = '男';
		System.out.println(name + "が名前です");
		System.out.println(age + "が年齢です");
		System.out.println(height + "が身長です");
		System.out.println(seibetsu + "が性別です");
	}
	public static void email(String title, String address, String text) {
		System.out.println("「 " + address + " 」 " + "に、以下のメールを送信しました");
		System.out.println("件名 : " + title);
		System.out.println("本文 : " + text);
	}
}