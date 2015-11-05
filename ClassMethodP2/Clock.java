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
    
    public void setTime()
        {
           // String time = new String( hour + ":" + minute + ":" + second);
        }
        
    public String toString()
        {
            String output = String.format("The time is: %02d:%02d:%02d", hour, minute, second);
            return output;
        }
        
    
}
