public class Song
{
    private int downloads;
    private String artist;
    private boolean isItPlaying;
    private int yearReleased;
    public Song()
        {
            downloads = 1000000;
            artist = "Jon Bovi";
            isItPlaying = true ;
            yearReleased = 1990;
        }
    
    public int getYearReleased()
        {
            return yearReleased;
        }
    
    public void setYearReleased( int year)
        {
            this.yearReleased = year;
        }
        
    public Song(int downloads, String artist, boolean isItPlaying, int yearReleased)
        {
            this.downloads = downloads;
            this.artist = new String( artist );
            this.isItPlaying = isItPlaying;
            this.yearReleased = yearReleased;
        }
    
    public String toString()
        {
            String output = new String();
            output = ("This song has " + downloads + " downloads." + "\n" +
                     "The artist is " + artist + "." + "\n" +
                     "Is the song playing? " + isItPlaying + "\n" +
                     "Year Released: " + yearReleased);
            return output;
        }
        
}
