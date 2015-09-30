public class Song
{
    private int downloads;
    private String artist;
    private boolean isItPlaying;
    
    public Song()
        {
            downloads = 1000000;
            artist = "Jon Bovi";
            isItPlaying = true ;
        }
    
    public Song(int downloads, String artist, boolean isItPlaying)
        {
            this.downloads = downloads;
            this.artist = new String( artist );
            this.isItPlaying = isItPlaying;
        }
    
    public String toString()
        {
            String output = new String();
            output = ("This song has " + downloads + " downloads." + "\n" +
                     "The artist is " + artist + "." + "\n" +
                     "Is the song playing? " + isItPlaying );
            return output;
        }
        
    
}