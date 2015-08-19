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
}
