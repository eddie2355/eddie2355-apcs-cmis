public class LED extends Television
{
    public LED()
    {
        super();
    }
    
    public LED(String model, double price)
    {
        super(model,price);
    }
    
    public String toString()
    {
        String output = new String( super.toString());
        return output;
    }
}
