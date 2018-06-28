import java.util.*;
import java.sql.*;
public class PizzaHut{
	int number;
	String name,address;
	CustomerReport custrepo_caller = new CustomerReport();

	public PizzaHut(){}

	public int pizza_input()
	{
		PizzaHut local = new PizzaHut();
		int choice=0,final_choice=0;
		System.out.println("Pizza Type: 1.Italian Pizza \n 2.Mexican Pizza");

		switch(choice)
		{
			case 1: if(local.pizza_type_input()==1)
					final_choice=1;
				else
					final_choice=2;
				break;
			
			case 2:if(local.pizza_type_input()==2)
			       		final_choice=3;
				else
					final_choice=4;
				break;
		}
		return final_choice;
	}

	public int pizza_type_input()
	{
		int type_choice=0;
		System.out.println("Pizza Sub-Type: 1. Veg \n 2. Non-Veg");
		return type_choice;
	}

	public String pizza_topping()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Topping Name(1): Chicken, Olive, Onion");
		String topping=sc.next();	
		return topping;
	}

	public String pizza_size()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Pizza Size");
		String size = sc.next();
		return size;
	}

	public boolean check_cust(int number) throws ClassNotFoundException, SQLException
	{
		CreateConnection dbcon = new CreateConnection();
		Connection con = dbcon.open();
		PreparedStatement stmt = con.prepareStatement("Select cname from customer where phone=?");
		stmt.setInt(1,number);
		ResultSet rset = stmt.executeQuery();

		if(!rset.next())
		{
			dbcon.close(con);
			return false;
		}
		return true;
	}


	public PizzaHut cust_input()
	{

		PizzaHut ph_caller=new PizzaHut();
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		System.out.println("Enter Customer Name");
		ph_caller.name=sc.nextLine();

		System.out.println("Enter Customer Address");
		ph_caller.address=sc.nextLine();
		return ph_caller;

	}
		
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
		int pizza_choice;
		char stop='Y';
		String pizza_topping,pizza_size;
		CreateConnection dbcon = new CreateConnection();
		Connection con = dbcon.open();
		Scanner sc = new Scanner(System.in);
		PizzaHut ph_caller=new PizzaHut();
		PizzaHut cust_store = new PizzaHut();
		CustomerReport custrepo_caller = new CustomerReport();
		/*
		for(int i=0;i<2;i++)
		{
		store=ph_caller.cust_input();	
		custrepo_caller.addCustomer(store.no,store.name,store.address);		
		}
		//caller.init(c,no,name,address);
		System.out.println("Customer Details");
		custrepo_caller.printList();
		
		//caller.display(c);
		*/
		
		System.out.println("Welcome to Pizza Hut");
		System.out.println("Enter Mobile Number");

		ph_caller.number=sc.nextInt();
		if(!(ph_caller.check_cust(ph_caller.number)))
		{
		  cust_store=ph_caller.cust_input();
		  PreparedStatement stmt = con.prepareStatement("Insert into Customer values(?,?,?)");
		  stmt.setInt(1,ph_caller.number);
		  stmt.setString(2,ph_caller.name);
		  stmt.setString(3,ph_caller.address);

		  int updated_records=stmt.executeUpdate();
		  System.out.println(updated_records+": Customer Added Successfully");
		  con.close();
		}
		else
		{
	          PreparedStatement stmt = con.prepareStatement("Select * from Customer where phone=?");
  		  stmt.setInt(1,ph_caller.number);
		  ResultSet rset = stmt.executeQuery();
		  System.out.println("Customer Already Exists\n Customer Details:");
		  
		  while(rset.next())
		    {
			    System.out.println("Name:"+rset.getString(2)+"\nNumber:"+rset.getInt(1)+"\nAddress:"+rset.getString(3));
		    }
		  con.close();
		}

		Order order=new Order(ph_caller.number);
	
      		while(stop==('Y'))
		{
		  	
		  System.out.println("Enter Order:");
		  Pizza p = new Pizza(ph_caller.pizza_input(),ph_caller.pizza_topping(),ph_caller.pizza_size());
		  order.addOrder(p);
		  System.out.println("Press Y to continue order");
		  stop=sc.next().charAt(0);	
		// break  

		}

		System.out.println("Placing Order");
		order.place_order();	
		order.getBill();

	}

}

		
