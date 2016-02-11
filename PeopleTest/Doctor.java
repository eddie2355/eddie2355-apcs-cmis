public class Doctor extends Person
{
    private String university;
    private boolean gapYear;
    private String pHD;
    public Doctor(String name, int yob, int mob, int dob, String phd, String university)
    {
        super(name, yob, mob, dob);
        this.pHD = phd;
        this.university = university;
    }
    
    public String toString()
    {
        return super.toString() + String.format("\nHas a pHD in " + pHD + " from " + university+".");
    }
}
