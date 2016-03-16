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
    
    public int getEnemiesAround()
    {
        return enemiesAround;
    }
    
    public void setGetEnemiesAround()
    {
        this.enemiesAround = enemiesAround;
    }
    
    public String toString()
    {
        String output = new String(super.toString() + "\nRadar says there are " + enemiesAround + " enemies within 50 yards.");
        return output;
    }
}
