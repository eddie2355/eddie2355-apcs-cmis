public class Clock
{
    private int hour;
    private int minute;
    private int second;
    private String saveOrNot;
    public Clock()
        {
            hour = 12;
            minute = 34;
            second = 56;
            saveOrNot = "springing forward";
        }
    
    public Clock(int hour, int minute, int second, String saveOrNot)
        {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
            this.saveOrNot = new String( saveOrNot );
        }
    
    public void setTime(int hour, int minute, int second)
        {
           this.hour = hour;
           this.minute = minute;
           this.second = second;
        }
    
    public void convertDayLightSaving()
        {
            if (saveOrNot.equals("falling back"))
                {
                    hour = hour - 1;
                }
            else if(saveOrNot.equals("springing forward"))
                {
                    hour = hour + 1;
                }
        }
    
    public int totalSeconds()
        {
            int seconds = 0;
            seconds = (hour * 3600) + (minute * 60) + second;
            return seconds;
        }
        
    public String toString()
        {
            String output = String.format("The time is: %02d:%02d:%02d or in seconds its: " + totalSeconds(), hour, minute, second);
            return output;
        }
        
    
}
