package module1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class updateDemo {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Scanner sc = new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbms2", "root", "Sh1v@m2003");
		System.out.println("Connection is successful ....");
		
		System.out.println("Enter the Increement: ");
		int incr = sc.nextInt();
		
		System.out.println("Enter the name: ");
		String ename = sc.next();
		
		String str = "update employee set sal = sal + ? where ename = ?";
		
		PreparedStatement ps = con.prepareStatement(str);
		ps.setInt(1, incr);
		ps.setString(2, ename);
		
		int result =  ps.executeUpdate();
		if (result > 0) {
			System.out.println("record is updated....");
		}
		else
			System.out.println("record is not updated...."); 
		

	}

}
