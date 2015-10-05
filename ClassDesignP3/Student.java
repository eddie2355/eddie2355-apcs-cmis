public class Student
{
    private int grade;
    private double gpa;
    private String firstName;
    private String lastName;
    private String dBallZReference;
    public Student()
        {
            grade = 12;
            gpa = 9001.0;
            firstName = "Eddie";
            lastName = "Awesome";
            dBallZReference = "Nappa: What's his GPA Vegeta? \n" +
                              "Vegeta: ITS OVER 9000!!!!! \n" +
                              "Nappa: WHAT? THATS IMPOSSIBLE!!!!!";
        }
    
    public Student(int grade, double gpa, String firstName, String lastName, String dBallZReference)
        {
            this.grade = grade;
            this.gpa = gpa;
            this.firstName = new String( firstName);
            this.lastName = new String( lastName );
            this.dBallZReference = new String( dBallZReference );
        }
    
    public String toString()
        {
            String output = String.format("Student Info: " + "\n" +
                                          "Name: " + firstName + " " + lastName + "\n" +
                                          "Grade: " + grade + "\n" +
                                          "GPA: " + gpa + "\n" +
                                          dBallZReference);
            return output;
        }
        
    
}
