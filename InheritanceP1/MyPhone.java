public class MyPhone extends MyDevice
{
    private boolean callInc;
    
    public MyPhone()
    {
        super();
        callInc = true;
    }
    
    public MyPhone(int age, String color, boolean callInc)
    {
        super(age, color);
        this.callInc = callInc;
    }
    
    public boolean getCallInc()
    {
        return callInc;
    }
    
    public void setCallInc()
    {
        this.callInc = callInc;
    }
    
    public String toString()
    {
        String output = new String(super.toString() + "\n");
        if(getCallInc())
        {
            output+= "The phone is on.";
        }
        else 
        {
            output+= "The phone is not on.";
        }
        return output;
    }
}
