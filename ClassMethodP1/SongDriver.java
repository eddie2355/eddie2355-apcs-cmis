public class SongDriver
{
    public static void main ( String[] args )
    {
       Song song1 = new Song();
       
       int year = song1.getYearReleased();
       song1.setYearReleased( year );
       
       System.out.println( song1 );
       System.out.println( song1.convertToMinSec() );
       
       
        
       Song song2 = new Song(2000000, "Juan Bovi", false, 2012, 321);
   
       System.out.println( "\n\n" );
       System.out.println( song2 );
       System.out.println( song2.convertToMinSec() );
    }
}

