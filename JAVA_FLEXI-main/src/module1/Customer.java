package module1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Customer {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbms2", "root", "Sh1v@m2003");
		System.out.println("Connection is successful ....");
		
		Statement stmt = con.createStatement();
		//to insert a row
		String str1 = "insert into customer values('115', 'Harsh', 'hled@gmail.com', 1234567896, 'nothing')";
		int result = stmt.executeUpdate(str1);
		System.out.println("Result is " + result);
		
		if(result > 0) {
			System.out.println("record is inserted..");
		}
		else {
			System.out.println("record is not inserted..");
		}
	}
}
