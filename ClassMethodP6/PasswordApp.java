import java.util.Scanner;
public class PasswordApp
{
    public static void main ( String[] args )
    {
        boolean ender = false;
        
        Scanner input = new Scanner( System.in );
        System.out.println(" Please create a password that is at least 6 characters long and \n" +
                           " contains at least one of the following: (+, -, *, /, @). Thank you.");
        String password = input.nextLine();
        
        Password maker = new Password(password);
        
        for (int i = 0; ender == true; i++)
        {
            if( maker.checkPasswordLength(password) == true)
                {
                    
                }
                
            else if( maker.checkPasswordLength(password) == false)
                {
                    System.out.println("Sorry but your password was not long enough. Please try again.");
                }
        }
    }
}
