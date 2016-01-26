import java.util.ArrayList;
public class MyPod2
{
   private String color;
   private String memoryCapacity;
   private ArrayList<String> songLibrary = new ArrayList<String>();
   
   public MyPod2()
   {
       color = "Blue";
       memoryCapacity = "6 GB";
       
       songLibrary.add( "Motorhead - Ace of Spades");
       songLibrary.add("Ronnie Radke - Fair Weather Fans");
       songLibrary.add("Queen - Under Pressure ft. David Bowie");
   }//end zero - constructor MyPod
   
   public MyPod2(String color, String memoryCapacity, ArrayList<String> songLibrary)
   {
       this.color = color;
       this.memoryCapacity = memoryCapacity;
       this.songLibrary = songLibrary;
   }//end multi-constructor MyPod
    
   public String toString()
   {
       String songs = new String();
       for(String string : songLibrary)
       {
          songs+= (string + "\n"); 
       }
       String output = String.format("MyPod Stats \n" +
                                     "color : %s \n" +
                                     "memory : %s \n" +
                                     "songs : " + songs ,color, memoryCapacity);
       return output;
   }//end toString method
}// 
