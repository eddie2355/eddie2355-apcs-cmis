import java.util.Scanner;

public class FundamentalsP1
{
   
    public static void main ( String[] args )
    {
        Scanner input = new Scanner( System.in );
        
        System.out.println( "Please enter your favorite food." );
        String food = input.nextLine();
        
        System.out.println( "Please enter your favorite color." );
        String color = input.nextLine();
        
        System.out.println( "Please enter your favorite movie." );
        String movie = input.nextLine();
       
        System.out.println( "Please enter your favorite Music group." );
        String music = input.nextLine();
        
        
        System.out.println( "Your favortite food, color, movie, and music group are:");
        System.out.println( food );
        System.out.println( color );
        System.out.println( movie );
        System.out.println( music );
     
    }
}
