package practice;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Insert_PS {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbms2", "root", "Sh1v@m2003");
		System.out.println("Connection is Successful.....");

		System.out.println("Enter the Employee name: ");
		String ename = sc.nextLine();
		
		System.out.println("Enter the Employee id: ");
		int emp_no = sc.nextInt();
		
		System.out.println("Enter the Employee Salary: ");
		int sal = sc.nextInt();
		
		String str1 = "insert into employee values(?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(str1);
		
		ps.setInt(1, emp_no);
		ps.setString(2, ename);
		ps.setInt(3,  sal);
		
		int Result  = ps.executeUpdate();
		System.out.println("Result is: " + Result);
		
		if(Result > 0)
			System.out.println("Query is inserted.");
		else
			System.out.println("Query is not inserted.");
	}

}
