import java.util.Scanner;

public class HelloInput
{
   
    public static void main ( String[] args )
    {
        System.out.println( "Please enter your name." );
        
        Scanner input = new Scanner( System.in );
        String statement = input.nextLine();
        
        System.out.println( "Hello " + statement );
     
    }
}

