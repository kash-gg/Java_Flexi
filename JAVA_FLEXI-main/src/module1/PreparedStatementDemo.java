package module1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementDemo {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Scanner sc = new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbms2", "root", "Sh1v@m2003");
		System.out.println("Connection is successful ....");
		
		System.out.println("Enter employee id: ");
		int emp_no = sc.nextInt();
		
		System.out.println("Enter employee name: ");
		String ename = sc.nextLine();
		
		System.out.println("Enter the salary: ");
		int sal = sc.nextInt();
		
		
		String str = "insert emp values(?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(str);
		
		ps.setInt(1,  emp_no);
		ps.setString(2,  ename);
		ps.setInt(3, sal);
		
		int result =  ps.executeUpdate();
		if (result > 0) {
			System.out.println("record is inserted....");
		}
		else
			System.out.println("record is not inserted....");
	}

}
