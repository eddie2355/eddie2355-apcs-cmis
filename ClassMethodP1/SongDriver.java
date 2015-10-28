public class SongDriver
{
    public static void main ( String[] args )
    {
       Song song1 = new Song();
       Song song2 = new Song(2000000, "Juan Bovi", false);
       
       System.out.println( song1 );
       System.out.println( song2 );
    }
}

