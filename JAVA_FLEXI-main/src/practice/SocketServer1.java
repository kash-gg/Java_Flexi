package practice;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.net.ServerSocket;
import java.net.Socket;


public class SocketServer1 {

	public static void main(String[] args) throws IOException, Exception {
		System.out.println("Server is Starting: .....");
		
		ServerSocket ss = new ServerSocket(65000);
		System.out.println("Client is waiting for the Request...");
		
		Socket s = ss.accept();
		System.out.println("Client is connected Successfully.");
		
		InputStreamReader is = new InputStreamReader(s.getInputStream());
		BufferedReader br = new BufferedReader(is);
		
		String str = br.readLine();
		System.out.println("String is: " + str);
	
	}

}
