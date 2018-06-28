import java.util.*;
import java.lang.*;

public class InvalidTypeException 
{

public static void checkType(String s1) throws InvalidPizzaTypeException 
{
   try{

         if(!("Veg".equalsIgnoreCase(s1) || "Non-Veg".equalsIgnoreCase(s1))){
               throw new InvalidPizzaTypeException(s1);
                   }
      }

    catch(InvalidPizzaTypeException e)
      {
        System.out.print("Error:");
      }
}
}
/*
public static void main(String args[]) throws InvalidPizzaTypeException
	{
		
		Scanner s=new Scanner(System.in);
S		ystem.out.println("Enter Pizza Type :");
		String s1=s.next();
		checkType(s1);
	}
}

*/



		
		


 
