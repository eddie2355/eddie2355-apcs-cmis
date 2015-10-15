import java.util.Scanner;
public class TaladorApp
{
    public static void main ( String[] args )
    {
       String command = "";
      
       
       
       System.out.println("Squire:Let us start with a basic maze to practice your movement skills. Are you ready? ");
       
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
       
       Talador  tutorial = new Talador(command, name);
       
       if(confirm.equals("yes"))
       {
           System.out.println(tutorial);
       }
       
    }
}
