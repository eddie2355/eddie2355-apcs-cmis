public class UnderGrad extends Student
{
    public UnderGrad(String name, String major, int units)
    {
        super(name, major, units);
    }
    
    public int calculateTuition(int units)
    {
        int tuition = units * 250;
        return tuition;
    }
}
