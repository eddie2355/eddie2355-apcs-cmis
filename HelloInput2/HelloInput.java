import java.util.Scanner;

public class HelloInput
{
   
    public static void main ( String[] args )
    {
        System.out.println( "Please enter your name." );
        
        Scanner input = new Scanner( System.in );
        String statement = input.nextLine();
        
        System.out.println( "Please enter your age." );
        
       
        String age = input.nextLine();
        
        
        System.out.println( "Hello " + statement + ", you are " + age + " years old.");
     
    }
}
