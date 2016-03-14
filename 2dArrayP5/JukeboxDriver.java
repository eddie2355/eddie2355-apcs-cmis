public class JukeboxDriver
{
    public static void main(String[] args)
    {
        Jukebox Playlist = new Jukebox();
        System.out.println(Playlist);
        System.out.println("Song: " + Playlist.randomSong());
        System.out.println("Songs with a rating of 5:\n " + Playlist.playSongWithRating(5) + "\n");
    }
}
