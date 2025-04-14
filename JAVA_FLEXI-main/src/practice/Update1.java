package practice;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Update1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbms2", "root", "Sh1v@m2003");
		System.out.println("Connection is Successful");
		
		Statement stmt = con.createStatement();
		String str1 = "update employee set sal = sal + 3000 where ename = 'uma'";
		
		int Result = stmt.executeUpdate(str1);
		System.out.println("Result is: " + Result);
		
		if (Result > 0)
			System.out.println("Query Updated.");
		else
			System.out.println("Query noy=t Updated.");
	}

}
