import java.util.*;
public class PizzaHut{
	// static- Only one customer will be handled at a time. Concurrency issue solved.
	static int no;
	static String name,address;
	static PizzaHut ph_caller=new PizzaHut();
	static CustomerReport custrepo_caller = new CustomerReport();
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customer No");
		no=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Customer Name");
		name=sc.nextLine();

		System.out.println("Enter Customer Address");
		address=sc.nextLine();

	}
		
	public static void main(String args[])
	{
		CustomerReport temp = new CustomerReport();
		//Tester Objects=5
		for(int i=0;i<2;i++)
		{
		ph_caller.input();
		custrepo_caller.addCustomer(no,name,address);		
		}
		//caller.init(c,no,name,address);
		System.out.println("Customer Details");
		temp.printList();

		//caller.display(c);

	}

}

		
