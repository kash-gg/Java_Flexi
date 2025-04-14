package module4;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.net.Socket;
import java.net.ServerSocket;

public class SocketServer {

	public static void main(String[] args) throws Exception {
		System.out.println("Server is Starting ....");
		
		ServerSocket ss = new ServerSocket(65000);
		System.out.println("Client is requesting access ....");
		
		Socket s = ss.accept();
		System.out.println("Client is Connected to the Server.");
		
		InputStreamReader ir = new InputStreamReader(s.getInputStream());
		BufferedReader br = new BufferedReader(ir);
		
		String str = br.readLine();
		System.out.println("The String is: " + str);
		
	}

}