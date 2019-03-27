//URL2.java
import java.io.*;
import java.net.*;

public class URL2 {
	public static void main(String[] args) throws IOException {
		URL url = new URL("http://java.sun.com/j2se/index.jsp");
		InputStreamReader isr = new InputStreamReader(url.openStream());
		BufferedReader br = new BufferedReader(isr);
		String s;
		while ((s = br.readLine()) != null)
			System.out.print(s);
		br.close();
	}
}
