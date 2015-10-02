public class StudentDriver
{
    public static void main ( String[] args )
    {
       Student kitchenClock = new Student();
       Student bedroomClock = new Student(17, 1, 22);
       
       System.out.println( kitchenClock );
       System.out.println( bedroomClock );
    }
}
