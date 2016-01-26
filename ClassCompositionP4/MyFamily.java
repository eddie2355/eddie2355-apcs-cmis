import java.util.ArrayList;
public class MyFamily
{
   public static void main (String[] args)
   {
      ArrayList<String> names = new ArrayList<String>();
      
      names.add( "Eddie" );
      names.add( "Ed" );
      names.add( "Stephanie" );
      names.add( "Norma" );
      names.add( "Alexsandra" );
      names.add( "Joaquin" );
      names.add( "Helena" );
      
      System.out.println( "printing with for loop");
      for(int i = 0; i < names.size(); i++)
      {
          System.out.println( names.get( i ) );
      }
      
      System.out.println( "\nThe size of the array list is " + names.size() + "\n" );
      
      System.out.println( "printing with for each loop now");
      for( String s : names)
      {
          System.out.println( s );
      }
      
   }
  
}
