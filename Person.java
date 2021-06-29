public class Person{
	String age;
	public void setString(String age) {
		if(age) {
			throw new IllegalArgumentException("年齢の数を正にすべきです。 指定地　＝" + age);
		}
		this.age = age;
	}
}