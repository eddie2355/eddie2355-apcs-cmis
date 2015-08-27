public class FundamentalsP8
{
   public static void main( String [] args)
   {
String[] musicArray = new String[3];
musicArray[0] = "Iron Maiden" ;
musicArray[1] = "Metallica";
musicArray[2] = "A.F.I";
int deleter= (int) (Math.random() * (3) ) ;

for (int index = 0; index < 1 ; index++ ) 
{
    System.out.println("My favorite music artists are: " + musicArray[0] + ", " 
    + musicArray[1] + ", and " + musicArray[2] + ".");  
}
//This for loop prints the values of my array
 if ( deleter == 0 )
    {
       musicArray[0] = musicArray[0].replace("Iron Maiden" , "Michael Jackson");
       
    }
    
     else if ( deleter == 1 )
    {
       musicArray[1] = musicArray[1].replace("Metallica" , "Michael Jackson");
       
    }
    
     else if ( deleter == 2 )
    {
       musicArray[2] = musicArray[2].replace("A.F.I" , "Michael Jackson"); 
      
    }  
    // these if and else if loops replaces a certain index in my musicArray with 
    //Michael jackson, depending on what deleter value is randomly generated and what 
    //index value it corresponds to.
 for (int index = 0; index < 1; index++)
 {
     
    System.out.println("My new favorite music artists are: " + musicArray[0] + ", " 
    + musicArray[1] + ", and " + musicArray[2] + ".");  
}
//this for loop prints out my new musicArray to show that Michael Jackson has now
//replaced one of my favorite music artists
for (int index = 0; index < 1; index++)
{
 if( musicArray[0].equals("Michael Jackson"))
 {
     System.out.println(" We found Michael!");
     System.out.println(" No Michael in musicArray[1]");
     System.out.println(" No Michael in musicArray[2]");
    }
    
   else if( musicArray[1].equals("Michael Jackson"))
 {
     System.out.println(" No Michael in musicArray[0]");
     System.out.println(" We found Michael!");
     System.out.println(" No Michael in musicArray[2]");
    }
    
     else if( musicArray[2].equals("Michael Jackson"))
 {
     System.out.println(" No Michael in musicArray[0]");
     System.out.println(" No Michael in musicArray[1]");
     System.out.println(" We found Michael!");
    }
    //These if and else if loops print out where Michael Jackson is located based on
    //whether or not the index number corresponds with having Michael Jackson it it. 
}
    }
  
} 

