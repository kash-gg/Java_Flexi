package module1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class InsertOperation {
	public static void main (String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbms2", "root", "Sh1v@m2003");
			System.out.println("Connection is successful ....");
		} 
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		} 
		catch (SQLException e1) {
			e1.printStackTrace();
		} 
		catch (Exception e2) {
			System.out.println("Database Connectivity Error.");
			e2.printStackTrace();
		}
	}
}
