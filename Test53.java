public class Test53 {
	public static void main(String[] args) {
		email("ぼくドラえもん", "wryyyyyyy");
		System.out.println(calcTriangleArea(10.4, 4.9));
		System.out.println(calcCircleArea(5.95));
	}
	public static double calcTriangleArea(double bottom, double height) {
		return bottom * height / 2;
	}
	public static double calcCircleArea(double radius) {
		return radius * radius * Math.PI;
	}
	public static void email(String address, String text) {
		System.out.println("「 " + address + " 」 " + "に、以下のメールを送信しました");
		System.out.println("件名：　無題");
		System.out.println("本文 : " + text);
	}
}