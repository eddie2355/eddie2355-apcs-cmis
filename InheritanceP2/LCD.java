public class LCD extends Television
{
    public LCD()
    {
        super();
    }
    
    public LCD(String model, double price)
    {
        super(model,price);
    }
    
    public String toString()
    {
        String output = new String( super.toString());
        return output;
    }
}
