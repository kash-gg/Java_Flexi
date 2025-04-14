package module4;

import java.io.*;
import java.net.*;

public class SocketServer_TwoWay {

	public static void main(String[] args) throws IOException {
		System.out.println("Server has started...");

        ServerSocket ss = new ServerSocket(65000);
        System.out.println("Server is waiting for the client request...");

        Socket s = ss.accept();
        System.out.println("Client is connected successfully!");

        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String str = br.readLine();
        System.out.println("Data from the client is " + str);

        String str1 = "From server: " + str.substring(6, 13) + " symbiosis...";
        PrintWriter out = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
        out.println(str1);
        out.flush();

        System.out.println("Data from the server is: " + str1);

	}

}
