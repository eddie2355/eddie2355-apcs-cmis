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
            randomNums[i] = (int) (Math.random() * 200) - 100;
        }
        System.out.println("day" + "\t" + "temp" + "\t" + "swing " + "\t" + "Description");
        
        String descript = "" ;
        for(;;)
        {
            if (randomNums[0] < 0)
            {
                descript = "freezing";
            }
            else if(randomNums[0] >= 0 && randomNums[0] <= 15)
            {
                descript = "chilly";
            }
            else if(randomNums[0] >= 16 && randomNums[0] <= 30)
            {
                descript = "comfortable";
            }
            else if(randomNums[0] >= 31  && randomNums[0] <= 40)
            {
                descript = "hot";
            }
            else if(randomNums[0] >= 41)
            {
                descript = "AAAAAAUUUUUUGGHHHHHH!";
            }
            int swing = 0;
            int day = 1;
            System.out.println(day + "\t" + randomNums[0] + "\t" + swing + descript );
            
        }
        int newI = 0;
        while( newI < randomNums.length)
        {
            int iNew = newI + 1;
            if (randomNums[iNew] < 0)
            {
                descript = "freezing";
            }
            else if(randomNums[iNew] >= 0 && randomNums[iNew] <= 15)
            {
                descript = "chilly";
            }
            else if(randomNums[iNew] >= 16 && randomNums[iNew] <= 30)
            {
                descript = "comfortable";
            }
            else if(randomNums[iNew] >= 31  && randomNums[iNew] <= 40)
            {
                descript = "hot";
            }
            else if(randomNums[iNew] >= 41)
            {
                descript = "AAAAAAUUUUUUGGHHHHHH!";
            }
            int swing = randomNums[iNew] - randomNums[newI];
            System.out.println(iNew + "\t" + randomNums[iNew] + "\t" + swing + descript );
            newI++;
        }
        
        
        
    }
    
    
    
    
}