import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class Reports {
public static void main(String[] args) {
	
	Scanner s= new Scanner(System.in);
	int billNo;
	String custName;
	Date date;
	int total;
	int no_of_items;
	String[] items= new String[25];
	
	
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd//mm/yyyy");
	LocalDateTime now = LocalDateTime.now();
	
	
	
	
	System.out.println("enter the bill no");
	billNo = s.nextInt();
	System.out.println("enter the customer name");
	custName=s.next();
	
	System.out.println("enter the total");
	total=s.nextInt();
	
	
	
	System.out.println("enter the no. items");
	no_of_items=s.nextInt();
	for(int i=0;i<no_of_items;i++)
	{	
	items[i]=s.next();
	}

	Bill b = new Bill(billNo, custName,dtf.format(now), no_of_items);

}
}
