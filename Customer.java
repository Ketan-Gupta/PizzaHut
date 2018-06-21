// Additional comment added to check if fetch is working or not
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
public class Customer{
private static int billNo;
private int custbillNo;
private int custNo;
private String custName;
private String custAddr;

DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
LocalDateTime now = LocalDateTime.now();


	static{
		billNo=101;
	}
	//default constructor
	Customer()
	{
		setCustomer(billNo,0,"Not Available","Not Available");
	}
	//parameterized constructor
	Customer(int x, String y, String z)
	{
		setCustomer(billNo,x, y, z);
	}
	//setters
	public void setCustomer(int custbillNo,int x, String y, String z)
	{
		setcustbillNo(custbillNo);
		setcustNo(x);
		setcustName(y);
		setcustAddr(z);
	}

	public void setcustbillNo(int x)
	{
		custbillNo=x;
	}

		
	public void setcustNo(int x){custNo=x;}
	public void setcustName(String x){custName=x;}
	public void setcustAddr(String x){custAddr=x;}

	//getters
	public int getcustNo(){return custNo;}
	public String getcustName(){return custName;}
	public String getcustAddr(){return custAddr;}
	public int getbillNo() {return billNo;}
	public int getcustbillNo()
	{
	    return custbillNo;
	}

	public void getCustomer()
	{
		System.out.println(getcustbillNo()+"\t\t"+getcustNo() +"\t\t"+getcustName() + "\t\t"+getcustAddr()+"\t\t"+dtf.format(now));
	}

	//Initialization
	
	public void init(Customer C)	
	{
		C.setCustomer(billNo,0,"Not Available","Not Available");
	}
	public void init(Customer C,int billNo,int x, String y, String z)
	{
		C.setCustomer(billNo,x,y,z);
	}
	public void updatebillNo()
	{
		billNo++;
	}
}
