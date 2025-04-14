package practice;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class MenuDriven_JDBC {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbms2", "root", "Sh1v@m2003");
			System.out.println("Connection is Successful....");
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the DML Operation you want to perform: \n1) Insert\n2) Update\n3) Delete\n4) Select\n");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				
				System.out.println("Enter The Employee Name: ");
				String ename = sc.nextLine();
				sc.nextLine();
				
				System.out.println("Enter The Employee ID: ");
				int emp_no = sc.nextInt();
				
				System.out.println("Enter the Employee Salary: ");
				int sal = sc.nextInt();
				
				String str = "insert into employee values (?, ?, ?)";
				PreparedStatement ps = con.prepareStatement(str);
				
				ps.setInt(1,  emp_no);
				ps.setString(2,  ename);
				ps.setInt(3,  sal);
				
				int Result = ps.executeUpdate();
				System.out.println("Result: " + Result);
				
				if(Result > 0)
					System.out.println("Query is Inserted.");
				else
					System.out.println("Query is not Inserted.");
				break;
				
			case 2: 
				
				System.out.println("Enter the Increement: ");
				int inc = sc.nextInt();
				
				System.out.println("Enter the Employee Name: ");
				String ename1 = sc.nextLine();
				sc.nextLine();
				
				String str1 = "update employee set sal = sal + ? where enmae = ?";
				PreparedStatement ps1 = con.prepareStatement(str1);
				
				ps1.setInt(1, inc);
				ps1.setString(2, ename1);
				
				int Result1 = ps1.executeUpdate();
				System.out.println("Result: " + Result1);
				if(Result1 > 0) 
					System.out.println("Query is Updated.");
				else 
					System.out.println("Query is not Updated.");
				break;
				
				
			case 3:
				
				System.out.println("Enter the Employee name you want to Delete: ");
				String ename2 = sc.nextLine();
				sc.nextLine();
				
				String str2 = "delete from employee where ename = ?";
				PreparedStatement ps2 = con.prepareStatement(str2);
				
				ps2.setString(1, ename2);
				int Result2 = ps2.executeUpdate();
				System.out.println("Result: " + Result2);
				
				if(Result2 > 0) 
					System.out.println("Query is Deleted.");
				else
					System.out.println("Query is not Deleted.");
				break;
				
			case 4: 
				
				Statement stmt = con.createStatement();
				String str3 = "select * from employee";
				ResultSet rs = stmt.executeQuery(str3);
				
				while(rs.next()) {
					System.out.println("Employee ID: " + rs.getInt(1));
					System.out.println("Employee Name: " + rs.getString(2));
					System.out.println("Employee Salary: " + rs.getInt(3));
					System.out.println("--------------------------------");
				}
				
				break;
				
			default:
				System.out.println("enter a valid choice.");
				break;
		}
			
	}

}
