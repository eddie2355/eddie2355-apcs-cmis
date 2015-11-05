public class ClockDriver
{
    public static void main ( String[] args )
    {
       Clock kitchenClock = new Clock();
       Clock bedroomClock = new Clock(17, 1, 22);
       
       //System.out.println(kitchenClock.setTime());
       
       System.out.println( kitchenClock );
       System.out.println( bedroomClock );
    }
}