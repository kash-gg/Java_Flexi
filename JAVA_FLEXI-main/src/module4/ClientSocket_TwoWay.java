package module4;

import java.io.*;
import java.net.*;

public class ClientSocket_TwoWay {

	public static void main(String[] args) throws Exception {
		String ip1 = "localhost";
        int port1 = 65000;

        Socket s = new Socket(ip1, port1);
        String str = "Hello Kritika";

        // Send to server
        PrintWriter out = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
        out.println(str);
        out.flush();

        // Receive response from server
        BufferedReader bu = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String str2 = bu.readLine();
        System.out.println("Data from the server: " + str2);

	}

}
