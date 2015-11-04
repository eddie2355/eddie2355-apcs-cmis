import javax.swing.JOptionPane;
public class Song
{
    private int downloads;
    private String artist;
    private boolean isItPlaying;
    private int yearReleased;
    private String songTime;
    private String time;
    public Song()
        {
            downloads = 1000000;
            artist = "Jon Bovi";
            isItPlaying = true ;
            yearReleased = 1990;
            songTime = "";
            
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
           String time = this.songTime;
           String nnum = JOptionPane.showInputDialog ("Give me a realistic song time in seconds please....dont be annoying....yeah YOU");
           int seconds = Integer.parseInt(nnum);
           int minutes = 0;
           while( seconds > 60 )
               {
                   seconds = seconds - 60;
                   minutes++;      
                }
           time = (minutes + " minutes and " + seconds + " seconds long."); 
           return time;
        }
        
    public Song(int downloads, String artist, boolean isItPlaying, int yearReleased, String songTime)
        {
            this.downloads = downloads;
            this.artist = new String( artist );
            this.isItPlaying = isItPlaying;
            this.yearReleased = yearReleased;
            this.songTime = new String( songTime );
        }
    
    public String toString()
        {
            String output = new String();
            output = ("This song has " + downloads + " downloads." + "\n" +
                     "The artist is " + artist + "." + "\n" +
                     "Is the song playing? " + isItPlaying + "\n" +
                     "Year Released: " + yearReleased + "\n" +
                     "This song is " + songTime);
            return output;
        }
        
}
