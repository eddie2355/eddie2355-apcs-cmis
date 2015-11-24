public class Student
{
    private int grade;
    private double gpa;
    private String firstName;
    private String lastName;
    private double grades[] = new double[5];
    
    public Student()
        {
            grade = 12;
            gpa = 9001.0;
            firstName = "Eddie";
            lastName = "Awesome";
            double grades[] = {0.0, 0.0, 0.0, 0.0, 0.0};
        }
    
    public Student(int grade, double gpa, String firstName, String lastName, double[] grades)
        {
            this.grade = grade;
            this.gpa = gpa;
            this.firstName = new String( firstName);
            this.lastName = new String( lastName );
            this.grades = new double[5];
        }
    
    public void setGPA(double english, double math, double science, double fineArt, double socialScience)
        {
            this.grades = new double[] {english, math, science, fineArt, socialScience};
        }
    
    public double calcGPA(double[] grades)
        {
            double sumGPA = 0;
            for (int i = 0; i<5;i++)
                {
                    sumGPA += grades[i];
                }
            double GPA = sumGPA / 5;
            return GPA;
        }
        
    public String toString()
        {
            String output = String.format("Student Info: " + "\n" +
                                          "Name: " + firstName + " " + lastName + "\n" +
                                          "Grade: " + grade);
            return output;
        }
        
    
}
