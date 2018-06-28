import java.util.*;
import java.sql.*;

public class Bill {
	static int billNo=101;
	String custName;
	int total;

	public Bill()
	{
	}
	public Bill(int billNo, String custName,int total)
	{
		this.billNo=billNo;
		this.custName=custName;
		this.total=total;
	}

	String[] items= new String[25];
	public int getBillNo() {
		return billNo;
	}
	public void setBillNo(int billNo) {
		this.billNo = billNo;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}

	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public String[] getItems() {
		return items;
	}
	public void setItems(String[] items) {
		this.items = items;
	}
	
	
	public void generateBill(int number,int totalCost,List<Pizza> stack) throws ClassNotFoundException, SQLException
	{
		
		CreateConnection dbcon = new CreateConnection();
		Connection con = dbcon.open();
		PreparedStatement stmt = con.prepareStatement("Select * from customer where phone=?");
		stmt.setInt(1,number);
		ResultSet rset = stmt.executeQuery();
		if(rset.next())
		{
	 	System.out.println("Bill No:"+billNo);
		System.out.println("Customer Name: "+rset.getString("cname"));
		System.out.println("Customer Number:"+number);
		System.out.println("Order Details:\n");
		System.out.println("_________________");
		}
		for(Pizza runner : stack)
		{
		PreparedStatement stmt2 = con.prepareStatement("Select * from menu where pizza_index=?");
		stmt2.setInt(1,runner.pizza_index);
		ResultSet rset2=stmt.executeQuery();
		while(rset2.next())
		{
			System.out.println(rset2.getString("pname")+" "+rset2.getString("ptype")+" "+rset2.getInt("cost"));
			System.out.println(runner.topping);
		}
		System.out.println("\nTotalCost: "+totalCost);
		}
	}

}
