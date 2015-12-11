public class Student
{
    private String grade;
    private String firstName;
    private String lastName;
    private double grades[];
    
    public Student()
        {
            firstName = "Eddie";
            lastName = "Awesome";
            grades = new double[] {0.0, 0.0, 0.0, 0.0, 0.0};
        }
    
    public Student( String firstName, String lastName, double[] grades )
        {
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
    
    public String getGrade()
        {
            if( calcGPA() == 4 )
                {
                    grade = "A";
                }
            else if( calcGPA() < 4 && calcGPA() >=3)
                {
                    grade = "B";
                }
            else if( calcGPA() < 3 && calcGPA() >= 2)
                {
                    grade = "C";
                }
            else if( calcGPA() < 2 && calcGPA() >=1)
                {
                    grade = "D";
                }
            else
                {
                    grade = "F";
                }
            return grade;
        }
        
    public String toString()
        {
            String output = String.format("Student Info: \n" +
                                          "Name: %s %s \n"  +
                                          "GPA: %.2f \n" + 
                                          "Overall grade: %s", firstName, lastName, calcGPA(), getGrade());
            return output;
        }
        
    
}
