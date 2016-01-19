public class ClockStore
{
    private Clock[] clocksInStock = new Clock[3];
    
    public ClockStore()
    {
       clocksInStock[0] = new Clock(12, 45, 33);
       clocksInStock[1] = new Clock(2, 12, 44);
       clocksInStock[2] = new Clock(7, 45, 9);
    }
    
    public int mostSeconds()
    {
        int mostSeconds = 0;
        for(int i = 0;i<clocksInStock.length;i++)
            {
                if(clocksInStock[i].totalSeconds() > clocksInStock[mostSeconds].totalSeconds())
                    {
                        mostSeconds = i;
                    }
            }
        return mostSeconds;
    }

    public String toString()
    {
        String clocks = new String();
        for(Clock clock : clocksInStock)
            {
                clocks += (clock + "\n");
            }
        String output = String.format(clocks);
        return output;
    }
}
