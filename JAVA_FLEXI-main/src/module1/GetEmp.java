package module1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetEmp {

	public static void main(String[] args) throws SQLException, ClassNotFoundException{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbms2", "root", "Sh1v@m2003");
		System.out.println("Connection is successful ....");
		
		
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("Select * from employee");
		while(rs.next()) {
			System.out.println("emo_no is " + rs.getInt(1));
			System.out.println("ename is " + rs.getString(2));
			System.out.println("salary is " + rs.getInt(3));
			System.out.println("-------------------------");
			
		}

	}

}
