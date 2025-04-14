package practice;

import java.io.*;
import java.net.*;

public class SocketServer_TwoWay {

	public static void main(String[] args) throws IOException {
		System.out.println("Server is Starting ....");
		
		ServerSocket ss = new ServerSocket(65000);
		System.out.println("Server is waiting for Client Request ....");
		
		Socket s = ss.accept();
		System.out.println("Client is Connected to Server.");
		
		InputStreamReader is = new InputStreamReader(s.getInputStream());
		BufferedReader br = new BufferedReader(is);
		
		String str = br.readLine();
		System.out.println("Data from the Client: " + str);
		
		String str1 = "From Client: " + str.substring(6,12) + " Symbiosis";
		OutputStreamWriter os = new OutputStreamWriter(s.getOutputStream());
		PrintWriter out = new PrintWriter(os);
		
		out.println(str1);
		out.flush();
		
		System.out.println("Data from the Server: " + str1);
		
		
	}

}
