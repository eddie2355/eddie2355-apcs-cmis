public class DLP extends Television
{
    public DLP()
    {
        super();
    }
    
    public DLP(String model, double price)
    {
        super(model,price);
    }
    
    public String toString()
    {
        String output = new String( super.toString());
        return output;
    }
}
