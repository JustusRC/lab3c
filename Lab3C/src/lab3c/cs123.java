package lab3c;
import java.util.Scanner ;

public class cs123 {

	public static void main(String[] args) {
		// Variable declaration
		double me ; //monthly earnings
		 
		Scanner sam = new Scanner(System.in);
		
		// Prompt for user input
		
		System.out.print("Enter the salesperson's monthly earnings: ");
	       me=sam.nextDouble();
	    
	    // Nested If-else
	       
	       if (me > 9001)
			{
	    	   System.out.print("The bonus pay is: " +me*.078);
			}
	       else if (me > 4201) 
			{
	    	   System.out.print("The bonus pay is: " +me*.062);
			}
	       else 
			{
	    	   System.out.print("The bonus pay is: " +me*.055);
			}
	     
	        
	}

}
