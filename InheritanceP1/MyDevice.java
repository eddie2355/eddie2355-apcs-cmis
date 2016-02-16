public abstract class MyDevice
{
    private int age;
    private String color;
    public MyDevice()
    {
        age = 9;
        color = "red";
    }
    
    public MyDevice(int age, String color)
    {
        this.age = age;
        this.color = new String(color);
    }
    
    public String toString()
    {
        String output = new String("Year()s in use: " + age +
                                   "\nColor: " + color);
        return output;                           
    }
}
