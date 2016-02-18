public class Plasma extends Television
{
    public Plasma()
    {
        super();
    }
    
    public Plasma(String model, double price)
    {
        super(model,price);
    }
    
    public String toString()
    {
        String output = new String( super.toString());
        return output;
    }
}
