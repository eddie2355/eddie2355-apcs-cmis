public abstract class Student
{
    private String name;
    private String major;
    private int unitsTaken;
    
    abstract public int calculateTuition(int units);
    
    public Student(String name, String major, int units)
    {
        this.name = new String(name);
        this.major = new String(major);
        this.unitsTaken = units;
    }
    
    public void setName(String name)
    {
        this.name = new String(name);
    }
    
    public void setMajor(String major)
    {
        this.major = new String(major);
    }
    
    public void setunitsTaken(int units)
    {
        this.unitsTaken = units;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public String getMajor()
    {
        return this.major;
    }
    
    public int getUnitsTaken()
    {
        return this.unitsTaken;
    }
}
