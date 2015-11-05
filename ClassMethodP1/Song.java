public class Song
{
    private int downloads;
    private String artist;
    private boolean isItPlaying;
    private int yearReleased;
    private int songTime;
    private String time;
    public Song()
        {
            downloads = 1000000;
            artist = "Jon Bovi";
            isItPlaying = true ;
            yearReleased = 1990;
            songTime = 210;
            
        }
    
    public int getYearReleased()
        {
            return yearReleased;
        }
    
    public void setYearReleased( int year)
        {
            this.yearReleased = year;
        }
        
    public String convertToMinSec()
        {
           String time = "";
           int seconds = this.songTime;
           int minutes = 0;
           while( seconds > 60 )
               {
                   seconds = seconds - 60;
                   minutes++;      
                }
           time = ("This song is " + minutes + " minutes and " + seconds + " seconds long."); 
           return time;
        }
        
    public Song(int downloads, String artist, boolean isItPlaying, int yearReleased, int songTime)
        {
            this.downloads = downloads;
            this.artist = new String( artist );
            this.isItPlaying = isItPlaying;
            this.yearReleased = yearReleased;
            this.songTime = songTime;
        }
    
    public String toString()
        {
            String output = new String();
            output = ("This song has " + downloads + " downloads." + "\n" +
                     "The artist is " + artist + "." + "\n" +
                     "Is the song playing? " + isItPlaying + "\n" +
                     "Year Released: " + yearReleased );
            return output;
        }
        
}
