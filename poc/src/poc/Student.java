package poc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.io.*;

public class Student {
	public static void main(String[] args) throws Exception {
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;

		String dbUrl = "jdbc:mysql://localhost:3306/poc";
		String user = "student";
		String pass = "student";
		try {
			myConn = DriverManager.getConnection(dbUrl, user, pass);
			myStmt = myConn.createStatement();
//
//			String sql = "CREATE TABLE Student " + "(studentid INTEGER not NULL, "
//					+ " firstname VARCHAR(255)," + " lastname VARCHAR(255)," + " departmentid INTEGER," +" joiningDate Date,"+" studentDob Date,"+"mobilenumber BIGINT,"+"email varchar(45),"+ " PRIMARY KEY ( studentid,joiningdate ))";
//			myStmt.executeUpdate(sql);

		
			System.out.println("Created table in given database...");
			
			
			 System.out.println("Inserting records into the table...");          
	         String sql = "INSERT INTO Student VALUES (1,'Raj','Kumar',1,'2021-10-02','1998-01-19',9042397347,'rajkumar.mariyappan@perficient.com')";
	         myStmt.executeUpdate(sql);
	         sql = "INSERT INTO Student VALUES (2,'Naveen','Kumar',1,'2021-10-02','1998-01-21',1111112345,'naveenkumar@gmail.com')";
	         myStmt.executeUpdate(sql);
	         sql = "INSERT INTO Student VALUES (3,'Nirmal','Kumar',1,'2021-10-02','1998-01-22',22222234567,'nirmalkumar@gmail.com')";
	         myStmt.executeUpdate(sql);
	         
	         System.out.println("Inserted records into the table..."); 
		} catch (Exception e) {
			e.printStackTrace();
		}
finally {
			
			if (myStmt != null) {
				myStmt.close();
			}

			if (myConn != null) {
				myConn.close();
			}
		}

	}

}
