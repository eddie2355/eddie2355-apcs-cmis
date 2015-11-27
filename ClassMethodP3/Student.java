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
    
    public Student(int grade, String firstName, String lastName, double[] grades)
        {
            this.grade = grade;
            this.firstName = new String( firstName);
            this.lastName = new String( lastName );
            this.grades = grades;
        }
    
    public void setGPA(double english, double math, double science, double fineArt, double socialScience )
        {
            this.grades[0] = english;
            this.grades[1] = math;
            this.grades[2] = science;
            this.grades[3] = fineArt;
            this.grades[4] = socialScience;
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
                                          "Grade: " + grade);
            return output;
        }
        
    
}
