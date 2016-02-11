public class Person
{
    private String name;
    private String birthDate;
    
    public Person(String name, int yob, int mob, int dob)
    {
        this.name = name;
        this.birthDate = new String(yob + "/" + mob + "/" + dob);
    }

    public String toString()
    {
        return String.format("Name: %s\nDOB: %s", name, birthDate);
    }
}
