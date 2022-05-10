package JDBC.Practice;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;
	
public class ExecuteQueryTest {
	
	@Test
	public void executeQueryTest()
	{
		
		Connection con=null;
		try {
			Driver dref=new Driver();
			DriverManager.registerDriver(dref);
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","root");
			Statement s= con.createStatement();
			ResultSet result=s.executeQuery("select from students_info;");
			while(result.next()) {
				System.out.println("result.getstring(1)"+"result.getstring(2)");
				
			}
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			con.close();
			
			
			
		}
	}
	
	

}
