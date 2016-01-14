public class MyPod
{
   private String color;
   private String memoryCapacity;
   private String[] songLibrary;
   
   public MyPod()
   {
       color = "red";
       memoryCapacity = "6 GB";
       songLibrary = new String[] {"Ace of Spades" , "Fair Weather Fans" , "Under Pressure"};
   }//end zero - constructor MyPod
   
   public MyPod(String color, String memoryCapacity, String[] songLibrary)
   {
       this.color = color;
       this.memoryCapacity = memoryCapacity;
       this.songLibrary = new String[3];
   }//end multi-constructor MyPod
   
   public String toString()
   {
       String output = String.format("MyPod Stats \n" +
                                     "color : %s \n" +
                                     "memory ; %s \n" +
                                     "songs: " ,color, memoryCapacity);
       return output;  
   }//end toString method
}// end class MyPod
