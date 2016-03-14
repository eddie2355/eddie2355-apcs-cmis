public class PostGrad extends Student
{
    public PostGrad(String name, String major, int units)
    {
        super(name, major, units);
    }
    
    public int calculateTuition(int units)
    {
        int tuition = units * 750;       
        return tuition;
    }
}
