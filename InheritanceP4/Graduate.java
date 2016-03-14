public class Graduate extends Student
{
    public Graduate(String name, String major, int units)
    {
        super(name, major, units);
    }
    
    public int calculateTuition(int units)
    {
        int tuition = units * 500;        
        return tuition;
    }
}
