public class StudentDriver
{
    public static void main ( String[] args )
    {
       Student senior001 = new Student();
       Student  junior001 = new Student(11, 1.9,"Rachel", "Lame" , " ");
       
       System.out.println( senior001 );
       System.out.println( junior001 );
    }
}
