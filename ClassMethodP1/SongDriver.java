public class SongDriver
{
    public static void main ( String[] args )
    {
       Song song1 = new Song();
       Song song2 = new Song(2000000, "Juan Bovi", false, 1222);
       
       song1.setYearReleased( 2000 );
      
       System.out.println( song1 );
       System.out.println( "\n\n" );
       System.out.println( song2 );
       
    }
}

