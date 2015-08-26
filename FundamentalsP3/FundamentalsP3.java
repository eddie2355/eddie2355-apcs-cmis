import java.util.Scanner;

public class FundamentalsP3
{
   
    public static void main ( String[] args )
    {
        Scanner input = new Scanner( System.in );
        
        System.out.println( "Please enter a number." );
        int num = input.nextInt();
        
        int answer = num % 2;
     
        if (answer == 1) {  System.out.println( num + " is an odd number." ); 
        }else  {System.out.println( num + " is an even number" );
        }
        
     
    }
    //this block asks for a number and then checks whether it is an odd or even number using a if else loop
    // based on whether it has a remainder after being divided by 2.
}
