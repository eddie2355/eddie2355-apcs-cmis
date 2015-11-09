public class ClockDriver
{
    public static void main ( String[] args )
    {
       Clock kitchenClock = new Clock();
       Clock bedroomClock = new Clock(17, 1, 22, "falling back");
       
       kitchenClock.setTime(11, 34, 56);
       System.out.println( kitchenClock );
       System.out.println("Wait that can't be right. Did we take day light savings time into consideration?" + "\n"+
                          "hmmmmmmmm, lets check.");
       kitchenClock.convertDayLightSaving();
       System.out.println( kitchenClock );
       System.out.println("Nope we didn't. ( *glares at Phil* ) PHIL YOU HAD ONE JOB!!! GO FIX THE OTHER CLOCK \n\n");
       
       System.out.println("So did you fix it Phil? ... lets see.");
       System.out.println( bedroomClock );
       System.out.println("PHIL DID YOU EVEN CHANGE IT???!!! PHIL STOP PLAYING GALAGA FOR PETE'S SAKE");
       System.out.println("Pete: PLEASE PHIL!!!!!");
       bedroomClock.convertDayLightSaving();
       System.out.println( bedroomClock );
       System.out.println("You are SOOOO( * dramatic pause * ) FIRED PHIL!\n\n");
       
       
    }
}