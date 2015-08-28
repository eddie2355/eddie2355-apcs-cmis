import java.util.Scanner;

public class FundamentalsP9
{
   
    public static void main ( String[] args )
    {
        String username = "Awesome";
        int password = 1997 ;
        
        System.out.println( "Username: " );
        Scanner input1 = new Scanner( System.in );
        String user = input1.nextLine();
      
        
        System.out.println( "Password: " );
        Scanner input2 = new Scanner( System.in );
        int pass = input2.nextInt();
        
        if( user == username)
        {
            System.out.println("Login Successful");
        }
        else
        {
            System.out.println("Login Unsuccessful");
        }
     
    }
}
