package practice;

import java.io.*;
import java.net.*;

public class ClientSocket_TwoWay {

	public static void main(String[] args) throws Exception {
		String ip1 = "localhost";
		int port = 65000;
		
		Socket s = new Socket(ip1, port);
		String str = "Hello Shivam";
		
		OutputStreamWriter os = new OutputStreamWriter(s.getOutputStream());
		PrintWriter out = new PrintWriter(os);
		out.println(str);
		out.flush();
		
		InputStreamReader is = new InputStreamReader(s.getInputStream());
		BufferedReader br = new BufferedReader(is);
		String str1 = br.readLine();
		
		System.out.println("Data from the Server: " + str1);
	}
		
}
