import java.util.Scanner;

public class FundamentalsP2
{
   
    public static void main ( String[] args )
    {
        Scanner input = new Scanner( System.in );
        
        System.out.println( "Please assign a number to variable 'a'." );
        int a = input.nextInt();
        
        System.out.println( "Now please assign a number to variable 'b'." );
        int b = input.nextInt();
        
        if (a < b) { System.out.println( "The value of 'a' is " + a + " and it is less than 'b' whose value is " + b );
        }
        
        if (a > b) { System.out.println( "The value of 'a' is " + a + " and it is greater than 'b' whose value is " + b );
        }
        
        if (a == b) { System.out.println( "The value of 'a' is " + a + " and it is equal to 'b' whose value is " + b );
        }
    }
    //this block asks for two numbers then outputs the whether or not the first number is
    //greater than, less than, or equal to the second number using if loops.
}

