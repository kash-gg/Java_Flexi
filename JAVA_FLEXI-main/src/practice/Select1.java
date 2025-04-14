package practice;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Select1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbms2", "root", "Sh1v@m2003");
		System.out.println("Connection is Successful.");
		
		Statement stmt = con.createStatement();
		String str1 = "select * from employee";
		ResultSet rs = stmt.executeQuery(str1);
		
		while(rs.next()) {
			System.out.println("Employee no : " + rs.getInt(1));
			System.out.println("Employee name: " + rs.getString(2));
			System.out.println("Salary: " + rs.getInt(3));
			System.out.println("---------------------------------");
		}
		
	}

}
