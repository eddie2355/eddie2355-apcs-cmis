public class ClockStoreApp
{
    public static void main (String[] args)
    {
        ClockStore store1 = new ClockStore();
        System.out.println( "The clock with the most seconds is the number " + (store1.mostSeconds() + 1) + " clock." );
        
        System.out.println("\n" + store1);
    }
}
