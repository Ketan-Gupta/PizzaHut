
import java.util.Scanner;
public class CustomerReport {
	
	static int index = 0;
	static Customer custList[] = new Customer[100];

	public void addCustomer(int no,String name, String address)
	{
		custList[index]=new Customer();
		custList[index].setCustomer(no,name,address);
		index++;
	}

public void printList( )
{
int i=0;
System.out.println("CustNo\t\tCust Name\t\tCust Address");
System.out.println("______"+"\t\t"+"___________"+"\t\t"+"____________"+"\n");
while(custList[i]!=null)
{
	custList[i].getCustomer();
	i++;
}
}
}
