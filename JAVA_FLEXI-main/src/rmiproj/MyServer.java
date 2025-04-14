package rmiproj;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MyServer {
    public static void main(String[] args) throws MalformedURLException {
        try {
            Adder stud = new AdderRemote();  // create remote object
            Registry resty = LocateRegistry.createRegistry(65000); // start RMI registry on port 65000
            Naming.rebind("rmi://localhost:65000/obj1", stud); // bind remote object with name "obj1"
            System.out.println("Server has started...");
        } catch (RemoteException ex) {
            ex.printStackTrace();
        }
    }
}
