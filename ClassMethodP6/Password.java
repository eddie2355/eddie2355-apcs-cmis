import javax.swing.JOptionPane;
public class Password 
{
      public static void main(String args[]) 
      {
          int counts = 0;
          String Password = JOptionPane.showInputDialog("Create a password with a length of at least 6 characters and at \n" +
                                                         "least one of these characters: +, -, *, /, or @");
          
          for(int i = 0; i < Password.length(); i++)
          {
              
              if (Password.substring(i, i+1).equals("+") || Password.substring(i, i+1).equals("-") || Password.substring(i, i+1).equals("*") || Password.substring(i, i+1).equals("/") || Password.substring(i, i+1).equals("@"))
              {
                  counts += 1;
                }
            }
          
          if (Password.length() >= 6 && counts == 1)
              {
                  System.out.println("Sufficient passcode entered.");
                }
          else
              {
                  System.out.println("Sorry the password entered was not valid.");
                }
          
    }   
}
