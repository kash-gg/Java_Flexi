package rmiproj;

import java.rmi.Naming;

public class MyClient {
    public static void main(String[] args) {
        try {
            System.out.println("Client is reading the stud");
            Adder stud = (Adder) Naming.lookup("rmi://localhost:65000/obj1");
            System.out.println("Calling the method associated to the object");
            System.out.println(stud.add(30, 40));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
