import java.util.*;
public class PizzaHut{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int no;
		String name,address;
		System.out.println("Enter Customer No");
		no=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Customer Name");
		name=sc.nextLine();

		System.out.println("Enter Customer Address");
		address=sc.nextLine();

		Customer caller=new Customer();
		Customer c = new Customer();

		caller.init(c,no,name,address);
		System.out.println("Customer Details");

		caller.display(c);

	}
}

		
