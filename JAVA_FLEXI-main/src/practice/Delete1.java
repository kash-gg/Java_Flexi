package practice;

import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;

public class Delete1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbms2", "root", "Sh1v@m2003");
		System.out.println("Connection is successful.");
		
		Statement stmt = con.createStatement();
		String str1 = "delete from customer where cust_id = '116'";
		int Result = stmt.executeUpdate(str1);
		System.out.println("Result is: " + Result);
		
		if(Result > 0)
			System.out.println("Query is deleted.");
		else
			System.out.println("Query is not deleted.");
	}

}
