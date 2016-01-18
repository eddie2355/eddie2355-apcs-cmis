public class MyPod
{
   private String color;
   private String memoryCapacity;
   private String[] songLibrary;
   
   public MyPod()
   {
       color = "Blue";
       memoryCapacity = "6 GB";
       songLibrary = new String[] {"Motorhead - Ace of Spades" , "Ronnie Radke - Fair Weather Fans" , "Queen - Under Pressure ft. David Bowie"};
   }//end zero - constructor MyPod
   
   public MyPod(String color, String memoryCapacity, String[] songLibrary)
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
}// end class MyPod
