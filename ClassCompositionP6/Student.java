public class Student
{
    private int grade;
    private String firstName;
    private String lastName;
    private double grades[];
    
    public Student()
        {
            grade = 11;
            firstName = "Rachel";
            lastName = "Lame";
            grades = new double[] {0.0, 0.0, 0.0, 0.0, 0.0};
        }
    
    public Student(int grade, String firstName, String lastName, double[] grades )
        {
            this.grade = grade;
            this.firstName = new String( firstName);
            this.lastName = new String( lastName );
            this.grades = grades;
        }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public double calcGPA()
        {
            double sumGPA = 0;
            for (int i = 0; i<5;i++)
                {
                    sumGPA += grades[i];
                }
            double GPA = sumGPA / grades.length;
            
            return GPA;
        }
        
    public String toString()
        {
            String output = String.format("Student Info: " + "\n" +
                                          "Name: " + firstName + " " + lastName + "\n" +
                                          "Grade: " + grade + "\n" +
                                          "GPA: %.2f \n", calcGPA());
            return output;
        }
        
    
}
