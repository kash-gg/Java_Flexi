package practice;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Delete_PS {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbms2", "root", "Sh1v@m2003");
		System.out.println("Connection is Successful ....");
		
		System.out.println("Enter the Employee name to be deleted: ");
		String ename = sc.nextLine();
		
		String str1 = "delete from employee where ename = ?";
		PreparedStatement ps = con.prepareStatement(str1);
		
		ps.setString(1,  ename);
		
		int Result = ps.executeUpdate();
		System.out.println("Result is: " + Result);
		
		if(Result > 0)
			System.out.println("Query is Deleted.");
		else
			System.out.println("Query is not Deleted.");
	}

}
