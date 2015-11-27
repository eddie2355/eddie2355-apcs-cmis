public class StudentDriver
{
    public static void main ( String[] args )
    {
       double english = 2.7;
       double math = 2.7;
       double science = 2.7;
       double fineArt = 4.0;
       double socialScience = 3.3;       
       
       Student senior001 = new Student();
       
       double[] grades = new double[] {english, math, science, fineArt, socialScience};
       Student  junior001 = new Student(11,"Rachel", "Lame", grades );
       //junior001.setGPA(4.0, 4.0, 4.0, 4.0, 2.7);
              
       System.out.println( senior001 + "\n" );       
       System.out.println(junior001.calcGPA());       
       System.out.println( "\n" + junior001 );
    }
}
