//ComWithCgi.java
import java.io.*;
import java.net.*;

public class ComWithCgi {
	public static void main(String[] args) throws Exception {
		URL url = new URL("http:/java.sun.com/test.cgi");// ����ָ�򱾵ش�����cgi��URL����
		URLConnection connection = url.openConnection();
		connection.setDoOutput(true);
		PrintStream ps = new PrintStream(connection.getOutputStream());
		ps.println("0123456789");
		ps.close(); // ��������������
		DataInputStream dis = new DataInputStream(connection.getInputStream());
		String inputLine;
		while ((inputLine = dis.readLine()) != null) {
			System.out.println(inputLine);
		}
		dis.close();// �ӷ�����������
	}
}
