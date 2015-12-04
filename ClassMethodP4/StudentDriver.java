public class StudentDriver
{
    public static void main ( String[] args )
    {
       double english = 4.0;
       double math = 4.0;
       double science = 3.5;
       double fineArt = 4.0;
       double socialScience = 4.0;
       Student senior001 = new Student();
       
       double[] grades = new double[] {english, math, science, fineArt, socialScience};
       Student  junior001 = new Student("Joe", "Senior", grades);
       
       System.out.println( "\n" + junior001 );
       
       junior001.setGPA(4.0,4.0,4.0,4.0,4.0);
       
       System.out.println( "\n" + junior001 + "\n" );
       
       System.out.println( senior001 + "\n" );              
       
       senior001.getGrade();
    }
}
