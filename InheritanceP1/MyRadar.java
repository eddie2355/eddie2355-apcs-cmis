public class MyRadar extends MyDevice
{
    private int enemiesAround;
    
    public MyRadar()
    {
        super();
        enemiesAround = 5;
    }
    
    public MyRadar(int age, String color, int enemiesAround)
    {
        super(age, color);
        this.enemiesAround = enemiesAround;
    }
    
    public String toString()
    {
        String output = new String(super.toString() + "\nThere are " + enemiesAround + " enemies within 50 yards.");
        return output;
    }
}
