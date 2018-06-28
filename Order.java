import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime; 
import java.sql.*;

//Order History will be stored in HashMap<Integer,List<Pizza>>
public class Order{



	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	LocalDateTime now = LocalDateTime.now();
	private static int orderNo=1;
	private String orderDate;
	private int cost,number,totalCost;
	List<Pizza> stack= new ArrayList<Pizza>();
	public Order(int number)
	{
		this.number=number;
		orderNo++;
	}

	public void addOrder(Pizza p)
	{
		stack.add(p);
	}

	public void place_order() throws ClassNotFoundException, SQLException
	{
		totalCost=0;
		
		CreateConnection dbcon = new CreateConnection();
		Connection con = dbcon.open();

		for(Pizza runner: stack)
		{
		PreparedStatement stmt = con.prepareStatement("Select * from menu where no=?");
		stmt.setInt(1,runner.pizza_index);
		ResultSet rset = stmt.executeQuery();
		while(rset.next())
		{
			cost=rset.getInt(4);
			totalCost+=cost;
		}
		}
	}


	//generate bill- send List object and total cost with cust mobile number
	
	public void getBill() throws ClassNotFoundException, SQLException
	{
		Bill b = new Bill();
		b.generateBill(number,totalCost,stack);
	}	
		
}

