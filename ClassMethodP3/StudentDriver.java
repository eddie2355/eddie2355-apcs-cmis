public class StudentDriver
{
    public static void main ( String[] args )
    {
       double[] grades= new double[] {3.7,3.3,4.0,3.3,3.7};
       Student senior001 = new Student();
       Student  junior001 = new Student(11, 1.9,"Rachel", "Lame",grades );
       
       junior001.setGPA(2.7,2.7,2.7,3.3,2.7);
       
       System.out.println( senior001 + "\n" );
       
       System.out.println(junior001.calcGPA(grades));
       
       System.out.println( "\n" + junior001 );
    }
}
