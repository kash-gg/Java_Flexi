package module3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class twoWayClientSocket {
	public static void main(String[] args) throws Exception, IOException {
		String ip1= "localhost";
		int port1= 65000; 

		Socket s= new Socket(ip1, port1);
		
		String str= "Hello Shivam";
		OutputStreamWriter os= new OutputStreamWriter(s.getOutputStream());
		PrintWriter out= new PrintWriter(os);
		out.println(str);
		//out.write(str);
		os.flush(); //to clear the buffer
		
		//to fetch the data from the server socket
		InputStreamReader ir=new InputStreamReader(s.getInputStream());
		BufferedReader bu=new BufferedReader(ir);
		String str2 = bu.readLine();
		System.out.println("Data from the server: " +str2);
	}
}
