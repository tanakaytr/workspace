import java.io.InputStream;
import java.net.URL;

public class Sample15{
	public static void main(String[] args) throws Exception{
		URL u = new URL("http://www.amazon.co.jp");
		InputStream is = u.openStream();
		int i = is.read();
		while(i != -1) {
			char c = (char) i;
			System.out.println(c);
			i = is.read();
		}
	}
}