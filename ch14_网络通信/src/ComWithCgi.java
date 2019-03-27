//ComWithCgi.java
import java.io.*;
import java.net.*;

public class ComWithCgi {
	public static void main(String[] args) throws Exception {
		URL url = new URL("http:/java.sun.com/test.cgi");// 建立指向本地磁盘上cgi的URL对象
		URLConnection connection = url.openConnection();
		connection.setDoOutput(true);
		PrintStream ps = new PrintStream(connection.getOutputStream());
		ps.println("0123456789");
		ps.close(); // 向服务器输出数据
		DataInputStream dis = new DataInputStream(connection.getInputStream());
		String inputLine;
		while ((inputLine = dis.readLine()) != null) {
			System.out.println(inputLine);
		}
		dis.close();// 从服务器读数据
	}
}
