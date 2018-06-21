 
import java.util.Scanner;

public class CustomerReport{
	
	static int index = 0;
	Customer custList[] = new Customer[100];
	public void addCustomer(int no,String name, String address)
	{
		Customer cust_caller=new Customer();
		custList[index]=new Customer();
		cust_caller.updatebillNo();
		custList[index].setCustomer(cust_caller.getbillNo(),no,name,address);
		index++;
	}

public void printList( )
{
int i=0;
System.out.println("BillNo:\t\tCustNo\t\tCust Name\t\t\t\tCust Address\t\tDate:");
System.out.println("_______"+"\t\t"+"______"+"\t\t"+"___________"+"\t\t"+"____________"+"\n");
while(custList[i]!=null)
{
	custList[i].getCustomer();
	i++;
}
}
}
