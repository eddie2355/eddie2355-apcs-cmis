import javax.swing.JOptionPane;
public class SongDriver
{
    public static void main ( String[] args )
    {
       Song song1 = new Song();
       
       song1.setYearReleased( 2000 );
       System.out.print( song1 );
       System.out.print( song1.convertToMinSec() );
       
       
       String nnum = JOptionPane.showInputDialog ("Give me a realistic song time in seconds please....dont be annoying....yeah YOU");
       int seconds = Integer.parseInt(nnum);
       int minutes = 0;
       String time = "";
       while( seconds > 60 )
           {
              seconds = seconds - 60;
              minutes++;      
           }
       time = (minutes + " minutes and " + seconds + " seconds long.");       
       Song song2 = new Song(2000000, "Juan Bovi", false, 2012, time);
       
       System.out.println( "\n\n" );
       System.out.println( song2 );
       
    }
}

