public class BillReport
{
  public static int index=0;

  private Bill bills[]=new Bill[100];

  public void addBill(Bill b)
  {
	bills[index]=new Bill();
	bills[index]=b;
	index++;
  }
  public boolean updateBill(int billNo,int new_total)
  {
	  return false;
  }

  public Bill searchBill(int billNo)
  {
	  return bills[0];
  }

  public Bill[] getBills()
  {
	  return bills;
  }
}

