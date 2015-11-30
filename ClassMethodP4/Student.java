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
    
    /*public String getGrade()
        {
            if( calcGPA <= 4)
                {
                    grade = "A";
                }
            else if( grade <= 4 && grade >=3)
                {
                    grade = "B";
                }
            else if( grade <= 3 && grade >=2)
                {
                    grade = "C";
                }
            else if( grade <= 2 && grade >=1)
                {
                    grade = "D";
                }
            else
                {
                    grade = "F";
                }
        }*/
        
    public String toString()
        {
            String output = String.format("Student Info: " + "\n" +
                                          "Name: " + firstName + " " + lastName + "\n" +
                                          "GPA: %.2f", calcGPA() + 
                                          "Overall grade: " + grade);
            return output;
        }
        
    
}
