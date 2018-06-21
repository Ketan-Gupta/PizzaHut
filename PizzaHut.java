import java.util.*;
public class PizzaHut{
	// static- Only one customer will be handled at a time. Concurrency issue solved.
	int no;
	String name,address;
	CustomerReport custrepo_caller = new CustomerReport();
	public PizzaHut input()
	{
		PizzaHut ph_caller=new PizzaHut();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customer No");
		ph_caller.no=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Customer Name");
		ph_caller.name=sc.nextLine();

		System.out.println("Enter Customer Address");
		ph_caller.address=sc.nextLine();
		return ph_caller;

	}
		
	public static void main(String args[])
	{
		PizzaHut ph_caller=new PizzaHut();
		PizzaHut store = new PizzaHut();
		CustomerReport custrepo_caller = new CustomerReport();
		//Tester Objects=5
		for(int i=0;i<2;i++)
		{
		store=ph_caller.input();	
		custrepo_caller.addCustomer(store.no,store.name,store.address);		
		}
		//caller.init(c,no,name,address);
		System.out.println("Customer Details");
		custrepo_caller.printList();

		//caller.display(c);

	}

}

		
