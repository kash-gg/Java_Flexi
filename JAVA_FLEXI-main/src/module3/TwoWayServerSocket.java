package module3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TwoWayServerSocket {

	public static void main(String[] args) throws IOException {
//		two way communication : data will send from server to client
		System.out.println("Server has started...");
		
		ServerSocket ss= new ServerSocket(65000);
		System.out.println("Server is waiting for the client request");
		
		Socket s= ss.accept();
		System.out.println("Client is connected succesfully!!!");
		
		InputStreamReader ir= new InputStreamReader(s.getInputStream());
		BufferedReader br= new BufferedReader(ir); 
		String str= br.readLine();	
		System.out.println("Data from the client is "+str);
		
		String str1="From server : " +str.substring(6,13) +" symbiosis...";
		OutputStreamWriter os=new OutputStreamWriter(s.getOutputStream());
		PrintWriter out=new PrintWriter(os);
		out.println(str1);
		out.flush();
		System.out.println("Data from the server is: "+ str1);
		
	}
}
