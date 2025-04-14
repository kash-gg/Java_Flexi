package practice;

import java.io.OutputStreamWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;


public class ClientSocket1 {

	public static void main(String[] args) throws IOException, Exception {
		String ip1 = "localhost";
		int port = 65000;
		
		String str = "Shivam_Kapure";
		
		Socket s = new Socket(ip1, port);
		OutputStreamWriter os = new OutputStreamWriter(s.getOutputStream());
		PrintWriter out = new PrintWriter(os);
		
		os.write(str);
		os.flush();
		s.close();
		os.close();
		out.close();
	}

}
