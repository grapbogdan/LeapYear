package LP;
import java.util.Scanner;
public class DaysFebruary {

	public static void main(String[] args) {
		{
	        Scanner in = new Scanner(System.in);

	        System.out.print("Input a year between 1900 and 2016: ");
	        int year = in.nextInt();
	        
	        if (year>1900 & year<2016) {
	        
	        boolean x = (year % 4) == 0;
	        boolean y = (year % 100) != 0;
	        boolean z = ((year % 100 == 0) && (year % 400 == 0));
        
	        	    
	        if	(x && (y || z))
	        {
	            System.out.println(" February, " + year + " had 29 days");
	        }
	        else
	        {
	            System.out.println(" February, " + year + " had 28 days");
	        }
	        }
	        else { 
	        
	        	System.out.println(" I said only between 1900 and 2016");
	        	
	        }
      	        	
	        }
	    }
}
	



