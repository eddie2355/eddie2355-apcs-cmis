public class Password
{
    private String password;
    public Password(String password)
    {
        this.password = new String( password );
    }
    
    public boolean checkPasswordLength(String password)
    {
        this.password = new String(password);
        boolean correctLength;
        if(password.substring(5,6).equals(null))
            {
                correctLength = false;
            }
        else
            {
                correctLength = true;
            }
        return correctLength;
    }
    
    
    
    /*public String toString()
        {
            String output = String.format();
            return output;
        }*/
}
