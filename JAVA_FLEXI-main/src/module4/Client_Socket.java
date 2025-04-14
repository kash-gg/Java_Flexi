package module4;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;


public class Client_Socket {

	public static void main(String[] args) throws Exception, IOException {
		String ip1 = "localhost";
		int port1=65000;
		//0-1023 : reserved
		//tomcat: 8081, mysql: 3306, oracle: 1521
		
		Socket s = new Socket(ip1,port1);
		String str ="Kisna"; 
		OutputStreamWriter os = new OutputStreamWriter(s.getOutputStream());
		PrintWriter out = new PrintWriter(os);
		
		os.write(str);
		os.flush();
		s.close();
		os.close();
		out.close();

	}

}