import java.util.Scanner;
public class DungeonEmu
{
   public static void main( String [] args)
   {
       System.out.println("On your journey to conquer Talador you will first need to understand ");
       System.out.println("how to properly navigate and manipulate your surroundings. For basic ");
       System.out.println("yes or no questions a proper response is either, yes or no. the ");
       System.out.println("answers are sensitive so be wary of your commands.");
       System.out.println(" ");
       System.out.println(" ");
       
       System.out.println( "Brave Hero of Talador. I am sorry but what is thy name?" );
        
       Scanner inputName = new Scanner( System.in );
       String name = inputName.nextLine();
       System.out.println("Ah yes, pardon my memory, " + name +  "." );
       
       System.out.println("'Do you wish to repremand this unworthy forgetful squire and replace him?'");
       Scanner inputRepremand = new Scanner( System.in );
       String repremand = inputRepremand.nextLine();
       
       if(repremand.equals("yes"))
       {
           System.out.println("I.....I...m so sorry....sir.'sniff' I shall fetch a new worthy squire.");
           System.out.println("'A new squire appears'");
           
        }
       System.out.println(" "); 
       System.out.println("Sir, as your loyal squire it is my job to make sure you survive your journey through Talador, and know how to overcome any challenge you face");
       System.out.println("Some basic commands you need to know are: attack / interact / forward");
       System.out.println(" left / right / back . These are your basic commands and they do exactly");
       System.out.println(" as what the command suggests. "); 
       System.out.println(" ");
       System.out.println("Let us start with a basic maze to practice your movement skills. Are you ready? ");
       
       Scanner inputConfirm = new Scanner( System.in );
       String confirm = inputConfirm.nextLine();
       if(confirm.equals("yes"))
       {
           System.out.println("'A flash happens and you are now in a room with one hallway ahead. What will you do? ");
           System.out.println(" ");
           System.out.println("'In a situation like this you have the options to go forward, left, right, or back.");
           System.out.println(" It would be best to move forward since it is the only way, if you make an invalid");
           System.out.println(" move then a warning message will be printed out to you. Try moving forward");
           System.out.println(" by typing forward'");
           Scanner inputMove = new Scanner( System.in );
           String move = inputMove.nextLine();
       
        }
       else
       {
           System.out.println("Well I guess we shall wait here for eternity. 'sigh'");
           return;
        }
       
       
       
       
       int[] randArray = new int[10];
        for(int index = 0;index < randArray.length; index++)
        {
            
        }  
 
} 
}
