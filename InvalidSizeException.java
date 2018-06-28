import java.util.*;
import java.lang.*;

public class InvalidSizeException 
{
public static void checkSize(String s1) throws InvalidPizzaSizeException 
{
   try{
         if(!("Regular".equalsIgnoreCase(s1) || "Medium".equalsIgnoreCase(s1))){
               throw new InvalidPizzaSizeException(s1); 
                   }
     }
          
   catch(InvalidPizzaSizeException e)
       {
        System.out.print("Error: ");
       }
}
}

/*
public static void main(String args[]) throws InvalidPizzaSizeException
	{
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Pizza Size:- ");
		String s1=s.next();
		checkSize(s1);
	}
}
*/



		
		
