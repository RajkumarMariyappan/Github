package poctoday;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.io.*;

public class DeleteToday {
	public static void main(String[] args) {
		try {
//Class.forName("com.mysql.jdbc.Driver");
			String dbUrl = "jdbc:mysql://localhost:3306/poctoday";
			String user = "student";
			String pass = "student";

			Connection myConn = null;

			Connection conn = DriverManager.getConnection(dbUrl, user, pass);
			ResultSet myRs = null;
			Statement Stmnt1 = conn.createStatement();
			FileInputStream f = new FileInputStream(
					"C:\\Users\\rajkumar.mariyappan\\eclipse-workspace\\poctoday\\bin\\deletestudent.txt");
			DataInputStream in = new DataInputStream(f);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine;
			ArrayList list = new ArrayList();
			while ((strLine = br.readLine()) != null) {
				list.add(strLine);
			}
			// System.out.println(list);
			Iterator itr;
			for (itr = list.iterator(); itr.hasNext();) {
				myRs = Stmnt1.executeQuery("select * from studenttoday");
//		    	 while(myRs.next()){
//			            if(list.equals(myRs.getString("studentid"))){
//			            	String sql = "DELETE FROM studenttoday " +
//			                        WHERE studentid = list;
//			            	Stmnt1.executeUpdate(sql);
//			            }
//			            
//			            }
				// int a=35;

				String sql = "DELETE FROM studentToday " + "WHERE studentid = 35";
				Stmnt1.executeUpdate(sql);
				String sql1 = "DELETE FROM studentToday " + "WHERE studentid = 45";
				Stmnt1.executeUpdate(sql1);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
