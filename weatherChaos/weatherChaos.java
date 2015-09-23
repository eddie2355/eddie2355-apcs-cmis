import javax.swing.JOptionPane;
public class weatherChaos
 {
    public static void main(String[] args)
    {
        String input = JOptionPane.showInputDialog ( "Please enter an Integer between 1 & 31");
        int inputNum=Integer.parseInt(input);
        if(inputNum < 1 || inputNum > 31)
        {
            System.out.println("Sorry that is not a valid input.");
        }
        
        int [] randomNums = new int[inputNum];
        for(int i = 0; i < randomNums.length; i++)
        {
            randomNums[i] = (int) (Math.random() * 200) -100;
        }
        System.out.print("day" + "/t" + "temp" + "/t" + "swing" + "/t" + "Description");
        
        
        
    }
    
    
    
    
}