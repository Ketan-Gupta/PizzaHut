import java.sql.*;
//Create and Close Connection to Database
public class CreateConnection 
{
	public Connection open() throws ClassNotFoundException, SQLException
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// System.out.println("Driver Registered Successfully");
		
		Connection dbcon = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","PizzaHut","PizzaHut");
		// System.out.println("Connection Established Successfully");

		return dbcon;
	}

	public void close(Connection dbcon) throws ClassNotFoundException, SQLException
	{
		dbcon.close();
	}
}

