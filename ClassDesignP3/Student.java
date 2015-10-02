public class Student
{
    private int grade;
    private double gpa;
    private String firstName;
    private String lastName;
    public Student()
        {
            grade = 12;
            gpa = 3.4;
            firstName = "Eddie";
            lastName = "Awesome";
        }
    
    public Student(int hour, int minute, int second)
        {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
    
    public String toString()
        {
            String output = String.format("The time is: %02d:%02d:%02d", hour, minute, second);
            return output;
        }
        
    
}
