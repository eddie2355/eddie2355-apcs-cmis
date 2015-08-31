import java.util.Scanner;

public class FundamentalsP9
{
   
    public static void main ( String[] args )
    {
        String username = "Awesome";
        int password = 1997 ;
        System.out.println("username is Awesome and password is 1997");
        System.out.println( "Username: " );
        Scanner input1 = new Scanner( System.in );
        String user = input1.nextLine();
      
        
        System.out.println( "Password: " );
        Scanner input2 = new Scanner( System.in );
        int pass = input2.nextInt();
        
        //the code above defines what my set login credentials and asks for the input of the user
        //to match the set log in credentials.
        
        if( user.equals( username) && pass == password)
        {
            System.out.println("Login Successful");
        }
        else
        {
            System.out.println("Login Unsuccessful");
        }
     // th
    }
}
