import java.util.Scanner;
public class DungeonEmu
{
   public static void main( String [] args)
   {
       System.out.println("'On your journey to conquer Talador you will first need to understand ");
       System.out.println("how to properly navigate and manipulate your surroundings. For basic ");
       System.out.println("yes or no questions a proper response is either, yes or no. the ");
       System.out.println("answers are sensitive so be wary of your commands.'");
       System.out.println(" ");
       System.out.println(" ");
       
       System.out.println( "Squire:Brave Hero of Talador. I am sorry but what is thy name?" );
        
       Scanner inputName = new Scanner( System.in );
       String name = inputName.nextLine();
       System.out.println("Squire:Ah yes, pardon my memory, " + name +  "." );
       
       System.out.println("'Do you wish to repremand this unworthy forgetful squire and replace him?'");
       Scanner inputRepremand = new Scanner( System.in );
       String repremand = inputRepremand.nextLine();
       
       if(repremand.equals("yes"))
       {
           System.out.println("Squire:I.....I...m so sorry....sir.'sniff' I shall fetch a new worthy squire.");
           System.out.println("'A new squire appears'");
           
        }
       System.out.println(" "); 
       System.out.println("Squire:Sir, as your loyal squire it is my job to make sure you survive your journey "); 
       System.out.println("through Talador, and know how to overcome any challenge you face");
       System.out.println("'Some basic commands you need to know are: attack / interact / forward");
       System.out.println(" left / right / back . These are your basic commands and they do exactly");
       System.out.println(" as what the command suggests. '"); 
       System.out.println(" ");
       System.out.println("Squire:Let us start with a basic maze to practice your movement skills. Are you ready? ");
       
       Scanner inputConfirm = new Scanner( System.in );
       String confirm = inputConfirm.nextLine();
       if(confirm.equals("yes"))
       {
           System.out.println("'A flash happens and you are now in a room with one hallway ahead. What will you do? '");
           System.out.println(" ");
           System.out.println("Squire:In a situation like this you have the options to go forward, left, right, or back.");
           System.out.println(" 'It would be best to move forward since it is the only way, if you make an invalid");
           System.out.println(" move then a warning message will be printed out to you, and you will have to restart"); 
           System.out.println(" your journey. Yeah we are hardcore like that. Try typing forward.");
           System.out.println(" by typing forward'");
           Scanner inputMove = new Scanner( System.in );
           String move = inputMove.nextLine();
           if(move.equals("forward"))
           {
               System.out.println(" ");
               System.out.println("'You walk forward and are now in a room with two doors on the left and right side.' ");
               System.out.println(" ");
               System.out.println("Squire:Good job sir. You made it into the next room. It seems there are two doors you can through.");
               System.out.println("Which will you take, left or right? ");
               Scanner inputChoice = new Scanner(System.in);
               String choice = inputChoice.nextLine();
               
               if(choice.equals("left"))
               {
                   System.out.println(" ");
                   System.out.println(" Squire:Ah good choice sir, but uhhhh it seems we are in some trouble. 'shrieks'");
                   System.out.println("'You here a growl and see a shadow dart across the room. Oh god. Its a giant spider. ");
                   System.out.println(" Save you and your squire, attack it by typing attack");
                   Scanner inputAttack = new Scanner(System.in);
                   String attack = inputAttack.nextLine();
                   System.out.println(" ");
                   for(attack.equals("attack"); ;)
                   {
                       System.out.println("Squire:How....but...wow you truly are amazing " + name);
                       System.out.println(" You slayed that spider with ease. I guess lets go back and check out that other room.");
                       System.out.println(" ");
                       System.out.println(" ");
                       System.out.println("'The way the battle system works in Talador is that everytime you attack and enemy, a die ");
                       System.out.println(" is rolled and a number between 1 - 6 comes up. To kill an enemy you must do more than 2 damage");
                       System.out.println(" or in other words, roll 3,4,5,or 6. If you do not roll 3 or more then you take 1 damage. ");
                       System.out.println(" some enemies are stronger and will cause you to take more damage, but that comes later.");
                       System.out.println(" You have been doing well so far. You are going to be teleported bck to the second hallway");
                       return;
                    }
                }
            }
            else
            {
                System.out.println(" ");
                System.out.println(" Sorry, but you can't do that right now");
            }
       
        }
       else
       {
           System.out.println("Well I guess we shall wait here for eternity. 'sigh'");
           return;
        }
       
       
       
       
       //int[] bag = new int[10];
        //for(int index = 0;index < bag.length; index++)
        //{
            
       // }  
 
} 
}
