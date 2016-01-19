public class Clock
{
    private int hour;
    private int minute;
    private int second;
    
    public Clock()
        {
            hour = 12;
            minute = 34;
            second = 56;
        }
    
    public Clock(int hour, int minute, int second)
        {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
    
    public int totalSeconds()
        {
            int seconds = 0;
            seconds = (hour * 3600) + (minute * 60) + second;
            return seconds;
        }    
        
    public String toString()
        {
            String output = String.format("The time on this clock: %02d:%02d:%02d", hour, minute, second);
            return output;
        }
        
    
}
